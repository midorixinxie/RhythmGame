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
        /**finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }**/
    }
    public static void getdata() {
        Statement statement;
		try {
			statement = conn.createStatement();
			statement.setQueryTimeout(10);
			statement.executeUpdate("drop table if exists `test`");
			statement.executeUpdate("create table `test` (`id` integer, `name` string)");
			statement.executeUpdate("insert into `test` values('1', 'test 1')");
			statement.executeUpdate("insert into `test` values('2', 'test 2')");

			ResultSet rs = statement.executeQuery("select * from `test`");

			System.out.println("id	name");
			while(rs.next()){
				System.out.println(rs.getInt("id")+"	"+rs.getString("name"));
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
