/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parts.gui;

import javax.swing.JTable;

/**
 *
 * @author Moe-MAC
 */
public class PartsSearchByName extends javax.swing.JFrame {

    /**
     * Creates new form PartsSearchByName
     */
    public PartsSearchByName() {
        initComponents();
        this.setLocationRelativeTo(null);
        tableDisplay1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        partID.setEnabled(false);
        name.setEnabled(false);
        desc.setEnabled(false);
        stklvl.setEnabled(false);
        cost.setEnabled(false);       
        instDate.setEnabled(false);
        wExpDate.setEnabled(false);
        regNum.setEnabled(false);
        custID.setEnabled(false);
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

        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        instDate = new javax.swing.JTextField();
        comboBox2 = new javax.swing.JComboBox<String>();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDisplay1 = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        returnButton1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        input1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        partID = new javax.swing.JTextField();
        cost = new javax.swing.JTextField();
        wExpDate = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        searchButton1 = new javax.swing.JButton();
        stklvl = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        regNum = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        custID = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("Search Results:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        jLabel27.setText("NumberInStock");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 254, 120, -1));

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel20.setText("Search Parts");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel31.setText("VehicleRegNumber");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 374, 140, -1));

        instDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instDateActionPerformed(evt);
            }
        });
        getContentPane().add(instDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 110, -1));

        comboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Registration Number", "Customer Name" }));
        comboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(comboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel26.setText("Description");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 224, 90, -1));

        tableDisplay1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PartID", "Name", "Description", "NumberInStock", "Cost", "DateOfInstallation", "WarrantyExpiryDate", "RegistrationNumber", "CustomerID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDisplay1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDisplay1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableDisplay1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 590, 450));

        jLabel25.setText("PartID");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 164, 60, -1));

        returnButton1.setText("Return to Vehicle Index");
        returnButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(returnButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jLabel30.setText("WarrantyExpiryDate");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 344, 140, -1));

        jLabel32.setText("CustomerID");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 404, 90, -1));

        input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input1ActionPerformed(evt);
            }
        });
        getContentPane().add(input1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 120, -1));

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel23.setText("Information:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        partID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partIDActionPerformed(evt);
            }
        });
        getContentPane().add(partID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 110, -1));
        getContentPane().add(cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 110, -1));
        getContentPane().add(wExpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 110, -1));
        getContentPane().add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 110, -1));

        searchButton1.setText("search");
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));
        getContentPane().add(stklvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 110, -1));

        jLabel24.setText("Name");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 194, 50, -1));

        jLabel29.setText("InstallationDate");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 314, 120, -1));
        getContentPane().add(regNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 110, -1));

        jLabel28.setText("Cost");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 284, 50, -1));
        getContentPane().add(custID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 110, -1));

        jLabel21.setText("Search By:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

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

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableDisplay1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDisplay1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableDisplay1MouseClicked

    private void returnButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnButton1ActionPerformed

    private void input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input1ActionPerformed

    private void partIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partIDActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        // TODO add your handling code here:
        parts.logic.Parts newSearch = new parts.logic.Parts();
        newSearch.searchParts(tableDisplay1, (String)comboBox2.getSelectedItem(), input1.getText() );   
    }//GEN-LAST:event_searchButton1ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        //deletes selected vehicle information
        parts.logic.Parts newLogic = new parts.logic.Parts();
        newLogic.deletePart( tableDisplay1 );
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        //enable textfields
          partID.setEnabled(true);
        name.setEnabled(true);
        desc.setEnabled(true);
        stklvl.setEnabled(true);
        cost.setEnabled(true);       
        instDate.setEnabled(true);
        wExpDate.setEnabled(true);
        regNum.setEnabled(true);
        custID.setEnabled(true);
       
        updateButton.setEnabled(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // adds data into database
        parts.logic.Parts newPart = new parts.logic.Parts();
        newPart.editPart(
            Integer.parseInt(partID.getText()),
            name.getText(),
            desc.getText(),
            Integer.parseInt(stklvl.getText()),
            Integer.parseInt(cost.getText()),
            instDate.getText(),
            wExpDate.getText(),
            regNum.getText(),
            Integer.parseInt(custID.getText())
        );

        //disables all textfields with data inside, to prevent change of data
        partID.setEnabled(false);
        name.setEnabled(false);
        desc.setEnabled(false);
        stklvl.setEnabled(false);
        cost.setEnabled(false);       
        instDate.setEnabled(false);
        wExpDate.setEnabled(false);
        regNum.setEnabled(false);
        custID.setEnabled(false);
        updateButton.setEnabled(false);

    }//GEN-LAST:event_updateButtonActionPerformed

    private void comboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox2ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void instDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instDateActionPerformed

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
            java.util.logging.Logger.getLogger(PartsSearchByName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartsSearchByName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartsSearchByName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartsSearchByName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartsSearchByName().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox2;
    private javax.swing.JTextField cost;
    private javax.swing.JTextField custID;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField desc;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField instDate;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField partID;
    private javax.swing.JTextField regNum;
    private javax.swing.JButton returnButton1;
    private javax.swing.JButton searchButton1;
    private javax.swing.JTextField stklvl;
    private javax.swing.JTable tableDisplay1;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField wExpDate;
    // End of variables declaration//GEN-END:variables
}
