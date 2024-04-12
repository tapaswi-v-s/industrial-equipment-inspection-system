/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.system.plant_manager;

import com.system.models.Plant;
import com.system.utils.Utils;
import java.awt.CardLayout;
import java.util.List;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tapas
 */
public class PlantScreen extends javax.swing.JPanel {

    /**
     * Creates new form PlantScreen
     */
    JPanel mainPanel;
    List<Plant> plants;
    final PlantManagerController controller = new PlantManagerController();
    Plant currentPlant = null;

    public PlantScreen(JPanel mainPanel) {
        initComponents();
        this.mainPanel = mainPanel;
        populatePlants();
    }

    void populatePlants() {
        plants = controller.fetchPlants();
        populateTable();
    }

    void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPlants.getModel();
        model.setRowCount(0);
        for (Plant plant : plants) {
            Vector<String> row = new Vector<String>();
            row.add("" + plant.getId());
            row.add(plant.getName());
            model.addRow(row);
        }
        tblPlants.setModel(model);
        txtName.setText("");
        currentPlant = null;
        btnAddPlant.setText("Add New Plant");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlants = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnAddPlant = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAddEqpt = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Plants");

        tblPlants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPlants);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnUpdate1.setText("View Plant Details");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnAddPlant.setText("Add New Plant");
        btnAddPlant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlantActionPerformed(evt);
            }
        });

        btnBack.setText("← Back");

        jLabel2.setText("Plant Name");

        btnAddEqpt.setText("Add Equipments");
        btnAddEqpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEqptActionPerformed(evt);
            }
        });

        btnClear.setForeground(new java.awt.Color(255, 0, 51));
        btnClear.setText("X");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(263, 263, 263))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(58, 58, 58)
                        .addComponent(btnUpdate1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddEqpt)
                        .addGap(47, 47, 47)
                        .addComponent(btnUpdate)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnAddPlant)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnUpdate1)
                    .addComponent(btnAddEqpt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addGap(27, 27, 27)
                .addComponent(btnAddPlant)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (tblPlants.getSelectedRow() < 0) {
            Utils.showDialog(this, null, "Please select a plant");
        } else {
            currentPlant = plants.get(tblPlants.getSelectedRow());
            txtName.setText(currentPlant.getName());
            btnAddPlant.setText("Update Plant");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddEqptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEqptActionPerformed
        // TODO add your handling code here:
        if (tblPlants.getSelectedRow() < 0) {
            Utils.showDialog(this, null, "Please select a plant");
        } else {
            mainPanel.add(new AddEquipments(mainPanel,
                    plants.get(tblPlants.getSelectedRow())));
            CardLayout cl = (CardLayout) mainPanel.getLayout();
            cl.next(mainPanel);
        }
    }//GEN-LAST:event_btnAddEqptActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (tblPlants.getSelectedRow() < 0) {
            Utils.showDialog(this, null, "Please select a plant");
        }else{
            currentPlant = plants.get(tblPlants.getSelectedRow());
            if (controller.deletePlant(currentPlant.getId())) {
                Utils.showDialog(this, "Plant Deleted Successfully",
                        null);
                populatePlants();
            } else {
                Utils.showDialog(this, null, "Something went wrong...");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        populatePlants();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddPlantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlantActionPerformed
        // TODO add your handling code here:
        if (txtName.getText().isBlank()) {
            Utils.showDialog(this, null, "Please enter a plant name");
        } else {
            if (currentPlant != null) {
                currentPlant.setName(txtName.getText());
                if (controller.updatePlant(currentPlant)) {
                    Utils.showDialog(this, "Plant Updated Successfully...",
                            null);
                } else {
                    Utils.showDialog(this, null, "Something went wrong...");
                }
                populatePlants();
            } else {
                Plant plant = new Plant(txtName.getText());
                if (controller.addPlant(plant)) {
                    Utils.showDialog(this, "Plant Added Successfully...",
                            null);
                } else {
                    Utils.showDialog(this, null, "Something went wrong...");
                }
                populatePlants();
            }
        }
    }//GEN-LAST:event_btnAddPlantActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        if (tblPlants.getSelectedRow() < 0) {
            Utils.showDialog(this, null, "Please select a plant");
        }else{
            
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEqpt;
    private javax.swing.JButton btnAddPlant;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPlants;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}