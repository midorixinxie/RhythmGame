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

/**
 *
 * @author Moe-MAC
 */
public class Parts {
   private String name, description;
   private int ID, cost;
   private int stockLevel = 0;
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
   
   public void addPart(String name, String desc, int cost){
        
        Database db = new Database();
        db.connect();

        try {                
                Statement statement;
                incStockLevel();
                String query = "INSERT INTO PartsRecord VALUES ('"+name+"', '"+desc+"','"+stockLevel+"','"+cost+"');";
                //System.out.println("Query :" + query);
                statement = db.getConnection().createStatement();
                statement.setQueryTimeout(10);
                
                //statement.executeUpdate("drop table if exists 'VehicleRecords'");
                		

                statement.executeUpdate(query);

                ResultSet vr = statement.executeQuery("select * from 'PartsRecord'");

		System.out.println("PartID PartName PartDesc");
		while(vr.next()){
			System.out.println(vr.getInt("ID")+"	   "+vr.getString("Name")+"	        "+vr.getString("Description"));
		}
                System.out.println("Successfully inserted Part");

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
   
   public void incStockLevel(){
       stockLevel++;
   }
   
   public void decStockLevel(){
       stockLevel--;
   }
}


