/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.logic;

import com.sun.istack.internal.logging.Logger;
import common.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

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
            statement = db.getConnection().createStatement();
            statement.setQueryTimeout(10);

            ResultSet ca = statement.executeQuery("SELECT EXISTS(SELECT * FROM CustomerAccount WHERE ID='"+ID+"' );");
            if (ca.next()) {
              boolean found = ca.getBoolean(1);
            if(found){
                String query = "INSERT INTO VehicleRecords VALUES ('"+customerID+"', '"+warrantyType+"','"+requireDandR+"','"+compPays+"','"+compName+"','"+compAddress+"','"+warrantyExpiry+"','"+vehicle+"','"+regNo+"','"+model+"','"+make+"','"+engineSize+"','"+fuelType+"','"+colour+"','"+MoTRenewalDate+"','"+lastServiceDate+"','"+currentMileage+"',null);";
                //System.out.println("Query :" + query);
                statement = db.getConnection().createStatement();
                statement.setQueryTimeout(10);
                
                //statement.executeUpdate("drop table if exists 'VehicleRecords'");
                String create = "create table if not exists 'VehicleRecords' ('CustomerID' INTEGER NOT NULL,'WarrantyType' BOOLEAN,'RequiresDiagnosisAndRepair' BOOLEAN, 'WarrantyCompanyPays' BOOLEAN,'CompanyName' TEXT,'CompanyAddress' TEXT,'WarrantyExpiry' DATE,'VehicleType' TEXT, 'RegistrationNumber' TEXT PRIMARY KEY,'Model' TEXT,'Make' TEXT,'EngineSize' TEXT,'FuelType' TEXT,'Colour' TEXT,'MoTRenewalDate' DATE,'LastServiceDate'DATE,'CurrentMileage'INTEGER,'ListOfPartsUsed' TEXT, FOREIGN KEY(customerID) REFERENCES CustomerAccount(ID), FOREIGN KEY(ListOfPartsUsed) REFERENCES PartsRecord(ID));";
                //System.out.println("Query :" + create);
                statement.executeUpdate(create);			

                statement.executeUpdate(query);

                ResultSet vr = statement.executeQuery("select * from 'VehicleRecords'");

		System.out.println("CustomerID Model  Registration Number");
		while(vr.next()){
			System.out.println(vr.getInt("CustomerID")+"	   "+vr.getString("Model")+"	        "+vr.getString("RegistrationNumber"));
		}
                JOptionPane.showMessageDialog(null, "Successfully inserted Vehicle with Registration Number " + regNo + " and Customer ID " + customerID);
                ca.close();
                vr.close();
                    
            }
            else{
                JOptionPane.showMessageDialog(null, "Customer ID " + customerID +" does not exist");

            }
        }
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
            statement = db.getConnection().createStatement();
            statement.setQueryTimeout(10);

            ResultSet ca = statement.executeQuery("SELECT * FROM CustomerAccount WHERE ID='"+ID+"' ;");
            if (ca.next()) {
              boolean found = ca.getBoolean(1);
            if(found){
                String query = "INSERT INTO VehicleRecords VALUES ('"+customerID+"', '"+warrantyType+"','"+requireDandR+"','"+compPays+"','"+compName+"','"+compAddress+"','"+warrantyExpiry+"','"+vehicle+"','"+regNo+"','"+model+"','"+make+"','"+engineSize+"','"+fuelType+"','"+colour+"','"+MoTRenewalDate+"','"+lastServiceDate+"','"+currentMileage+"',null);";
                //System.out.println("Query :" + query);
                statement = db.getConnection().createStatement();
                statement.setQueryTimeout(10);
                
                //statement.executeUpdate("drop table if exists 'VehicleRecords'");
                String create = "create table if not exists 'VehicleRecords' ('CustomerID' INTEGER NOT NULL,'WarrantyType' BOOLEAN,'RequiresDiagnosisAndRepair' BOOLEAN, 'WarrantyCompanyPays' BOOLEAN,'CompanyName' TEXT,'CompanyAddress' TEXT,'WarrantyExpiry' DATE,'VehicleType' TEXT, 'RegistrationNumber' TEXT PRIMARY KEY,'Model' TEXT,'Make' TEXT,'EngineSize' TEXT,'FuelType' TEXT,'Colour' TEXT,'MoTRenewalDate' DATE,'LastServiceDate'DATE,'CurrentMileage'INTEGER,'ListOfPartsUsed' TEXT, FOREIGN KEY(customerID) REFERENCES CustomerAccount(ID), FOREIGN KEY(ListOfPartsUsed) REFERENCES PartsRecord(ID));";
                //System.out.println("Query :" + create);
                statement.executeUpdate(create);			

                statement.executeUpdate(query);

                ResultSet vr = statement.executeQuery("select * from 'VehicleRecords'");

		System.out.println("CustomerID Model  Registration Number");
		while(vr.next()){
			System.out.println(vr.getInt("CustomerID")+"	   "+vr.getString("Model")+"	        "+vr.getString("RegistrationNumber"));
		}
                JOptionPane.showMessageDialog(null, "Successfully inserted Vehicle with Registration Number " + regNo + " and Customer ID " + customerID);
                ca.close();
                vr.close();
                    
            }
            else{
                JOptionPane.showMessageDialog(null, "Customer ID " + customerID +" does not exist");

            }
        }
        }
	catch (SQLException ex) {
            System.err.println(ex.getMessage());
	}
        db.closeConn();
    }
        
    public static void editVehicle(String ID, String vehicle, String regNo, String  model, String make, String engineSize, String fuelType, String colour, String MoTRenewalDate, String lastServiceDate, String currentMileage, Boolean warrantyType, String compName, String compAddress, String warrantyExpiry) {
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
                
            String query = "UPDATE   VehicleRecords SET WarrantyType ='"+warrantyType+"',RequiresDiagnosisAndRepair = '"+requireDandR+"',WarrantyCompanyPays = '"+compPays+"',CompanyName = '"+compName+"',CompanyAddress= '"+compAddress+"',WarrantyExpiry ='"+warrantyExpiry+"',WarrantyType = '"+vehicle+"',RegistrationNumber ='"+regNo+"',Model ='"+model+"',Make ='"+make+"',EngineSize ='"+engineSize+"',FuelType='"+fuelType+"',Colour = '"+colour+"',MoTRenewalDate ='"+MoTRenewalDate+"',LastServiceDate = '"+lastServiceDate+"',CurrentMileage ='"+currentMileage+"',ListOfPartsUsed = 1 WHERE CustomerID = '"+customerID+"' ";

            System.out.println("Query :" + query);
            statement = db.getConnection().createStatement();
            statement.setQueryTimeout(10);
                
            statement.executeUpdate("create table if not exists 'VehicleRecords' ('CustomerID' INTEGER NOT NULL,'WarrantyType' BOOLEAN,'RequiresDiagnosisAndRepair' BOOLEAN, 'WarrantyCompanyPays' BOOLEAN,'CompanyName' TEXT,'CompanyAddress' TEXT,'WarrantyExpiry' DATE,'RegistrationNumber' TEXT PRIMARY KEY,'Model' TEXT,'Make' TEXT,'EngineSize' TEXT,'FuelType' TEXT,'Colour' TEXT,'MoTRenewalDate' DATE,'LastServiceDate'DATE,'CurrentMileage'INTEGER,'ListOfPartsUsed'TEXT, FOREIGN KEY(customerID) REFERENCES CustomerAccount(ID))");			
            statement.executeUpdate(query);
            
            ResultSet vr = statement.executeQuery("select * from 'VehicleRecords'");
            JOptionPane.showMessageDialog(null,"Successfully edited Vehicle");
            //closes result set
            vr.close();
        }
	catch (SQLException ex) {
            System.err.println(ex.getMessage());
	}
        //closes database connection
        db.closeConn();
    }
    
    public static void deleteVehicle(JTable table) {
        //gets the Registration Number from JTable
        int selectedRowIndex = table.getSelectedRow();
        String regNo = (String) table.getModel().getValueAt(selectedRowIndex, 8);
        
        //confirmation that user wants to delete the vehicle information
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this vehicle with registration number " +regNo +"?", "Delete", JOptionPane.YES_NO_CANCEL_OPTION);
        if(p==0) {
            String q = "DELETE FROM vehicleRecords WHERE registrationNumber = '"+regNo+"';";
            System.out.println("Query :" + q);

            Database db = new Database();
            db.connect();

            try {                
                    Statement statement;
                    statement = db.getConnection().createStatement();
                    statement.setQueryTimeout(10);

                    statement.executeQuery(q);
                    JOptionPane.showMessageDialog(null, "Vehicle with registration number " + regNo + " has been deleted from the system");
            }
            catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
            db.closeConn();
        }
    }
        
    public static void searchVehicle(
            JTable table,
            String option, 
            String input) 
    {
        Database db = new Database();
        db.connect();
        
        if(option.equals("Registration Number"))
            option = "RegistrationNumber";
        else if(option.equals("Make"))
            option = "Make";
        else
            option = "VehicleType";
                
        try {                
            Statement statement;    
            statement = db.getConnection().createStatement();
            statement.setQueryTimeout(10);
            
            String q = "";
            if(option.equals("RegistrationNumber"))
                q= "select * from VehicleRecords WHERE "+option+" like '%"+ input+ "%';";
            else
                q= "select * from VehicleRecords WHERE "+option+" like '"+ input+ "';";

            System.out.println("Query :" + q);
            ResultSet vr = statement.executeQuery(q);

            //prints out data into the Jtable
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
     
    //automatically display vehicle data into textfields if user clicks on a row in the list of vehicles
    public static void mouseClick(
        JTable table,
        JTextField custID,
        JTextField custID1,
        JTextField custID2,
        JTextField custName,
        JComboBox<String> vType,
        JTextField regNum,
        JTextField mod,
        JTextField cMake,
        JTextField size,
        JTextField fuel,
        JTextField cColour,
        JTextField MoTrenewal,
        JTextField lastServDate,
        JTextField mileage,
        JTextField warExpiry,
        JTextField comAdd,  
        JTextField comName,
        JCheckBox warType)
     {
        try {
            int selectedRowIndex = table.getSelectedRow();
            String click = (table.getModel().getValueAt(selectedRowIndex,0).toString());

            Database db = new Database();
            db.connect();
            String q = "SELECT * FROM VehicleRecords WHERE CustomerID='"+click+"' ;";
            Statement statement;

            statement = db.getConnection().createStatement();
            statement.setQueryTimeout(10);

            System.out.println("Query :" + q);
            ResultSet vr = statement.executeQuery(q);

            
            custID.setText(click);
            custID1.setText(click);
            custID2.setText(click);
            
            while(vr.next()){
                warType.setSelected(vr.getBoolean("WarrantyType"));
                comName.setText(vr.getString("CompanyName"));
                comAdd.setText(vr.getString("CompanyAddress"));
                warExpiry.setText(vr.getString("WarrantyExpiry"));
                vType.setSelectedItem(vr.getString((String)"VehicleType"));
                regNum.setText(vr.getString("RegistrationNumber"));
                mod.setText(vr.getString("Model"));
                cMake.setText(vr.getString("Make"));
                size.setText(vr.getString("EngineSize"));
                fuel.setText(vr.getString("FuelType"));
                cColour.setText(vr.getString("Colour"));
                MoTrenewal.setText(vr.getString("MoTRenewalDate"));
                lastServDate.setText(vr.getString("LastServiceDate"));
                mileage.setText("" +vr.getInt("CurrentMileage"));
            }
            vr.close();
            statement.close();
            db.closeConn();
             
            }
               catch(Exception e) {
                  JOptionPane.showMessageDialog(null, "error");
            }

        
         try {
              int selectedRowIndex = table.getSelectedRow();
            String click = (table.getModel().getValueAt(selectedRowIndex,0).toString());

            Database db = new Database();
            db.connect();
            Statement statement;

            statement = db.getConnection().createStatement();
            statement.setQueryTimeout(10);

            
        String q1 = "SELECT * FROM CustomerAccount WHERE ID='"+click+"' ;";
            ResultSet ca = statement.executeQuery(q1);
            System.out.println("Query :" + q1);
            custName.setText(ca.getString("Forename") +" "+ ca.getString("Surname"));
            ca.close();
            statement.close();
            db.closeConn();
         } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(vehicle.class.getName()).log(Level.SEVERE, null, ex);
        }
          
     }
    
}
