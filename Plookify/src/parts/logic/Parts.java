 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parts.logic;

import common.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moe-MAC
 */
public class Parts {
   private String name, description;
   private int ID, cost;
   private int stockLevel;
   private Calendar installationDate, warrantyExpiry;
   private final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
   
   public Parts(){
       
   }
   
   public int getID(){
       return ID;
   }
   
   public Calendar getInstDate(){
       return installationDate;
   }
   
   public Calendar getWarrExpDate(){
       return warrantyExpiry;
   }
   
   public void setInstDate(Calendar date){      
       date = Calendar.getInstance();     
       installationDate = date;    
   }
   
   public void setWarrExpDate(){
       
       
   }
   
   public String getName(){
       return name;
   }
   
   public String getDesc(){
       return description;
   }
   
   public int getCost(){
       return cost;
   }
   
   public int getStockLvl(){
       
       return stockLevel;
   }
   public void withdrawPart(){
       
   }
   public int genID(){    
      return (int) (Math.random()*5000);
   }
   
   public void editPart(int partID, String name, String desc, int stklvl, int cost, String instDate, String expDate, String regNum, int custID){
       
   }
   public void addPart(String name, String desc, int cost){
        this.name= name;
        Database db = new Database();
        db.connect();

        try {                
                Statement statement;
                
                statement = db.getConnection().createStatement();
                incStockLevel(db);
                ResultSet num = statement.executeQuery("SELECT NumberInStock FROM PartsRecord WHERE Name='"+name+"' LIMIT 1");
                int numInStock = num.getInt("NumberInStock");
                stockLevel = numInStock;
                String query = "INSERT INTO PartsRecord VALUES ('"+genID()+"', '"+name+"', '"+desc+"','"+numInStock+"','"+cost+"','"+"','"+"','"+"','"+"');";
                //System.out.println("Query :" + query);
                
                statement.setQueryTimeout(10);
       
                statement.executeUpdate(query);
                
                ResultSet vr = statement.executeQuery("select * from 'PartsRecord'");

		System.out.println("PartID	    PartName 	          PartDesc                              NumberInStock   ");
		while(vr.next()){
			System.out.println(vr.getInt("ID")+"	   "+vr.getString("Name")+"	        "+vr.getString("Description")+"            "+vr.getInt("NumberInStock"));
		}
                
                JOptionPane.showMessageDialog(null, "Record successfully added!!");

                vr.close();
        }
	catch (SQLException ex) {
            System.err.println(ex.getMessage());
	}
        db.closeConn();
    }
        
   
   
   public List<Parts> getPartsUsed(){
       return null;       
   }
   
   public void editPart(Parts part){
       
   }
   
   public void deletePart(JTable table){
       
   }
   
   public static void searchParts(JTable table, String option, String input) 
    {
        Database db = new Database();
        db.connect();
        System.out.println(option);
                
        try {                
            Statement statement;    
            statement = db.getConnection().createStatement();
            statement.setQueryTimeout(10);
            
            String q = "";
            if(option.equals("Registration Number")){
                q= "SELECT * from PartsRecord WHERE RegistrationNumber like '"+ input+ "%';";
            }
            else{
                q= "SELECT PartsRecord.* from PartsRecord INNER JOIN CustomerAccount ON PartsRecord.CustomerID=CustomerAccount.ID WHERE Forename like '"+ input+ "%' OR Surname like '"+ input+ "%';";
            }
            System.out.println("Query :" + q);
            ResultSet vr = statement.executeQuery(q);

            //prints out data into the Jtable
            while(table.getRowCount()>0)
            {
                ((DefaultTableModel)table.getModel()).removeRow(0);
            }
            int columns = vr.getMetaData().getColumnCount();
            while(vr.next())
            {
                Object[] row = new Object[columns];
                for (int i=1; i<=columns; i++)
                {
                   row[i-1] = vr.getObject(i);
                }
                ((DefaultTableModel)table.getModel()).insertRow(vr.getRow()-1,row);
            }
            vr.close();
            
        }
	catch (SQLException ex) {
            System.err.println(ex.getMessage());
	}
        db.closeConn();  
    }
   
   public void incStockLevel(Database db){  
       try {                
            Statement statement;
                
            String query = "UPDATE   PartsRecord SET NumberInStock =NumberInStock + 1 WHERE Name = '"+name+"' ";

            System.out.println("Query :" + query);
            statement = db.getConnection().createStatement();
            statement.setQueryTimeout(10);
            statement.executeUpdate(query);
       }
            catch (SQLException ex) {
            System.err.println(ex.getMessage());
	}
   
   }
   
   public void decStockLevel(Database db){    
       try {                
            Statement statement;
                
            String query = "UPDATE PartsRecord SET NumberInStock =NumberInStock - 1 WHERE Name = '"+name+"' ";

            System.out.println("Query :" + query);
            statement = db.getConnection().createStatement();
            statement.setQueryTimeout(10);
            statement.executeUpdate(query);
       }
            catch (SQLException ex) {
            System.err.println(ex.getMessage());
	}
        
   }
   
   public static void mouseClick(
        JTable table,
        JTextField partID,
        JTextField name,
        JTextField desc,
        JTextField stklvl,
        JTextField cost,
        JTextField instDate,
        JTextField wExpDate,
        JTextField regNum,
        JTextField custID
        )
     {
        try {
            int selectedRowIndex = table.getSelectedRow();
            String click = (table.getModel().getValueAt(selectedRowIndex,0).toString());

            Database db = new Database();
            db.connect();
            String query = "SELECT * FROM PartsRecord WHERE ID='"+click+"' ;";
            Statement statement;

            statement = db.getConnection().createStatement();
            statement.setQueryTimeout(10);

            System.out.println("Query :" + query);
            ResultSet vr = statement.executeQuery(query);

            partID.setText(click);  
            
            while(vr.next()){
                name.setText(vr.getString("Name"));
                desc.setText(vr.getString("Description"));
                stklvl.setText(Integer.toString(vr.getInt("NumberInStock")));
                cost.setText(Integer.toString(vr.getInt("Cost")));
                instDate.setText(vr.getString("DateOfInstallation"));
                wExpDate.setText(vr.getString("WarrantyExpiryDate"));
                regNum.setText(vr.getString("RegistrationNumber"));
                custID.setText(vr.getString("CustomerID"));
            }
            vr.close();
            }
               catch(Exception e) {
                  JOptionPane.showMessageDialog(null, "error");
            }
        
     }
}


