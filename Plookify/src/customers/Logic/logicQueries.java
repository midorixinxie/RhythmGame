
package customers.Logic;

import common.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class logicQueries {
    
    public static void getdata() {
        Database db = new Database();
        db.connect();
        Statement statement;
        try {
			statement = db.getConnection().createStatement();
			statement.setQueryTimeout(10);
			//statement.executeUpdate("drop table if exists 'test'");
			
	
                      statement.executeUpdate("create table if not exists 'TESTING' (`Forename` TEXT, `Surname` TEXT, `Address` TEXT, `Postcode` TEXT, `Phone` TEXT, `Email address` TEXT, `ID` INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, `CustomerType` TEXT, `NumberOfBookings` INTEGER NOT NULL, `NumberOfBills` INTEGER NOT NULL, `TotalCost` INTEGER NOT NULL, `WarrantyStatus` BOOLEAN NOT NULL)");

			//statement.executeUpdate("insert into 'test' values(1,'N',NULL,NULL,NULL,NULL,NULL,'DRZ 7487',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL)");
			//statement.executeUpdate("insert into 'test' values(2,'Y',NULL,NULL,NULL,NULL,NULL,'YR06 REG',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL)");

			ResultSet rs = statement.executeQuery("select * from 'TESTING'");
                        ResultSet vr = statement.executeQuery("select * from 'CustomerAccount'");

			System.out.println("CustomerID Forename  Surname");
			while(vr.next()){
				System.out.println(vr.getInt("ID")+"	   "+vr.getString("Forename")+"   "+vr.getString("Surname"));
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
