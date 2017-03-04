/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagRep.logic;

/**
 *
 * @author Jonathan
 */

import common.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.time.*;

public class BookingQueries 
{
    private Integer BookingID, CustomerID, TotalCostPerBooking;
    private LocalDate NextBooking, PastBooking, FutureBooking;
    private Boolean DiagnosticAndRepair, ScheduledMaintenance;
    private final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    public Integer getBookingID()
    {
        return BookingID;
    }        
    
    public LocalDate getNextBooking()
    {
        return NextBooking;
    }        
    
    public LocalDate getPastBooking()
    {
        return PastBooking;
    }    
    
    public LocalDate getFutureBooking()
    {
        return FutureBooking;
    }        
    
    public Boolean getDiagnosticAndRepair()
    {
        return DiagnosticAndRepair;
    }        
    
    public Boolean getScheduledMaintenance()
    {
        return ScheduledMaintenance;
    }  
    
    public Integer getTotalCostPerBooking()
    {
        return TotalCostPerBooking;
    }        
    
    public Integer getCustomerID()
    {
        return CustomerID;
    }        
    

    public static void addBooking(Integer BookingID, LocalDate NextBooking, LocalDate PastBooking, LocalDate FutureBooking, Boolean DiagnosticAndRepair, Boolean ScheduledMaintenance, Integer TotalCostPerBooking, Integer CustomerID)
    {
        Database db = new Database();
        db.connect();
        
        try
        {
            Statement statement;
            
            String query = "INSERT INTO Booking VALUES ('"+BookingID+"', '"+NextBooking+"', '"+PastBooking+"', '"+FutureBooking+"', '"+DiagnosticAndRepair+"', '"+ScheduledMaintenance+"','"+TotalCostPerBooking+"', '"+CustomerID+"'};";
        
            statement = db.getConnection().createStatement();
            statement.setQueryTimeout(10);
            
            statement.executeUpdate("create table if not exists 'Booking' ('ID' INTEGER PRIMARY KEY, 'nextBooking'DATE, 'DiagnosticAndRepair'BOOLEAN, 'ScheduledMaintenance'BOOLEAN, 'TotalCostPerBooking'INTEGER,'customerID'INTEGER, FOREIGN KEY(customerID) REFERENCES CustomerAccount(ID))");
            statement.executeUpdate(query);
            
            ResultSet book = statement.executeQuery("select * from 'Booking'");
            
            System.out.println("BookingID, CustomerID, TotalCostPerBooking");
            while(book.next())
            {
                System.out.println(book.getInt("BookingID")+" "+book.getInt("CustomerID")+" "+book.getInt("TotalCostPerBooking"));
            }   
            
            System.out.println("Booking has been added");
        }   
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }        
    }
    
}
