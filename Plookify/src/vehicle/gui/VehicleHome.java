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
public class VehicleHome extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public VehicleHome() {
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

        Homebtn = new javax.swing.JButton();
        addVbtn = new javax.swing.JButton();
        quickAddVbtn = new javax.swing.JButton();
        searchVbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        custMenu = new javax.swing.JMenu();
        vehicleMenu = new javax.swing.JMenu();
        bookingMenu = new javax.swing.JMenu();
        partsMenu = new javax.swing.JMenu();
        SPCMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Homebtn.setText("Homepage");
        Homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 210, 50));

        addVbtn.setText("Add Vehicle");
        addVbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addVbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 210, 50));

        quickAddVbtn.setText("Quick Add Vehicle");
        quickAddVbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickAddVbtnActionPerformed(evt);
            }
        });
        getContentPane().add(quickAddVbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 210, 50));

        searchVbtn.setText("SearchVehicle");
        searchVbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchVbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 210, 50));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Vehicles Home");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

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

    private void HomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomebtnActionPerformed
        common.gui.Home homepage = new common.gui.Home();
        homepage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomebtnActionPerformed

    private void addVbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVbtnActionPerformed
        VehicleAdd addV = new VehicleAdd();
        addV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addVbtnActionPerformed

    private void quickAddVbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickAddVbtnActionPerformed
        VehicleQuickAdd qAddV = new VehicleQuickAdd();
        qAddV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_quickAddVbtnActionPerformed

    private void searchVbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchVbtnActionPerformed
        vehicleSearch searchV = new vehicleSearch();
        searchV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_searchVbtnActionPerformed

    private void homeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMenuMouseClicked
        common.gui.Home homepage = new common.gui.Home();
        homepage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeMenuMouseClicked

    private void custMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custMenuMouseClicked
        customers.GUI.CustomerHome custHome = new customers.GUI.CustomerHome();
        custHome.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_custMenuMouseClicked

    private void custMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custMenuActionPerformed

    }//GEN-LAST:event_custMenuActionPerformed

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
            java.util.logging.Logger.getLogger(VehicleHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebtn;
    private javax.swing.JMenu SPCMenu;
    private javax.swing.JButton addVbtn;
    private javax.swing.JMenu bookingMenu;
    private javax.swing.JMenu custMenu;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu partsMenu;
    private javax.swing.JButton quickAddVbtn;
    private javax.swing.JButton searchVbtn;
    private javax.swing.JMenu vehicleMenu;
    // End of variables declaration//GEN-END:variables
}
