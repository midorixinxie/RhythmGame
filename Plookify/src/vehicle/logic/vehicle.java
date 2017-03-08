/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.logic;

import common.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import vehicle.gui.vehicleEdit;

/**
 *
 * @author MichelleY
 */
public class vehicle {
    
    private String type, regNo, make, model, engineSize, fuelType, colour;
    private String compName, compAddress;
    private Boolean warrantyType, requiresDandR, compPays ;
    private Calendar warrantyExpiry,MoTRenewalDate, lastServiceDate;
    private final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
  
    /**public vehicle(String vehicleType,String regNo,String make,String model,String engineSize,String fuelType,String colour){
       this.type = vehicleType;
       this.regNo = regNo;
       this.make = make;
       this.model = model;
       this.engineSize = engineSize;
       this.fuelType = fuelType;
       this.colour = colour;
   }**/
   
   public String getType(){
       return type;
   }
   
   public String getRegNo()
   {
       return regNo;   
   }
   
   public String getMake()
     {
       return make;   
   }
   
   public String getModel()
   {
       return model;   
   }
   
   public String getEngineSize()
   {
       return engineSize;   
   }
   
   public String getFuelType()
   {
       return fuelType;   
   }
   
   public String getColour()
   {
       return colour;   
   }
   
    //compName, compAddress;
    //warrantyType, requiresDandR, compPays ;
    //warrantyExpiry,MoTRenewalDate, lastServiceDate;
    
    public static void addVehicle(String ID, String vehicle, String regNo, String  model, String make, String engineSize, String fuelType, String colour, String MoTRenewalDate, String lastServiceDate, String currentMileage, Boolean warrantyType, String compName, String compAddress, String warrantyExpiry) {
        Database db = new Database();
        db.connect();
        
        int customerID = Integer.parseInt(ID);
                
        Boolean requireDandR = false;
        Boolean compPays = false;
        
        if(warrantyType)
        {
            requireDandR = true;
            compPays = true;
        }
        else
        {
            compName = null;
            compAddress = null;
            warrantyExpiry = null;
        }
        try {                
                Statement statement;
                
                String query = "INSERT INTO VehicleRecords VALUES ('"+customerID+"', '"+warrantyType+"','"+requireDandR+"','"+compPays+"','"+compName+"','"+compAddress+"','"+warrantyExpiry+"','"+vehicle+"','"+regNo+"','"+model+"','"+make+"','"+engineSize+"','"+fuelType+"','"+colour+"','"+MoTRenewalDate+"','"+lastServiceDate+"','"+currentMileage+"',1);";
                //System.out.println("Query :" + query);
                statement = db.getConnection().createStatement();
                statement.setQueryTimeout(10);
                
                //statement.executeUpdate("drop table if exists 'VehicleRecords'");
                statement.executeUpdate("create table if not exists 'VehicleRecords' ('CustomerID' INTEGER NOT NULL,'WarrantyType' BOOLEAN,'RequiresDiagnosisAndRepair' BOOLEAN, 'WarrantyCompanyPays' BOOLEAN,'CompanyName' TEXT,'CompanyAddress' TEXT,'WarrantyExpiry' DATE,'RegistrationNumber' TEXT PRIMARY KEY,'Model' TEXT,'Make' TEXT,'EngineSize' TEXT,'FuelType' TEXT,'Colour' TEXT,'MoTRenewalDate' DATE,'LastServiceDate'DATE,'CurrentMileage'INTEGER,'ListOfPartsUsed'TEXT, FOREIGN KEY(customerID) REFERENCES CustomerAccount(ID))");			

                statement.executeUpdate(query);

                //ResultSet rs = statement.executeQuery("select * from 'test'");
                ResultSet vr = statement.executeQuery("select * from 'VehicleRecords'");

		System.out.println("CustomerID Model  Registration Number");
		while(vr.next()){
			System.out.println(vr.getInt("CustomerID")+"	   "+vr.getString("Model")+"	        "+vr.getString("RegistrationNumber"));
		}
                //rs.close();
                System.out.println("Successfully inserted Vehicle");

                vr.close();
        }
	catch (SQLException ex) {
            System.err.println(ex.getMessage());
	}
        db.closeConn();
    }
    
