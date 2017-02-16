/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.JDBC;

/**
 *
 * @author MichelleY
 */
public class database {
    
    private static Connection conn = null;
    
     public static void connect() {
        try {
            // db parameters
            String url = "jdbc:sqlite:test.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 

    }
    public static void getdata() {
        Statement statement;
		try {
			statement = conn.createStatement();
			statement.setQueryTimeout(10);
			statement.executeUpdate("drop table if exists 'test'");
			statement.executeUpdate("create table 'test' ('CustomerID' INTEGER NOT NULL,'WarrantyType'BOOLEAN,'RequiresDiagnosisAndRepair'	BOOLEAN, 'WarrantyCompanyPays'	INTEGER,'CompanyName'	TEXT,'CompanyAddress'	TEXT,'WarrantyExpiry'	DATE,'RegistrationNumber' TEXT PRIMARY KEY,'Model' TEXT,'Make' TEXT,'EngineSize' TEXT,'FuelType' TEXT,'Colour'	TEXT,'MoTRenewalDate'INTEGER,'LastServiceDate'INTEGER,'CurrentMileage'INTEGER,'ListOfPartsUsed'TEXT, FOREIGN KEY(customerID) REFERENCES CustomerAccount(ID))");
			statement.executeUpdate("insert into 'test' values(1,'N',NULL,NULL,NULL,NULL,NULL,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL)");
			statement.executeUpdate("insert into 'test' values(2,'Y',NULL,NULL,NULL,NULL,NULL,2,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL)");

			ResultSet rs = statement.executeQuery("select * from 'test'");

			System.out.println("CustomerID Model");
			while(rs.next()){
				System.out.println(rs.getInt("CustomerID")+"	   "+rs.getString("Model"));
			}
		}
		catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		finally {
			if (conn != null){
				try{
					conn.close();
				}
				catch(SQLException ex){
					System.err.println(ex.getMessage());
				}
			}
		}
	}
        	private static final database INSTANCE = new database();

	public static database getInstance() {
		return INSTANCE;
	}

	public Connection getConnection(){
		return this.conn;
	}
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
        getdata();
    }
    
}
