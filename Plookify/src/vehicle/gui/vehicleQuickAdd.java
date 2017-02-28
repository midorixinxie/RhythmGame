/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.gui;

/**
 *
 * @author MichelleY
 */
public class vehicleQuickAdd extends javax.swing.JFrame {

    /**
     * Creates new form vehicleGUI
     */
    public vehicleQuickAdd() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        quickComboBox = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        colour = new javax.swing.JTextField();
        MoTRenewalDate = new javax.swing.JTextField();
        lastServiceDate = new javax.swing.JTextField();
        currentMileage = new javax.swing.JTextField();
        registrationNo = new javax.swing.JTextField();
        customerID = new javax.swing.JTextField();
        warrantyCheck = new javax.swing.JCheckBox();
        companyName = new javax.swing.JTextField();
        companyAddress = new javax.swing.JTextField();
        warrantyDateOfExpiry = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Vehicle Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 57, -1, -1));

        jLabel3.setText("Warranty Company:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel6.setText("Date of Expiry");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jLabel7.setText("Registration Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel8.setText("Popular");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel9.setText("Inc: Model, Make, Engine Size, Fuel Type");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 10));

        jLabel11.setText("MoT Renewal Date");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel12.setText("Colour");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Add Vehicle");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel14.setText("Last Service Date");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel15.setText("Current Mileage");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

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
        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 110, -1));

        addButton.setText("Standard Format");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        quickComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(quickComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 260, -1));

        jLabel16.setText("Customer ID");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        getContentPane().add(colour, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 110, -1));
        getContentPane().add(MoTRenewalDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 110, -1));
        getContentPane().add(lastServiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 110, -1));

        currentMileage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentMileageActionPerformed(evt);
            }
        });
        getContentPane().add(currentMileage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 110, -1));
        getContentPane().add(registrationNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 110, -1));

        customerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDActionPerformed(evt);
            }
        });
        getContentPane().add(customerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 110, -1));

        warrantyCheck.setText("Warranty");
        getContentPane().add(warrantyCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));
        getContentPane().add(companyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 120, -1));
        getContentPane().add(companyAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 120, -1));
        getContentPane().add(warrantyDateOfExpiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
        vehicleIndex indV = new vehicleIndex();
        indV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        vehicleAdd addV = new vehicleAdd();
        addV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addButtonActionPerformed

    private void currentMileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentMileageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentMileageActionPerformed

    private void customerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // adds data into database
        vehicle.logic.vehicle newLogic = new vehicle.logic.vehicle();
        newLogic.quickAddVehicle(
                customerID.getText(),
                (String)comboBox.getSelectedItem(), 
                registrationNo.getText(),
                (String)quickComboBox.getSelectedItem(),
                colour.getText(),
                MoTRenewalDate.getText(),
                lastServiceDate.getText(),
                currentMileage.getText(),
                warrantyCheck.isSelected(),
                companyName.getText(),
                companyAddress.getText(),
                warrantyDateOfExpiry.getText()
        );     }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(vehicleQuickAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vehicleQuickAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vehicleQuickAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vehicleQuickAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vehicleQuickAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MoTRenewalDate;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField colour;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTextField companyAddress;
    private javax.swing.JTextField companyName;
    private javax.swing.JTextField currentMileage;
    private javax.swing.JTextField customerID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JComboBox<String> quickComboBox;
    private javax.swing.JTextField registrationNo;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton submit;
    private javax.swing.JCheckBox warrantyCheck;
    private javax.swing.JTextField warrantyDateOfExpiry;
    // End of variables declaration//GEN-END:variables
}
