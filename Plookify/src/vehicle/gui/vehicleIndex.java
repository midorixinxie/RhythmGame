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
public class vehicleIndex extends javax.swing.JFrame {

    /**
     * Creates new form vehicleIndex
     */
    public vehicleIndex() {
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

        jLabel1 = new javax.swing.JLabel();
        addVButton = new javax.swing.JButton();
        returnHomeButton = new javax.swing.JButton();
        quickAddVButton = new javax.swing.JButton();
        searchVButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Vehicle Home");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        addVButton.setText("Add Vehicle");
        addVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addVButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 200, 60));

        returnHomeButton.setText("Garage Home Page");
        returnHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnHomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnHomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 200, 60));

        quickAddVButton.setText("Quick Add Vehicle");
        quickAddVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickAddVButtonActionPerformed(evt);
            }
        });
        getContentPane().add(quickAddVButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 200, 60));

        searchVButton1.setText("Search Vehicle");
        searchVButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(searchVButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 200, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVButtonActionPerformed
        vehicleAdd addV = new vehicleAdd();
        addV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addVButtonActionPerformed

    private void returnHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnHomeButtonActionPerformed
       
    }//GEN-LAST:event_returnHomeButtonActionPerformed

    private void quickAddVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickAddVButtonActionPerformed
        vehicleQuickAdd qAddV = new vehicleQuickAdd();
        qAddV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_quickAddVButtonActionPerformed

    private void searchVButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchVButton1ActionPerformed
        // TODO add your handling code here:
                vehicleSearch searchV = new vehicleSearch();
        searchV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_searchVButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(vehicleIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vehicleIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vehicleIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vehicleIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vehicleIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton quickAddVButton;
    private javax.swing.JButton returnHomeButton;
    private javax.swing.JButton searchVButton1;
    // End of variables declaration//GEN-END:variables
}
