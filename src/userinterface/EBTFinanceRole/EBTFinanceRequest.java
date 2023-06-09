/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EBTFinanceRole;

import code.Enterprise.Enterprise;
import code.SystemUserAccount.SystemUsers;
import code.ProcessQueue.cardRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shruti
 */
public class EBTFinanceRequest extends javax.swing.JPanel {

    private JPanel jPanel;
    private Enterprise entrpz;
    private SystemUsers usrAcnt;
    private cardRequest isnrWrReq;

    /**
     * Creates new form InsuranceFinanceProcessRequest
     */
    EBTFinanceRequest(JPanel userProcessContainer, SystemUsers userAccount, cardRequest insuranceWorkRequest, Enterprise enterprise) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.entrpz = enterprise;
        this.usrAcnt = userAccount;
        this.isnrWrReq = insuranceWorkRequest;
        ebtCardNumberText.setText(insuranceWorkRequest.getCardNumber());
        ssnText.setText(insuranceWorkRequest.getSocialsecurityNumber());
        ebtCardTypeText.setText(insuranceWorkRequest.getTypeOfCard());
        claimAmountText.setText(String.valueOf(insuranceWorkRequest.getClmAmt()));
        billamountText.setText(String.valueOf(insuranceWorkRequest.getBillingAmt()));
        coverageText.setText(String.valueOf(insuranceWorkRequest.getEbtMember().getEbt().getAllowance()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AcceptAmount = new javax.swing.JButton();
        rejectButton = new javax.swing.JButton();
        EBTrequestAreaLabel = new javax.swing.JLabel();
        ebtCardNumberLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        ebtCardNumberText = new javax.swing.JTextField();
        ebtCardTypeText = new javax.swing.JTextField();
        policyNameLabel = new javax.swing.JLabel();
        billamountText = new javax.swing.JTextField();
        amountLabel = new javax.swing.JLabel();
        claimAmountText = new javax.swing.JTextField();
        claimamountLabel = new javax.swing.JLabel();
        ssnLabel = new javax.swing.JLabel();
        ssnText = new javax.swing.JTextField();
        coverageLabel = new javax.swing.JLabel();
        coverageText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 249, 232));
        setLayout(null);

        AcceptAmount.setBackground(new java.awt.Color(204, 130, 43));
        AcceptAmount.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        AcceptAmount.setForeground(new java.awt.Color(255, 255, 255));
        AcceptAmount.setText("Disburse Amount");
        AcceptAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptAmountActionPerformed(evt);
            }
        });
        add(AcceptAmount);
        AcceptAmount.setBounds(170, 340, 162, 32);

        rejectButton.setBackground(new java.awt.Color(204, 130, 43));
        rejectButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        rejectButton.setForeground(new java.awt.Color(255, 255, 255));
        rejectButton.setText("Reject Claim");
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });
        add(rejectButton);
        rejectButton.setBounds(360, 340, 130, 32);

        EBTrequestAreaLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        EBTrequestAreaLabel.setForeground(new java.awt.Color(144, 86, 18));
        EBTrequestAreaLabel.setText("Card Reimbursement Request Area");
        add(EBTrequestAreaLabel);
        EBTrequestAreaLabel.setBounds(310, 10, 250, 22);

        ebtCardNumberLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        ebtCardNumberLabel.setForeground(new java.awt.Color(144, 86, 18));
        ebtCardNumberLabel.setText("Card Number");
        add(ebtCardNumberLabel);
        ebtCardNumberLabel.setBounds(135, 90, 100, 22);

        backButton.setBackground(new java.awt.Color(204, 130, 43));
        backButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(10, 23, 78, 29);

        ebtCardNumberText.setEditable(false);
        add(ebtCardNumberText);
        ebtCardNumberText.setBounds(278, 86, 116, 23);

        ebtCardTypeText.setEditable(false);
        add(ebtCardTypeText);
        ebtCardTypeText.setBounds(278, 209, 116, 23);

        policyNameLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        policyNameLabel.setForeground(new java.awt.Color(144, 86, 18));
        policyNameLabel.setText("Card Type");
        add(policyNameLabel);
        policyNameLabel.setBounds(140, 210, 90, 22);

        billamountText.setEditable(false);
        billamountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billamountTextActionPerformed(evt);
            }
        });
        add(billamountText);
        billamountText.setBounds(278, 247, 116, 23);

        amountLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        amountLabel.setForeground(new java.awt.Color(144, 86, 18));
        amountLabel.setText("Billing Amount");
        add(amountLabel);
        amountLabel.setBounds(140, 250, 110, 22);

        claimAmountText.setEditable(false);
        claimAmountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claimAmountTextActionPerformed(evt);
            }
        });
        add(claimAmountText);
        claimAmountText.setBounds(278, 285, 116, 23);

        claimamountLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        claimamountLabel.setForeground(new java.awt.Color(144, 86, 18));
        claimamountLabel.setText("Claim Amount");
        add(claimamountLabel);
        claimamountLabel.setBounds(140, 290, 100, 22);

        ssnLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        ssnLabel.setForeground(new java.awt.Color(144, 86, 18));
        ssnLabel.setText("SSN");
        add(ssnLabel);
        ssnLabel.setBounds(140, 130, 50, 22);

        ssnText.setEditable(false);
        add(ssnText);
        ssnText.setBounds(278, 124, 116, 23);

        coverageLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        coverageLabel.setForeground(new java.awt.Color(144, 86, 18));
        coverageLabel.setText("Allowance");
        add(coverageLabel);
        coverageLabel.setBounds(140, 170, 71, 20);

        coverageText.setEditable(false);
        add(coverageText);
        coverageText.setBounds(278, 171, 116, 23);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1 AkY4Z8IN-byq7ecW9YHTIw.gif"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(jLabel2);
        jLabel2.setBounds(-30, 0, 910, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptAmountActionPerformed

        AcceptAmount.setEnabled(true);
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            isnrWrReq.setProcessStatus("EBT Claim Approved");
            JOptionPane.showMessageDialog(null, "Claim Approved Successfully!!!");
            AcceptAmount.setEnabled(false);
            rejectButton.setEnabled(false);
        }
    }//GEN-LAST:event_AcceptAmountActionPerformed

    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed

        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            isnrWrReq.setProcessStatus("EBT Claim Rejected");
            rejectButton.setEnabled(false);
            AcceptAmount.setEnabled(false);
        }

    }//GEN-LAST:event_rejectButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        EBTFinanceWorkAreaJPanel iwjp = (EBTFinanceWorkAreaJPanel) component;
        iwjp.pplTabl();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void claimAmountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claimAmountTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claimAmountTextActionPerformed

    private void billamountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billamountTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billamountTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptAmount;
    private javax.swing.JLabel EBTrequestAreaLabel;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField billamountText;
    private javax.swing.JTextField claimAmountText;
    private javax.swing.JLabel claimamountLabel;
    private javax.swing.JLabel coverageLabel;
    private javax.swing.JTextField coverageText;
    private javax.swing.JLabel ebtCardNumberLabel;
    private javax.swing.JTextField ebtCardNumberText;
    private javax.swing.JTextField ebtCardTypeText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel policyNameLabel;
    private javax.swing.JButton rejectButton;
    private javax.swing.JLabel ssnLabel;
    private javax.swing.JTextField ssnText;
    // End of variables declaration//GEN-END:variables
}
