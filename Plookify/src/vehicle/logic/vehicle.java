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

/**
 *
 * @author MichelleY
 */
public class vehicle {
    
    public static void addVehicle(String vehicle, String regNo, String  model, String make, String engineSize, String fuelType, String colour, String MoTRenewalDate, String lastServiceDate, String currentMileage, Boolean warrantyType, String compName, String compAddress, String warrantyExpiry) {
        Database db = new Database();
        db.connect();
        
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
                
                String query = "INSERT INTO VehicleRecords VALUES (1, '"+warrantyType+"','"+requireDandR+"','"+compPays+"','"+compName+"','"+compAddress+"','"+warrantyExpiry+"','"+vehicle+"','"+regNo+"','"+model+"','"+make+"','"+engineSize+"','"+fuelType+"','"+colour+"','"+MoTRenewalDate+"','"+lastServiceDate+"','"+currentMileage+"',1);";
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
    
    public static void editVehicle(String vehicle, String regNo, String  model, String make, String engineSize, String fuelType, String colour, String MoTRenewalDate, String lastServiceDate, String currentMileage, Boolean warrantyType, String compName, String compAddress, String warrantyExpiry) {
        
    
    }
    
    public static void deleteVehicle(String vehicle, String regNo, String  model, String make, String engineSize, String fuelType, String colour, String MoTRenewalDate, String lastServiceDate, String currentMileage, Boolean warrantyType, String compName, String compAddress, String warrantyExpiry) {
        
    
    }
    
    public static void searchVehicleByRegNo(String vehicle, String regNo, String  model, String make, String engineSize, String fuelType, String colour, String MoTRenewalDate, String lastServiceDate, String currentMileage, Boolean warrantyType, String compName, String compAddress, String warrantyExpiry) {
        
    
    }
    
    public static void searchVehicleByManu(String vehicle, String regNo, String  model, String make, String engineSize, String fuelType, String colour, String MoTRenewalDate, String lastServiceDate, String currentMileage, Boolean warrantyType, String compName, String compAddress, String warrantyExpiry) {
        
    
    }
}
