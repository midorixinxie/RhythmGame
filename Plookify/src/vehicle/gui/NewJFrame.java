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
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Homebtn.setText("Homepage");
        Homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 210, 50));

        addVbtn.setText("Add Vehicle");
        addVbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addVbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 210, 50));

        quickAddVbtn.setText("Quick Add Vehicle");
        quickAddVbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickAddVbtnActionPerformed(evt);
            }
        });
        getContentPane().add(quickAddVbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 210, 50));

        searchVbtn.setText("SearchVehicle");
        searchVbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchVbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 210, 50));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Vehicles Home");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Homebtn;
    private javax.swing.JButton addVbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton quickAddVbtn;
    private javax.swing.JButton searchVbtn;
    // End of variables declaration//GEN-END:variables
}
