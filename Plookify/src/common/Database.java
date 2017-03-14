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
public class Database {
    
    private static Connection conn = null;
    
     public  void connect() {
        try {
            // db parameters
            
            //String url = "jdbc:sqlite:Master/Documents/Database.db";
            String url = "jdbc:sqlite:../SEProject16/Master/Documents/Database.db";


            // create a connection to the Database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 

    }
        	private static final Database INSTANCE = new Database();

	public static Database getInstance() {
		return INSTANCE;
	}

	public Connection getConnection(){
		return this.conn;
	}
        
        public void closeConn(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    

    /**
     * @param args the command line arguments
     */

    
}