    public static void quickAddVehicle(String ID, String vehicle, String regNo, String  quickFormat, String colour, String MoTRenewalDate, String lastServiceDate, String currentMileage, Boolean warrantyType, String compName, String compAddress, String warrantyExpiry) {
        Database db = new Database();
        db.connect();
        
        int customerID = Integer.parseInt(ID);
        
        String[] splitFormat = quickFormat.split(" ");
        String make = splitFormat[0];
        String model = splitFormat[1];
        String engineSize = splitFormat[2];    
        String fuelType = splitFormat[3];
        
        Boolean requireDandR = false;
        Boolean compPays = false;
        
        if(warrantyType)
        {
            requireDandR = true;
            compPays = true;
        }
        else
        {
            compName = null;
            compAddress = null;
            warrantyExpiry = null;
        }
        try {                
                Statement statement;
                
                String query = "INSERT INTO VehicleRecords VALUES ('"+customerID+"', '"+warrantyType+"','"+requireDandR+"','"+compPays+"','"+compName+"','"+compAddress+"','"+warrantyExpiry+"','"+vehicle+"','"+regNo+"','"+model+"','"+make+"','"+engineSize+"','"+fuelType+"','"+colour+"','"+MoTRenewalDate+"','"+lastServiceDate+"','"+currentMileage+"',1);";
                //System.out.println("Query :" + query);
                statement = db.getConnection().createStatement();
                statement.setQueryTimeout(10);
                
                //statement.executeUpdate("drop table if exists 'VehicleRecords'");
                statement.executeUpdate("create table if not exists 'VehicleRecords' ('CustomerID' INTEGER NOT NULL,'WarrantyType' BOOLEAN,'RequiresDiagnosisAndRepair' BOOLEAN, 'WarrantyCompanyPays' BOOLEAN,'CompanyName' TEXT,'CompanyAddress' TEXT,'WarrantyExpiry' DATE,'RegistrationNumber' TEXT PRIMARY KEY,'Model' TEXT,'Make' TEXT,'EngineSize' TEXT,'FuelType' TEXT,'Colour' TEXT,'MoTRenewalDate' DATE,'LastServiceDate'DATE,'CurrentMileage'INTEGER,'ListOfPartsUsed'TEXT, FOREIGN KEY(customerID) REFERENCES CustomerAccount(ID))");			

                statement.executeUpdate(query);

                //ResultSet rs = statement.executeQuery("select * from 'test'");
                ResultSet vr = statement.executeQuery("select * from 'VehicleRecords'");

		System.out.println("CustomerID Model  Registration Number");
		while(vr.next()){
			System.out.println(vr.getInt("CustomerID")+"	   "+vr.getString("Model")+"	        "+vr.getString("RegistrationNumber"));
		}
                //rs.close();
                System.out.println("Successfully inserted Vehicle");

                vr.close();
        }
	catch (SQLException ex) {
            System.err.println(ex.getMessage());
	}
        db.closeConn();
    }
        
    public static void editVehicle(JTable table){
        int selectedRowIndex = table.getSelectedRow();
        
       String custId = (String) table.getModel().getValueAt(selectedRowIndex, 0);
       String warrantyType = (String) table.getModel().getValueAt(selectedRowIndex, 1);
       Boolean requiresDandR = (Boolean) table.getModel().getValueAt(selectedRowIndex, 2);
       Boolean compPays = (Boolean) table.getModel().getValueAt(selectedRowIndex, 3);
       String compName = (String) table.getModel().getValueAt(selectedRowIndex, 4);
       String compAddress = (String) table.getModel().getValueAt(selectedRowIndex, 5);
       String warrantyExpiry = (String) table.getModel().getValueAt(selectedRowIndex, 6);
       String vehicleType = (String) table.getModel().getValueAt(selectedRowIndex, 7);
       String regNo = (String) table.getModel().getValueAt(selectedRowIndex, 8);
       String model = (String) table.getModel().getValueAt(selectedRowIndex, 9);
       String make = (String) table.getModel().getValueAt(selectedRowIndex, 10);
       String engineSize = (String) table.getModel().getValueAt(selectedRowIndex, 11);
       String fuelType = (String) table.getModel().getValueAt(selectedRowIndex, 12);
       String colour = (String) table.getModel().getValueAt(selectedRowIndex, 13);
       String MoTRenewalDate = (String) table.getModel().getValueAt(selectedRowIndex, 14);
       String lastService = (String) table.getModel().getValueAt(selectedRowIndex, 15);
       String currentMileage = (String) table.getModel().getValueAt(selectedRowIndex, 16);
       String listOfPartsUsed = (String) table.getModel().getValueAt(selectedRowIndex, 17);
        
       vehicleEdit edV = new vehicleEdit();
       edV.setText(
               custId,
               warrantyType,
               requiresDandR,
               compPays,
               compName,
               compAddress,
               warrantyExpiry,
               vehicleType,
               regNo,
               model,
               make,
               engineSize,
               fuelType,
               colour,
               MoTRenewalDate,
               lastService,
               currentMileage,
               listOfPartsUsed
               ); 
       //edV.setVisible(true);
    
    }
    
    public static void deleteVehicle(JTable table) {
        
        int selectedRowIndex = table.getSelectedRow();
        String regNo = (String) table.getModel().getValueAt(selectedRowIndex, 8);
        
        String q = "DELETE FROM vehicleRecords WHERE registrationNumber = '"+regNo+"';";
        System.out.println("Query :" + q);
        
        Database db = new Database();
        db.connect();
        
        try {                
                Statement statement;
                
                statement = db.getConnection().createStatement();
                statement.setQueryTimeout(10);

                statement.executeQuery(q);
               
        }
	catch (SQLException ex) {
            System.err.println(ex.getMessage());
	}
        db.closeConn();
    
    }
        
    public static void searchVehicle(JTable table,String option, String input) {
        Database db = new Database();
        db.connect();
        
        if(option.equals("Registration Number"))
            option = "RegistrationNumber";
        else
            option = "Make";
                
        try {                
                Statement statement;
                
                statement = db.getConnection().createStatement();
                statement.setQueryTimeout(10);

                String q = "select * from VehicleRecords WHERE "+option+" like '"+ input+ "%';";
                System.out.println("Query :" + q);
                ResultSet vr = statement.executeQuery(q);

		/**System.out.println("CustomerID Model  Registration Number");
		while(vr.next()){
			System.out.println(vr.getInt("CustomerID")+"	   "+vr.getString("Model")+"	        "+vr.getString("RegistrationNumber"));
		}**/
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
}
