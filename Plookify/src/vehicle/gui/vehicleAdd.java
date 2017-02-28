/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.gui;

import static vehicle.logic.queries.addVehicle;

/**
 *
 * @author MichelleY
 */
public class vehicleAdd extends javax.swing.JFrame {

    /**
     * Creates new form vehicleGUI
     */
    public vehicleAdd() {
        initComponents();
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrationNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        warrantyCheck = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        model = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        make = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        engineSize = new javax.swing.JTextField();
        colour = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fuelType = new javax.swing.JTextField();
        MoTRenewalDate = new javax.swing.JTextField();
        lastServiceDate = new javax.swing.JTextField();
        currentMileage = new javax.swing.JTextField();
        companyName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        companyAddress = new javax.swing.JTextField();
        warrantyDateOfExpiry = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();
        quickAddVButton = new javax.swing.JButton();
        customerID = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrationNo.setText("jTextField1");
        getContentPane().add(registrationNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel2.setText("Vehicle Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 57, -1, -1));

        jLabel3.setText("Warranty Company:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        warrantyCheck.setText("Warranty");
        getContentPane().add(warrantyCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 53, -1, -1));

        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        model.setText("jTextField2");
        getContentPane().add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel6.setText("Date of Expiry");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        make.setText("jTextField3");
        getContentPane().add(make, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel7.setText("Registration Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel8.setText("Model");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel9.setText("Make");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel10.setText("Fuel Type");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel11.setText("MoT Renewal Date");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel12.setText("Colour");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel13.setText("Engine Size");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        engineSize.setText("jTextField4");
        getContentPane().add(engineSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        colour.setText("jTextField6");
        getContentPane().add(colour, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Add Vehicle");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        fuelType.setText("jTextField5");
        getContentPane().add(fuelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        MoTRenewalDate.setText("jTextField7");
        getContentPane().add(MoTRenewalDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        lastServiceDate.setText("jTextField8");
        getContentPane().add(lastServiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        currentMileage.setText("jTextField9");
        currentMileage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentMileageActionPerformed(evt);
            }
        });
        getContentPane().add(currentMileage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        companyName.setText("jTextField10");
        getContentPane().add(companyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel14.setText("Last Service Date");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel15.setText("Current Mileage");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        companyAddress.setText("jTextField11");
        getContentPane().add(companyAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        warrantyDateOfExpiry.setText("jTextField12");
        getContentPane().add(warrantyDateOfExpiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        returnButton.setText("Return to Vehicle Index");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Van", "Truck" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        quickAddVButton.setText("Quick Add Format");
        quickAddVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickAddVButtonActionPerformed(evt);
            }
        });
        getContentPane().add(quickAddVButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        customerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDActionPerformed(evt);
            }
        });
        getContentPane().add(customerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 80, -1));

        jLabel16.setText("Customer ID");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void currentMileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentMileageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentMileageActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
        vehicleIndex indV = new vehicleIndex();
        indV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void quickAddVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickAddVButtonActionPerformed
        vehicleQuickAdd qAddV = new vehicleQuickAdd();
        qAddV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_quickAddVButtonActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        vehicle.logic.vehicle q = new vehicle.logic.vehicle();
        q.addVehicle(
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
    }//GEN-LAST:event_submitActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(vehicleAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vehicleAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vehicleAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vehicleAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vehicleAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MoTRenewalDate;
    private javax.swing.JTextField colour;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTextField companyAddress;
    private javax.swing.JTextField companyName;
    private javax.swing.JTextField currentMileage;
    private javax.swing.JTextField customerID;
    private javax.swing.JTextField engineSize;
    private javax.swing.JTextField fuelType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastServiceDate;
    private javax.swing.JTextField make;
    private javax.swing.JTextField model;
    private javax.swing.JButton quickAddVButton;
    private javax.swing.JTextField registrationNo;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton submit;
    private javax.swing.JCheckBox warrantyCheck;
    private javax.swing.JTextField warrantyDateOfExpiry;
    // End of variables declaration//GEN-END:variables
}
