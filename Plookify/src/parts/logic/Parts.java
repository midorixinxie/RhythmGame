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
import javax.swing.JOptionPane;

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
   
   public void deletePart(Parts part){
       
   }
   
   public void searchByName(String name){
       
   }
   
   public void searchByRegNum(String regNumber){
       
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
}


