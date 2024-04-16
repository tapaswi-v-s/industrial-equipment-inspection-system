/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cellModifier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author HP PC
 */
public class PanelAction extends javax.swing.JPanel {

    /**
     * Creates new form PanelAction
     */
    public PanelAction() {
        initComponents();
        System.out.println("Debugging rendering");
    }

    public void initEvent(TableActionEvent event, int row)
    {
        cmdEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("For Edit Action");
                event.onEdit(row);
            }
                    
                });
        cmdDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("For Delete Action");
                event.onDelete(row);
            }
                    
                });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {

        cmdEdit = new JButton();
        cmdDelete = new JButton();

        cmdEdit.setText("Update");
        cmdEdit.setAlignmentY(0.0F);
        cmdEdit.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cmdEdit.setIconTextGap(0);
        cmdEdit.setMaximumSize(new java.awt.Dimension(66, 66));
        cmdEdit.setMinimumSize(new java.awt.Dimension(66, 66));
        cmdEdit.setPreferredSize(new java.awt.Dimension(66, 66));
        cmdEdit.addActionListener(new CmdEditActionListener());

        cmdDelete.setText("Delete");
        cmdDelete.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cmdDelete.setMaximumSize(new java.awt.Dimension(66, 66));
        cmdDelete.setMinimumSize(new java.awt.Dimension(66, 66));
        cmdDelete.setPreferredSize(new java.awt.Dimension(66, 66));
        cmdDelete.addActionListener(new CmdEditActionListener());
        System.out.println("Rendering check");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cmdEdit, 50, 50, 50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDelete, 50, 50, 50)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdDelete, 30, 50, 50)
                    .addComponent(cmdEdit, 30, 50, 50)
                )
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }

    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:\
        System.out.println("Editing");
    }

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        System.out.println("Deleting");
    }


    
    private JButton cmdDelete;
    private JButton cmdEdit;
}
