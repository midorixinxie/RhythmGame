/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.gui;

import javax.swing.JTable;

/**
 *
 * @author MichelleY
 */
public class VehicleSearch extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public VehicleSearch() {
        initComponents();
        
        this.setSize(1200,560);
        this.setLocationRelativeTo(null);
        tableDisplay.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        
        custID.setEnabled(false);
        custID1.setEnabled(false);
        custID2.setEnabled(false);
        custName.setEnabled(false);
        comboBox1.setEnabled(false);
        registrationNo.setEnabled(false);
        model.setEnabled(false);
        make.setEnabled(false);
        engineSize.setEnabled(false);
        fuelType.setEnabled(false);
        colour.setEnabled(false);
        MoTRenewalDate.setEnabled(false);
        lastServiceDate.setEnabled(false);
        currentMileage.setEnabled(false);         
        warrantyCheck.setEnabled(false);
        companyName.setEnabled(false);
        companyAddress.setEnabled(false);
        warrantyDateOfExpiry.setEnabled(false);
        updateButton.setEnabled(false);
        comboType.setVisible(false);
        comboCar.setVisible(false);
        comboVan.setVisible(false);
        comboTruck.setVisible(false);
                
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
        input = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDisplay = new javax.swing.JTable();
        comboOption = new javax.swing.JComboBox<>();
        searchButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        comboType = new javax.swing.JComboBox<>();
        comboCar = new javax.swing.JComboBox<>();
        comboTruck = new javax.swing.JComboBox<>();
        comboVan = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        registrationNo = new javax.swing.JTextField();
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
        companyAddress = new javax.swing.JTextField();
        warrantyDateOfExpiry = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        comboBox1 = new javax.swing.JComboBox<>();
        custID = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        custName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        custID1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        custID2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jMenuBar = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        custMenu = new javax.swing.JMenu();
        vehicleMenu = new javax.swing.JMenu();
        bookingMenu = new javax.swing.JMenu();
        partsMenu = new javax.swing.JMenu();
        SPCMenu = new javax.swing.JMenu();

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
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        getContentPane().add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 170, -1));

        tableDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CustomerID", "WarrantyType", "RequiresDiagnosisAndRepair", "WarrantyCompanyPays", "CompanyName", "CompanyAddress", "WarrantyExpiry", "VehicleType", "RegistrationNumber", "Model", "Make", "EngineSize", "FuelType", "Colour", "MoTRenewalDate"
            }
        ));
        tableDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDisplayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDisplay);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 590, 450));

        comboOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registration Number", "Manufacturer", "Vehicle Type", "Vehicle Template" }));
        comboOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOptionActionPerformed(evt);
            }
        });
        getContentPane().add(comboOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, -1));

        searchButton.setText("search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        deleteButton.setText("delete selected vehicle");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        editButton.setText("edit selected vehicle");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));

        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Truck", "Van" }));
        comboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTypeActionPerformed(evt);
            }
        });
        getContentPane().add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 80, -1));

        comboCar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honda Civic 1.6Litre Petrol", "Fiat 500 1.2Litre Petrol", "Mini Cooper 2Litre Petrol", "Ford Fiesta 1.5Litre Petrol", "BMW 640i 3Litres Petrol", "Toyota Yaris 2Litres Petrol", "Lamborghini Aventador 6.5Litres Petrol" }));
        comboCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCarActionPerformed(evt);
            }
        });
        getContentPane().add(comboCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 220, -1));

        comboTruck.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nissan Titan 5.6Litres Diesel", "Honda Ridgeline 3.5Litres Diesel", "Jeep Gladiator 3.8Litres Diesel", "Ford F-150 3.5Litres Diesel", "Mitsubishi L200 3.5Litres Diesel", "Mercedes-Benz Unimog 5.1Litres Diesel", "Ram 4500 5.9Litres Diesel" }));
        comboTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTruckActionPerformed(evt);
            }
        });
        getContentPane().add(comboTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 220, -1));

        comboVan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chevrolet Astro 2.5Litres Diesel", "Vauxhall Corsavan 1.2Litres Diesel", "Mercedes-Bens Sprinter 3Litres Diesel", "Volkswagen Crafter 2Litres Diesel", "Renault Master 2Litres Diesel", "Ford Transit 2.2Litres Diesel", "Volkswagen Caddy 2Litres Diesel" }));
        comboVan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVanActionPerformed(evt);
            }
        });
        getContentPane().add(comboVan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 220, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(registrationNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 110, -1));

        jLabel3.setText("Warranty Company:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        warrantyCheck.setText("Warranty");
        jPanel1.add(warrantyCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));
        jPanel1.add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 110, -1));

        jLabel6.setText("Date of Expiry");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));
        jPanel1.add(make, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 110, -1));

        jLabel9.setText("Registration Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel10.setText("Model");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel11.setText("Make");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel12.setText("Fuel Type");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel13.setText("MoT Renewal Date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel14.setText("Colour");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel15.setText("Engine Size");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jPanel1.add(engineSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 110, -1));
        jPanel1.add(colour, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 110, -1));
        jPanel1.add(fuelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 110, -1));
        jPanel1.add(MoTRenewalDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 110, -1));
        jPanel1.add(lastServiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 110, -1));

        currentMileage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentMileageActionPerformed(evt);
            }
        });
        jPanel1.add(currentMileage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 110, -1));
        jPanel1.add(companyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 120, -1));

        jLabel16.setText("Last Service Date");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        jPanel1.add(companyAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 120, -1));
        jPanel1.add(warrantyDateOfExpiry, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 120, -1));

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Van", "Truck" }));
        comboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(comboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 110, -1));

        custID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIDActionPerformed(evt);
            }
        });
        jPanel1.add(custID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 110, -1));

        jLabel18.setText("Customer ID");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel19.setText("Vehicle Type");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel17.setText("Current Mileage");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel24.setText("Customer Name");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        custName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameActionPerformed(evt);
            }
        });
        jPanel1.add(custName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 110, -1));

        jTabbedPane1.addTab("Information", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setText("List of Parts Used for Vehicle");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel23.setText("Customer ID");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        custID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custID1ActionPerformed(evt);
            }
        });
        jPanel4.add(custID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 250));

        jTabbedPane1.addTab("List Of Parts", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText("Future Booking Dates");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel22.setText("Past Booking Dates");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setText("Customer ID");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        custID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custID2ActionPerformed(evt);
            }
        });
        jPanel6.add(custID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 110, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 250, 250));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 250));

        jTabbedPane1.addTab("Booking Dates", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 590, 390));

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

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        //returns to vehicle index
        VehicleHome indV = new VehicleHome();
        indV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void tableDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDisplayMouseClicked
        //displays data into textfield from selected row in JTable
        vehicle.logic.vehicle newLogic = new vehicle.logic.vehicle();
        newLogic.mouseClick(
            tableDisplay,
            custID,
            custID1,
            custID2,
            custName,
            comboBox1,
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
            warrantyCheck
        );
    }//GEN-LAST:event_tableDisplayMouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        //clears all fields

        // searches for vehicles and displays info
        vehicle.logic.vehicle newLogic = new vehicle.logic.vehicle();
        String selected = (String)comboOption.getSelectedItem();
        if(selected.equals("Vehicle Template")){
            String option = (String)comboType.getSelectedItem();
        
            if(option.equals("Car"))
            {
                newLogic.searchVehicleTemplate(
                tableDisplay,
                (String)comboCar.getSelectedItem()
            );
            }
            else if(option.equals("Van"))
            {
            newLogic.searchVehicleTemplate(
            tableDisplay,
            (String)comboVan.getSelectedItem()
            );
            }
            else if(option.equals("Truck"))
            {
             newLogic.searchVehicleTemplate(
            tableDisplay,
            (String)comboTruck.getSelectedItem()
           );
           }
        }
        else
        {
            newLogic.searchVehicle(
            tableDisplay,
            (String)comboOption.getSelectedItem(),
            input.getText()
        );
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        //deletes selected vehicle information
        vehicle.logic.vehicle newLogic = new vehicle.logic.vehicle();
        newLogic.deleteVehicle( tableDisplay );
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        //enable textfields
        comboBox1.setEnabled(true);
        registrationNo.setEnabled(true);
        model.setEnabled(true);
        make.setEnabled(true);
        engineSize.setEnabled(true);
        fuelType.setEnabled(true);
        colour.setEnabled(true);
        MoTRenewalDate.setEnabled(true);
        lastServiceDate.setEnabled(true);
        currentMileage.setEnabled(true);
        warrantyCheck.setEnabled(true);
        companyName.setEnabled(true);
        companyAddress.setEnabled(true);
        warrantyDateOfExpiry.setEnabled(true);
        updateButton.setEnabled(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void currentMileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentMileageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentMileageActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // adds data into database
        vehicle.logic.vehicle newLogic = new vehicle.logic.vehicle();
        newLogic.editVehicle(
            custID.getText(),
            (String)comboBox1.getSelectedItem(),
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

        //disables all textfields with data inside, to prevent change of data
        comboBox1.setEnabled(false);
        registrationNo.setEnabled(false);
        model.setEnabled(false);
        make.setEnabled(false);
        engineSize.setEnabled(false);
        fuelType.setEnabled(false);
        colour.setEnabled(false);
        MoTRenewalDate.setEnabled(false);
        lastServiceDate.setEnabled(false);
        currentMileage.setEnabled(false);
        warrantyCheck.setEnabled(false);
        companyName.setEnabled(false);
        companyAddress.setEnabled(false);
        warrantyDateOfExpiry.setEnabled(false);
        updateButton.setEnabled(false);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void comboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox1ActionPerformed

    private void custIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custIDActionPerformed

    private void custNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custNameActionPerformed

    private void custID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custID1ActionPerformed

    private void custID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custID2ActionPerformed

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

    private void comboOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOptionActionPerformed
      String selected = (String)comboOption.getSelectedItem();
        if(selected.equals("Vehicle Template"))
        {
            comboType.setVisible(true);
            comboCar.setVisible(true);
            input.setVisible(false);
        }
        else 
        {
            input.setVisible(true);
            comboType.setVisible(false);
            comboCar.setVisible(false);
            comboVan.setVisible(false);
            comboTruck.setVisible(false);
        }
                
    }//GEN-LAST:event_comboOptionActionPerformed

    private void comboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTypeActionPerformed
        // TODO add your handling code here:
        String selected = (String)comboType.getSelectedItem();
        if(selected.equals("Car"))
        {
            comboCar.setVisible(true);
            comboVan.setVisible(false);
            comboTruck.setVisible(false);
        }
        else if(selected.equals("Van"))
        {
            comboCar.setVisible(false);
            comboVan.setVisible(true);
            comboTruck.setVisible(false);
        }
        else if(selected.equals("Truck"))
        {
            comboCar.setVisible(false);
            comboVan.setVisible(false);
            comboTruck.setVisible(true);
        }
    }//GEN-LAST:event_comboTypeActionPerformed

    private void comboCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCarActionPerformed

    private void comboTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTruckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTruckActionPerformed

    private void comboVanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboVanActionPerformed

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
            java.util.logging.Logger.getLogger(VehicleSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MoTRenewalDate;
    private javax.swing.JMenu SPCMenu;
    private javax.swing.JMenu bookingMenu;
    private javax.swing.JTextField colour;
    private javax.swing.JComboBox<String> comboBox1;
    private javax.swing.JComboBox<String> comboCar;
    private javax.swing.JComboBox<String> comboOption;
    private javax.swing.JComboBox<String> comboTruck;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JComboBox<String> comboVan;
    private javax.swing.JTextField companyAddress;
    private javax.swing.JTextField companyName;
    private javax.swing.JTextField currentMileage;
    private javax.swing.JTextField custID;
    private javax.swing.JTextField custID1;
    private javax.swing.JTextField custID2;
    private javax.swing.JMenu custMenu;
    private javax.swing.JTextField custName;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField engineSize;
    private javax.swing.JTextField fuelType;
    private javax.swing.JMenu homeMenu;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField lastServiceDate;
    private javax.swing.JTextField make;
    private javax.swing.JTextField model;
    private javax.swing.JMenu partsMenu;
    private javax.swing.JTextField registrationNo;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable tableDisplay;
    private javax.swing.JButton updateButton;
    private javax.swing.JMenu vehicleMenu;
    private javax.swing.JCheckBox warrantyCheck;
    private javax.swing.JTextField warrantyDateOfExpiry;
    // End of variables declaration//GEN-END:variables
}
