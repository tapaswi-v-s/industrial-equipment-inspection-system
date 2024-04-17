/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.system.plant_manager;

import com.system.LoginPage;
import com.system.controller.LoginController;
import com.system.utils.Utils;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author tapas
 */
public class PlantManagerDashboard extends javax.swing.JPanel {

    /**
     * Creates new form PlantManagerDashboard
     */
    JPanel mainPanel;
    public PlantManagerDashboard(JPanel mainPanel) {
        initComponents();
        this.mainPanel = mainPanel;
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
        btnPlant = new javax.swing.JButton();
        btnPlant1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnPlant2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 102));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Plant Manager Dashboard");

        btnPlant.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btnPlant.setText("Manage Plants");
        btnPlant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlantActionPerformed(evt);
            }
        });

        btnPlant1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btnPlant1.setText("View Reports");
        btnPlant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlant1ActionPerformed(evt);
            }
        });

        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnPlant2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btnPlant2.setText("Add Inspections");
        btnPlant2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlant2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPlant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPlant1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPlant2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jButton1)
                .addGap(53, 53, 53)
                .addComponent(btnPlant)
                .addGap(51, 51, 51)
                .addComponent(btnPlant2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnPlant1)
                .addGap(73, 73, 73))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlantActionPerformed
        mainPanel.add(new PlantScreen(mainPanel));
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.next(mainPanel);
    }//GEN-LAST:event_btnPlantActionPerformed

    private void btnPlant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlant1ActionPerformed
        mainPanel.add(new ViewReports(mainPanel));
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.next(mainPanel);
    }//GEN-LAST:event_btnPlant1ActionPerformed

    private void btnPlant2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlant2ActionPerformed
        mainPanel.add(new AddInspections(mainPanel));
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.next(mainPanel);
    }//GEN-LAST:event_btnPlant2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginController loginController = new LoginController();
        mainPanel.add(new LoginPage(mainPanel, loginController));
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.next(mainPanel);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlant;
    private javax.swing.JButton btnPlant1;
    private javax.swing.JButton btnPlant2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
