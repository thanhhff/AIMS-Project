/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.Admin.User;

import controller.User.UserController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User.Account;
import views.account.SignUp;

/**
 *
 * @author thanhhff
 */
public class UserPanel extends javax.swing.JPanel {
    UserController userAccount = new UserController();
    /**
     * Creates new form User
     */
    public UserPanel() {
        initComponents();
        FillTable();
    }
    
    public void FillTable()
    {
        ArrayList<Account> arrAccount = userAccount.getListAccount();
        DefaultTableModel tbmodel = new DefaultTableModel();
        
        tbmodel.addColumn("ID");
        tbmodel.addColumn("Username");
        tbmodel.addColumn("Account Status");
        
        if (arrAccount != null)
        {
            int accountNumber = 0;
            for (Account acc : arrAccount){
                accountNumber += 1;
                
                String lvStatus = "";
                
                if (acc.getLv() == 0){
                    lvStatus = "User";
                } else if (acc.getLv() == 1){
                    lvStatus = "Admin";
                } else if (acc.getLv() == 2){
                    lvStatus = "Block";
                }
                tbmodel.addRow(new Object[]{acc.getId(), acc.getUsername(), lvStatus});
            }
            
            totalNumber.setText("Total number of accounts: " + String.valueOf(accountNumber));

        }
        
        
        tbAccount.setModel(tbmodel);
        
        for (int i = 0; i < tbAccount.getColumnCount(); i++) {
            Class<?> col = tbAccount.getColumnClass(i);
            tbAccount.setDefaultEditor(col, null);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateAccount = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAccount = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        totalNumber = new javax.swing.JLabel();
        View = new javax.swing.JButton();
        Block = new javax.swing.JButton();
        UnBlock = new javax.swing.JButton();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/login.png"))); // NOI18N

        javax.swing.GroupLayout CreateAccountLayout = new javax.swing.GroupLayout(CreateAccount.getContentPane());
        CreateAccount.getContentPane().setLayout(CreateAccountLayout);
        CreateAccountLayout.setHorizontalGroup(
            CreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAccountLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        CreateAccountLayout.setVerticalGroup(
            CreateAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAccountLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        setBorder(javax.swing.BorderFactory.createTitledBorder("User Account Manager"));
        setPreferredSize(new java.awt.Dimension(1099, 694));

        tbAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Username", "Level"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbAccount);

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        totalNumber.setText("Total number of accounts");

        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        Block.setText("Block");
        Block.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlockActionPerformed(evt);
            }
        });

        UnBlock.setText("Un Block");
        UnBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnBlockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalNumber)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Block, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UnBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Remove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(View, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Block, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UnBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalNumber)
                .addContainerGap(367, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        CreateAccountPanel newAccount = new CreateAccountPanel();
        newAccount.setVisible(true);
        newAccount.setLocationRelativeTo(null);
        FillTable();
    }//GEN-LAST:event_AddActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        // TODO add your handling code here:
       
        int[] selectedRows = tbAccount.getSelectedRows();
        
        if (selectedRows.length <= 0) {
            JOptionPane.showMessageDialog(null, "You are not select row!");
        } else {
            ArrayList<Integer> ListAccount = new ArrayList<Integer>();
            String sp = "";
            
             for (int i : selectedRows) {
                int ma = (int) tbAccount.getValueAt(i, 0);
                ListAccount.add(ma);
                String userName = (String) tbAccount.getValueAt(i, 1);
                sp += userName + "\n";
            }
            int qs;
            qs = JOptionPane.showConfirmDialog(null, "Delete this account:\n " + sp, "Delete Account", JOptionPane.YES_NO_OPTION);
            if (qs == JOptionPane.YES_OPTION) {
                boolean delete = userAccount.deleteAccount(ListAccount);
                if (delete == true) {
                    FillTable();
                } else
                    JOptionPane.showMessageDialog(null, "Can not delete this account!");

            }
        }
    }//GEN-LAST:event_RemoveActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
        int select = tbAccount.getSelectedRow();
        if (select < 0) {
            // pass
//            JOptionPane.showMessageDialog(null, "You are not select!");
        } else {
            int user_id = (int) tbAccount.getValueAt(select, 0);
            ViewInformation viewAcc = new ViewInformation(user_id);
            viewAcc.setVisible(true);
            viewAcc.setLocationRelativeTo(null);
            }
        FillTable();

    }//GEN-LAST:event_ViewActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        int select = tbAccount.getSelectedRow();
        if (select < 0) {
            JOptionPane.showMessageDialog(null, "You are not select!");
        } else {
            int user_id = (int) tbAccount.getValueAt(select, 0);
            EditAccountPanel editAcc = new EditAccountPanel(user_id);
            editAcc.setLocationRelativeTo(null);
            editAcc.setVisible(true);
        }
        FillTable();
    }//GEN-LAST:event_EditActionPerformed

    private void BlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlockActionPerformed
        // TODO add your handling code here:
        int[] selectedRows = tbAccount.getSelectedRows();
        
        if (selectedRows.length <= 0) {
            JOptionPane.showMessageDialog(null, "You are not select row!");
        } else {
            ArrayList<Integer> ListAccount = new ArrayList<Integer>();
            String sp = "";
            
             for (int i : selectedRows) {
                int ma = (int) tbAccount.getValueAt(i, 0);
                ListAccount.add(ma);
                String userName = (String) tbAccount.getValueAt(i, 1);
                sp += userName + "\n";
            }
            int qs;
            qs = JOptionPane.showConfirmDialog(null, "Block this account:\n " + sp, "Block Account", JOptionPane.YES_NO_OPTION);
            if (qs == JOptionPane.YES_OPTION) {
                boolean delete = userAccount.blockAccount(ListAccount, 2);
                if (delete == true) {
                    FillTable();
                } else
                    JOptionPane.showMessageDialog(null, "Can not block this account!");

            }
        }
    }//GEN-LAST:event_BlockActionPerformed

    private void UnBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnBlockActionPerformed
        // TODO add your handling code here:
        int[] selectedRows = tbAccount.getSelectedRows();
        
        if (selectedRows.length <= 0) {
            JOptionPane.showMessageDialog(null, "You are not select row!");
        } else {
            ArrayList<Integer> ListAccount = new ArrayList<Integer>();
            String sp = "";
            
             for (int i : selectedRows) {
                int ma = (int) tbAccount.getValueAt(i, 0);
                ListAccount.add(ma);
                String userName = (String) tbAccount.getValueAt(i, 1);
                sp += userName + "\n";
            }
            int qs;
            qs = JOptionPane.showConfirmDialog(null, "Un Block this account:\n " + sp, "Un Block Account", JOptionPane.YES_NO_OPTION);
            if (qs == JOptionPane.YES_OPTION) {
                boolean delete = userAccount.blockAccount(ListAccount, 0);
                if (delete == true) {
                    FillTable();
                } else
                    JOptionPane.showMessageDialog(null, "Can not unblock this account!");

            }
        }
    }//GEN-LAST:event_UnBlockActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Block;
    private javax.swing.JDialog CreateAccount;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Remove;
    private javax.swing.JButton UnBlock;
    private javax.swing.JButton View;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAccount;
    private javax.swing.JLabel totalNumber;
    // End of variables declaration//GEN-END:variables
}
