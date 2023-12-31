/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface;

import business.Account;
import business.Account_directory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JOptionPane;



/**
 *
 * @author Admin
 */
public class CreateAccountJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Account_directory accountdirectory;
    

    /**
     * Creates new form CreateJPanel
     */
    
    CreateAccountJPanel(JPanel userProcessContainer, Account_directory accountdirectory){
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.accountdirectory = accountdirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcreate = new javax.swing.JLabel();
        lblrouting = new javax.swing.JLabel();
        txtrouting = new javax.swing.JTextField();
        txtaccount = new javax.swing.JTextField();
        lblaccount = new javax.swing.JLabel();
        txtbankname = new javax.swing.JTextField();
        lblbankname = new javax.swing.JLabel();
        txtbalance = new javax.swing.JTextField();
        lblbalance = new javax.swing.JLabel();
        btncreate = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        lblcreate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblcreate.setText("Create Account");

        lblrouting.setText("Routing Number:");

        lblaccount.setText("Account Number:");

        lblbankname.setText("Bank Name:");

        lblbalance.setText("Balance:");

        btncreate.setText("Submit");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        btnback.setText("< Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174)
                .addComponent(lblcreate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblaccount)
                            .addComponent(lblbankname)
                            .addComponent(lblbalance)
                            .addComponent(lblrouting))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtrouting)
                            .addComponent(txtaccount)
                            .addComponent(txtbankname)
                            .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btncreate, lblaccount, lblbalance, lblbankname, lblcreate, lblrouting, txtaccount, txtbalance, txtbankname, txtrouting});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblcreate)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblrouting)
                            .addComponent(txtrouting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblaccount)
                            .addComponent(txtaccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblbankname)
                            .addComponent(txtbankname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblbalance)
                            .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51)
                .addComponent(btncreate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btncreate, lblaccount, lblbalance, lblbankname, lblcreate, lblrouting, txtaccount, txtbalance, txtbankname, txtrouting});

    }// </editor-fold>//GEN-END:initComponents

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        // TODO add your handling code here:
        String routingNumber = txtrouting.getText().trim();
        String accountnumber = txtaccount.getText().trim();
        String bankname = txtbankname.getText().trim();
        int balance = Integer.parseInt(txtbalance.getText());
        
        
        if (routingNumber.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure Routing Number field is filled in before proceeding.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (accountnumber.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure Account Number field is filled in before proceeding.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        
        } 
        
        if (bankname.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure Bank Name field is filled in before proceeding.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        
        if (txtbalance.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure Balance field is filled in before proceeding.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        
        try {
            balance = Integer.parseInt(txtbalance.getText());
            if (balance < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Balance must be a non-negative integer.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtaccount.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please make sure Search field is non empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Account account = accountdirectory.addAccount();
        account.setRouting_number(routingNumber);
        account.setAccount_number(accountnumber);
        account.setBank_name(bankname);
        account.setBalance(balance);
        
        JOptionPane.showMessageDialog(null, "Account Successfully Created");
        
        
    }//GEN-LAST:event_btncreateActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncreate;
    private javax.swing.JLabel lblaccount;
    private javax.swing.JLabel lblbalance;
    private javax.swing.JLabel lblbankname;
    private javax.swing.JLabel lblcreate;
    private javax.swing.JLabel lblrouting;
    private javax.swing.JTextField txtaccount;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtbankname;
    private javax.swing.JTextField txtrouting;
    // End of variables declaration//GEN-END:variables
}
