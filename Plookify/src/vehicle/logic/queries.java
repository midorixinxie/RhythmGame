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
public class queries {

    public static void getdata() {
        Database db = new Database();
        db.connect();
        Statement statement;
        try {
			statement = db.getConnection().createStatement();
			statement.setQueryTimeout(10);
			//statement.executeUpdate("drop table if exists 'test'");
			statement.executeUpdate("create table if not exists 'test' ('CustomerID' INTEGER NOT NULL,'WarrantyType'BOOLEAN,'RequiresDiagnosisAndRepair' BOOLEAN, 'WarrantyCompanyPays' INTEGER,'CompanyName' TEXT,'CompanyAddress'	TEXT,'WarrantyExpiry' DATE,'RegistrationNumber' TEXT PRIMARY KEY,'Model' TEXT,'Make' TEXT,'EngineSize' TEXT,'FuelType' TEXT,'Colour'	TEXT,'MoTRenewalDate'INTEGER,'LastServiceDate'INTEGER,'CurrentMileage'INTEGER,'ListOfPartsUsed'TEXT, FOREIGN KEY(customerID) REFERENCES CustomerAccount(ID))");
			//statement.executeUpdate("insert into 'test' values(1,'N',NULL,NULL,NULL,NULL,NULL,'DRZ 7487',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL)");
			//statement.executeUpdate("insert into 'test' values(2,'Y',NULL,NULL,NULL,NULL,NULL,'YR06 REG',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL)");

			ResultSet rs = statement.executeQuery("select * from 'test'");
                        ResultSet vr = statement.executeQuery("select * from 'VehicleRecords'");

			System.out.println("CustomerID Model  Registration Number");
			while(vr.next()){
				System.out.println(vr.getInt("CustomerID")+"	   "+vr.getString("Model")+"	        "+vr.getString("RegistrationNumber"));
			}
		}
		catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
        db.closeConn();
    }
    
    public static void main(String[] args)
    {
         getdata();   
    }
}

