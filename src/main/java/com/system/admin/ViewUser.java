/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.system.admin;
import com.system.models.users.User;
import com.system.utils.Utils;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sid
 */
public class ViewUser extends javax.swing.JPanel {
private JPanel mainPanel;
List<User> users = new ArrayList<>();
final AdminController controller = new AdminController();
    /**
     * Creates new form ViewUser
     */
    public ViewUser(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LableViewUser = new javax.swing.JLabel();
        LabelSelectUser = new javax.swing.JLabel();
        cmbViewUser = new javax.swing.JComboBox<>();
        ButtonBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        LableViewUser.setText("View User");

        LabelSelectUser.setText("Select User to View");

        cmbViewUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User", "Plant Manager", "Evaluator", "Inspector" }));
        cmbViewUser.setToolTipText("Select User");
        cmbViewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbViewUserActionPerformed(evt);
            }
        });

        ButtonBack.setText("Back");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "DOB", "Email", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UserTable.setRowHeight(30);
        jScrollPane1.setViewportView(UserTable);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ButtonBack)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelSelectUser, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(LableViewUser)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btnUpdate)
                .addGap(56, 56, 56)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ButtonBack))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LableViewUser)))
                .addGap(18, 18, 18)
                .addComponent(LabelSelectUser)
                .addGap(18, 18, 18)
                .addComponent(cmbViewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        // TODO add your handling code here:
        Utils.goBack(mainPanel, this);
    }//GEN-LAST:event_ButtonBackActionPerformed

    private void cmbViewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbViewUserActionPerformed
        // TODO add your handling code here:
        populateUsers();
    }//GEN-LAST:event_cmbViewUserActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(UserTable.getSelectedRow() < 0){
        Utils.showDialog(this, null, "Please select a User");
        }
        else{
        mainPanel.add(new CRUDAdmin(mainPanel, users.get(UserTable.getSelectedRow())));
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        cl.next(mainPanel);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(UserTable.getSelectedRow() < 0){
        Utils.showDialog(this, null, "Please select a User");
        }
        else{
        User user = users.get(UserTable.getSelectedRow());
        if(controller.deleteUser(user.getId())){
        Utils.showDialog(this, "User Deleted Successfully",
                        null);
                populateUsers();
            } else {
                Utils.showDialog(this, null, "Something went wrong...");
            } 
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    void populateUsers() {
        String userType = cmbViewUser.getSelectedItem().toString();
        int roleid = Utils.getroleid(userType);
        users = controller.fetchUsers(roleid);
        populateTable();
    }

    void populateTable() {
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        model.setRowCount(0);
        
        Object rowData[] = new Object[7]; 
       
        for(User user : users)
        {
            rowData[0] = user.getId();
            rowData[1] = user.getName();
            rowData[2] = user.getGender();
            rowData[3] = user.getDob();
            rowData[4] = user.getEmail();
            rowData[5] = user.getPasswordHash();
            model.addRow(rowData);
        }  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JLabel LabelSelectUser;
    private javax.swing.JLabel LableViewUser;
    private javax.swing.JTable UserTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbViewUser;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
