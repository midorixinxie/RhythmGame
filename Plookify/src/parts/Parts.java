/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parts;

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
   private int stockLevel = 10;
   private Calendar installationDate, warrantyExpiry;
   private final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
   public Parts(String name, String description, int cost){
       this.name = name;
       this.description = description;
       this.cost = cost;
       
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
        Parts newPart = new Parts(name,desc,cost);
        
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

