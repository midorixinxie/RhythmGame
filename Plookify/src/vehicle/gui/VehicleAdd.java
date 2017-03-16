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
public class VehicleAdd extends javax.swing.JFrame {

    /** Creates new form add */
    public VehicleAdd() {
        initComponents();
        this.setSize(600,560);
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
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
        submitbtn = new javax.swing.JButton();
        returnbtn = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();
        quickAddVbtn = new javax.swing.JButton();
        customerID = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        custMenu = new javax.swing.JMenu();
        vehicleMenu = new javax.swing.JMenu();
        bookingMenu = new javax.swing.JMenu();
        partsMenu = new javax.swing.JMenu();
        SPCMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(registrationNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 110, -1));

        jLabel2.setText("Vehicle Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 57, -1, -1));

        jLabel3.setText("Warranty Company:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        warrantyCheck.setText("Warranty");
        getContentPane().add(warrantyCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));
        getContentPane().add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 110, -1));

        jLabel6.setText("Date of Expiry");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));
        getContentPane().add(make, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 110, -1));

        jLabel7.setText("Registration Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel8.setText("Model");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel9.setText("Make");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel10.setText("Fuel Type (litres)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel11.setText("MoT Renewal Date");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel12.setText("Colour");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel13.setText("Engine Size");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        getContentPane().add(engineSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 110, -1));
        getContentPane().add(colour, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 110, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Add Vehicle");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        getContentPane().add(fuelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 110, -1));
        getContentPane().add(MoTRenewalDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 110, -1));
        getContentPane().add(lastServiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 110, -1));

        currentMileage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentMileageActionPerformed(evt);
            }
        });
        getContentPane().add(currentMileage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 110, -1));
        getContentPane().add(companyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 120, -1));

        jLabel14.setText("Last Service Date");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel15.setText("Current Mileage");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));
        getContentPane().add(companyAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 120, -1));
        getContentPane().add(warrantyDateOfExpiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 120, -1));

        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        returnbtn.setText("Return to Vehicle Index");
        returnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Van", "Truck" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 110, -1));

        quickAddVbtn.setText("Quick Add Format");
        quickAddVbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickAddVbtnActionPerformed(evt);
            }
        });
        getContentPane().add(quickAddVbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        customerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDActionPerformed(evt);
            }
        });
        getContentPane().add(customerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 110, -1));

        jLabel16.setText("Customer ID");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        homeMenu.setText("Homepage");
        homeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMenuMouseClicked(evt);
            }
        });
        jMenuBar.add(homeMenu);

        custMenu.setText("Customer Account");
        custMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custMenuMouseClicked(evt);
            }
        });
        custMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custMenuActionPerformed(evt);
            }
        });
        jMenuBar.add(custMenu);

        vehicleMenu.setText("Vehicle Records");
        vehicleMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehicleMenuMouseClicked(evt);
            }
        });
        jMenuBar.add(vehicleMenu);

        bookingMenu.setText("Diagnosis & Repair Bookings");
        bookingMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingMenuMouseClicked(evt);
            }
        });
        jMenuBar.add(bookingMenu);

        partsMenu.setText("Parts");
        partsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                partsMenuMouseClicked(evt);
            }
        });
        jMenuBar.add(partsMenu);

        SPCMenu.setText("Specialist Repairs");
        SPCMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SPCMenuMouseClicked(evt);
            }
        });
        jMenuBar.add(SPCMenu);

        setJMenuBar(jMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void currentMileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentMileageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentMileageActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        // adds data into database
        vehicle.logic.vehicle newLogic = new vehicle.logic.vehicle();
        newLogic.addVehicle(
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
    }//GEN-LAST:event_submitbtnActionPerformed

    private void returnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbtnActionPerformed
        // TODO add your handling code here:
        VehicleHome indV = new VehicleHome();
        indV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnbtnActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxActionPerformed

    private void quickAddVbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickAddVbtnActionPerformed
        VehicleQuickAdd qAddV = new VehicleQuickAdd();
        qAddV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_quickAddVbtnActionPerformed

    private void customerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDActionPerformed

    private void custMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custMenuMouseClicked
        customers.GUI.CustomerHome custHome = new customers.GUI.CustomerHome();
        custHome.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_custMenuMouseClicked

    private void custMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custMenuActionPerformed

    }//GEN-LAST:event_custMenuActionPerformed

    private void homeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuMouseClicked
        common.gui.Home homepage = new common.gui.Home();
        homepage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeMenuMouseClicked

    private void vehicleMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehicleMenuMouseClicked
        vehicle.gui.VehicleHome indV = new vehicle.gui.VehicleHome();
        indV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_vehicleMenuMouseClicked

    private void bookingMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingMenuMouseClicked
        diagRep.gui.BookingHomepage bookingHome = new diagRep.gui.BookingHomepage();
        bookingHome.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bookingMenuMouseClicked

    private void partsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partsMenuMouseClicked
        parts.gui.PartsHome partsHome = new parts.gui.PartsHome();
        partsHome.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_partsMenuMouseClicked

    private void SPCMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SPCMenuMouseClicked
        specRep.gui.SPCHome SPCHome = new specRep.gui.SPCHome();
        SPCHome.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SPCMenuMouseClicked

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
            java.util.logging.Logger.getLogger(VehicleAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MoTRenewalDate;
    private javax.swing.JMenu SPCMenu;
    private javax.swing.JMenu bookingMenu;
    private javax.swing.JTextField colour;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTextField companyAddress;
    private javax.swing.JTextField companyName;
    private javax.swing.JTextField currentMileage;
    private javax.swing.JMenu custMenu;
    private javax.swing.JTextField customerID;
    private javax.swing.JTextField engineSize;
    private javax.swing.JTextField fuelType;
    private javax.swing.JMenu homeMenu;
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
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JTextField lastServiceDate;
    private javax.swing.JTextField make;
    private javax.swing.JTextField model;
    private javax.swing.JMenu partsMenu;
    private javax.swing.JButton quickAddVbtn;
    private javax.swing.JTextField registrationNo;
    private javax.swing.JButton returnbtn;
    private javax.swing.JButton submitbtn;
    private javax.swing.JMenu vehicleMenu;
    private javax.swing.JCheckBox warrantyCheck;
    private javax.swing.JTextField warrantyDateOfExpiry;
    // End of variables declaration//GEN-END:variables

}
