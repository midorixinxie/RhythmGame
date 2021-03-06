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
   public void withdrawPart(int partID, String instDate, String wExpDate, String regNum, int custID){
       Database db = new Database();
        db.connect();
        
        try {                
            Statement statement;
                
            String query = "UPDATE   PartsRecord SET DateOfInstallation ='"+instDate+"',WarrantyExpiryDate = '"+wExpDate+"',RegistrationNumber = '"+regNum+"',CustomerID = '"+custID+"' WHERE ID = '"+partID+"' ";

            System.out.println("Query :" + query);
            statement = db.getConnection().createStatement();
            decStockLevel(db);
            statement.setQueryTimeout(10);
                
            statement.executeUpdate(query);
            
            ResultSet vr = statement.executeQuery("select * from 'PartsRecord'");
            JOptionPane.showMessageDialog(null,"Successfully withdrew Part for repair");
            //closes result set
            vr.close();
        }
	catch (SQLException ex) {
            System.err.println(ex.getMessage());
	}
        //closes database connection
        db.closeConn();
   }
   public int genID(){    
      return (int) (Math.random()*5000);
   }
   
   public void editPart(int partID, String name, String desc,  int cost, String instDate, String wExpDate){
       Database db = new Database();
        db.connect();
        try {                
            Statement statement;
                
            String query = "UPDATE   PartsRecord SET Name ='"+name+"',Description = '"+desc+"',Cost ='"+cost+"',DateOfInstallation = '"+instDate+"' ,WarrantyExpiryDate = '"+wExpDate+"' WHERE ID = '"+partID+"' ";

            System.out.println("Query :" + query);
            statement = db.getConnection().createStatement();
            statement.setQueryTimeout(10);
                
            statement.executeUpdate(query);
            
            ResultSet vr = statement.executeQuery("select * from 'PartsRecord'");
            JOptionPane.showMessageDialog(null,"Successfully edited Part");
            //closes result set
            vr.close();
        }
	catch (SQLException ex) {
            System.err.println(ex.getMessage());
	}
        //closes database connection
        db.closeConn();
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
   
   
   public void deletePart(JTable table){
        int selectedRowIndex = table.getSelectedRow();
        int partID =   (int) table.getModel().getValueAt(selectedRowIndex, 0);
        String name = (String) table.getModel().getValueAt(selectedRowIndex, 1);
        this.name=name;
        //confirmation that user wants to delete the part
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this part ?", "Delete", JOptionPane.YES_NO_CANCEL_OPTION);
        if(p==0) {
            String q = "DELETE FROM PartsRecord WHERE ID = '"+partID+"';";
            System.out.println("Query :" + q);

            Database db = new Database();
            db.connect();

            try {                
                    Statement statement;
                    statement = db.getConnection().createStatement();
                    decStockLevel(db);
                    statement.setQueryTimeout(10);

                    statement.executeQuery(q);
                    JOptionPane.showMessageDialog(null, "Part with ID " + partID + " has been deleted from the system");
            }
            catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            db.closeConn();
        }
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
                
            String query = "UPDATE PartsRecord SET NumberInStock =NumberInStock + 1 WHERE Name = '"+name+"'";

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

    public int getCustID(String regNum) {
        int custID=0;
         try {
            
            Database db = new Database();
            db.connect();
            String query = "SELECT CustomerID FROM VehicleRecords WHERE RegistrationNumber='"+regNum+"' LIMIT 1;";
            Statement statement;

            statement = db.getConnection().createStatement();
            statement.setQueryTimeout(10);

            System.out.println("Query :" + query);
            ResultSet vr = statement.executeQuery(query);
         
            while(vr.next()){
                custID= vr.getInt("CustomerID");
            }
            vr.close();
            }
               catch(Exception e) {
                  JOptionPane.showMessageDialog(null, "error");
            }
            return custID;

    }
}


