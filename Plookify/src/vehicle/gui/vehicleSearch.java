/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.gui;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.Component;
/**
 *
 * @author MichelleY
 */
public class vehicleSearch extends javax.swing.JFrame {
    
    /**
     * Creates new form vehicleSearch
     */
    public vehicleSearch() {
        initComponents();
        this.setSize(1200,550);
        this.setLocationRelativeTo(null);
        tableDisplay.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        
        customerID.setEditable(false);
        comboBox.setEditable(false);
            registrationNo.setEditable(false);
            model.setEditable(false);
            make.setEditable(false);
            engineSize.setEditable(false);
            fuelType.setEditable(false);
            colour.setEditable(false);
            MoTRenewalDate.setEditable(false);
            lastServiceDate.setEditable(false);
            currentMileage.setEditable(false);
            warrantyCheck.setEnabled(false);
            companyName.setEditable(false);
            companyAddress.setEditable(false);
            warrantyDateOfExpiry.setEditable(false);
            updateButton.setEnabled(false);
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        input = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDisplay = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        registrationNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        warrantyCheck = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        model = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        make = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        engineSize = new javax.swing.JTextField();
        colour = new javax.swing.JTextField();
        fuelType = new javax.swing.JTextField();
        MoTRenewalDate = new javax.swing.JTextField();
        lastServiceDate = new javax.swing.JTextField();
        currentMileage = new javax.swing.JTextField();
        companyName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        companyAddress = new javax.swing.JTextField();
        warrantyDateOfExpiry = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        comboBox1 = new javax.swing.JComboBox<>();
        customerID = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnButton.setText("Return to Vehicle Index");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Search Vehicle");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel7.setText("Search Results:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        jLabel8.setText("Search By:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registration Number", "Manufacturer" }));
        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        getContentPane().add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 120, -1));

        tableDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CustomerID", "WarrantyType", "RequiresDiagnosisAndRepair", "WarrantyCompanyPays", "CompanyName", "CompanyAddress", "WarrantyExpiry", "VehicleType", "RegistrationNumber", "Model", "Make", "EngineSize", "FuelType", "Colour", "MoTRenewalDate", "LastServiceDate", "CurrentMileage", "ListOfPartsUsed"
            }
        ));
        jScrollPane1.setViewportView(tableDisplay);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 590, 450));

        searchButton.setText("search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        deleteButton.setText("delete selected vehicle");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, -1));

        editButton.setText("edit selected vehicle");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));
        getContentPane().add(registrationNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 110, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel2.setText("Information:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setText("Warranty Company:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        warrantyCheck.setText("Warranty");
        getContentPane().add(warrantyCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));
        getContentPane().add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 110, -1));

        jLabel6.setText("Date of Expiry");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));
        getContentPane().add(make, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 110, -1));

        jLabel9.setText("Registration Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel10.setText("Model");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel11.setText("Make");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel12.setText("Fuel Type");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel13.setText("MoT Renewal Date");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel14.setText("Colour");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel15.setText("Engine Size");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        getContentPane().add(engineSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 110, -1));
        getContentPane().add(colour, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 110, -1));
        getContentPane().add(fuelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 110, -1));
        getContentPane().add(MoTRenewalDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 110, -1));
        getContentPane().add(lastServiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 110, -1));

        currentMileage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentMileageActionPerformed(evt);
            }
        });
        getContentPane().add(currentMileage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 110, -1));
        getContentPane().add(companyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 120, -1));

        jLabel16.setText("Last Service Date");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel17.setText("Current Mileage");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));
        getContentPane().add(companyAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 120, -1));
        getContentPane().add(warrantyDateOfExpiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 120, -1));

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Van", "Truck" }));
        comboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(comboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));

        customerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDActionPerformed(evt);
            }
        });
        getContentPane().add(customerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));

        jLabel18.setText("Customer ID");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel19.setText("Vehicle Type");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
        vehicleIndex indV = new vehicleIndex();
        indV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        vehicle.logic.vehicle newLogic = new vehicle.logic.vehicle();
        newLogic.deleteVehicle( tableDisplay );
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // searches for vehicles and displays info
        vehicle.logic.vehicle newLogic = new vehicle.logic.vehicle();
        newLogic.searchVehicle(
                tableDisplay,
                (String)comboBox.getSelectedItem(),
                input.getText()
        );   
        
         
    }//GEN-LAST:event_searchButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
                     vehicle.logic.vehicle newLogic = new vehicle.logic.vehicle();
        newLogic.selectAndDisplay(  
                tableDisplay,
                customerID,
                comboBox,
                registrationNo,
            model,
            make,
            engineSize,
            fuelType,
            colour,
            MoTRenewalDate,
            lastServiceDate,
            currentMileage,
            warrantyDateOfExpiry,
            companyAddress,
            companyName,
            warrantyCheck );
        
        
             customerID.setEditable(true);
            comboBox.setEditable(true);
            registrationNo.setEditable(true);
            model.setEditable(true);
            make.setEditable(true);
            engineSize.setEditable(true);
            fuelType.setEditable(true);
            colour.setEditable(true);
            MoTRenewalDate.setEditable(true);
            lastServiceDate.setEditable(true);
            currentMileage.setEditable(true);
            warrantyCheck.setEnabled(true);
            companyName.setEditable(true);
            companyAddress.setEditable(true);
            warrantyDateOfExpiry.setEditable(true);
            updateButton.setEnabled(true);

    }//GEN-LAST:event_editButtonActionPerformed

    private void currentMileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentMileageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentMileageActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // adds data into database
        vehicle.logic.vehicle newLogic = new vehicle.logic.vehicle();
        newLogic.editVehicle(
            customerID.getText(),
            (String)comboBox.getSelectedItem(),
            registrationNo.getText(),
            model.getText(),
            make.getText(),
            engineSize.getText(),
            fuelType.getText(),
            colour.getText(),
            MoTRenewalDate.getText(),
            lastServiceDate.getText(),
            currentMileage.getText(),
            warrantyCheck.isSelected(),
            companyName.getText(),
            companyAddress.getText(),
            warrantyDateOfExpiry.getText()
        );
        
                
        customerID.setEditable(false);
        comboBox.setEditable(false);
            registrationNo.setEditable(false);
            model.setEditable(false);
            make.setEditable(false);
            engineSize.setEditable(false);
            fuelType.setEditable(false);
            colour.setEditable(false);
            MoTRenewalDate.setEditable(false);
            lastServiceDate.setEditable(false);
            currentMileage.setEditable(false);
            warrantyCheck.setEnabled(false);
            companyName.setEditable(false);
            companyAddress.setEditable(false);
            warrantyDateOfExpiry.setEditable(false);
            updateButton.setEnabled(false);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void comboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox1ActionPerformed

    private void customerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vehicleSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vehicleSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vehicleSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vehicleSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vehicleSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MoTRenewalDate;
    private javax.swing.JTextField colour;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JComboBox<String> comboBox1;
    private javax.swing.JTextField companyAddress;
    private javax.swing.JTextField companyName;
    private javax.swing.JTextField currentMileage;
    private javax.swing.JTextField customerID;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField engineSize;
    private javax.swing.JTextField fuelType;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastServiceDate;
    private javax.swing.JTextField make;
    private javax.swing.JTextField model;
    private javax.swing.JTextField registrationNo;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable tableDisplay;
    private javax.swing.JButton updateButton;
    private javax.swing.JCheckBox warrantyCheck;
    private javax.swing.JTextField warrantyDateOfExpiry;
    // End of variables declaration//GEN-END:variables

}
