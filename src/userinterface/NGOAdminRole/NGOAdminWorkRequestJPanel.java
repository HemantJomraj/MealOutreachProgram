/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGOAdminRole;

import userinterface.FoodInspectorRole.InspectorWorkAreaJPanel;
import userinterface.NGOAdminRole.NGOAdminWorkAreaPanel;
import code.Enterprise.Enterprise;
import code.Org.OrgNGODirector;
import code.Org.Organization;
import code.Org.OrgSecretary;
import code.SystemUserAccount.SystemUsers;
import code.ProcessQueue.FDAApprovalRequest;
import code.ProcessQueue.NGOFundRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shruti
 */
public class NGOAdminWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    private JPanel jPnl;
    private Enterprise ent;
    private SystemUsers usrAcc;
    private NGOFundRequest ngoFndReq;
    private InspectorWorkAreaJPanel offrWrkAreaJPnl;

    public NGOAdminWorkRequestJPanel(JPanel jPanel, SystemUsers userAccount, NGOFundRequest fundRequest, Enterprise enterprise) {
        initComponents();

        this.jPnl = jPanel;
        this.ent = enterprise;
        this.usrAcc = userAccount;
        this.ngoFndReq = fundRequest;
        amountNeededText.setText(String.valueOf(ngoFndReq.getAmountRequired()));
        hospitalNameText.setText(ngoFndReq.getNameOfHospital());
        hospitalAddressText.setText(String.valueOf(ngoFndReq.getAddressOfHospital()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amountNeededText = new javax.swing.JTextField();
        amountNeededLabel = new javax.swing.JLabel();
        messageabel = new javax.swing.JLabel();
        messageText = new javax.swing.JTextField();
        requestNGOLabel = new javax.swing.JLabel();
        directorApprovalbutton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        hospitalNameLabel = new javax.swing.JLabel();
        hospitalNameText = new javax.swing.JTextField();
        hospitalAddressText = new javax.swing.JTextField();
        hospitalAddressLabel = new javax.swing.JLabel();
        rejectButton = new javax.swing.JButton();
        img = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 249, 232));

        amountNeededText.setEnabled(false);

        amountNeededLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        amountNeededLabel.setForeground(new java.awt.Color(204, 130, 43));
        amountNeededLabel.setText("Amount Needed:");

        messageabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        messageabel.setForeground(new java.awt.Color(204, 130, 43));
        messageabel.setText("Message:");

        requestNGOLabel.setFont(new java.awt.Font("YuGothic", 1, 36)); // NOI18N
        requestNGOLabel.setForeground(new java.awt.Color(204, 130, 43));
        requestNGOLabel.setText("NGO ADMIN WORK REQUEST");

        directorApprovalbutton.setBackground(new java.awt.Color(204, 130, 43));
        directorApprovalbutton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        directorApprovalbutton.setText("Send to Director for approval");
        directorApprovalbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorApprovalbuttonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(204, 130, 43));
        backButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        hospitalNameLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        hospitalNameLabel.setForeground(new java.awt.Color(204, 130, 43));
        hospitalNameLabel.setText("Food Bank Name:");

        hospitalNameText.setEnabled(false);

        hospitalAddressText.setEnabled(false);

        hospitalAddressLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        hospitalAddressLabel.setForeground(new java.awt.Color(204, 130, 43));
        hospitalAddressLabel.setText("Food Bank Address:");

        rejectButton.setBackground(new java.awt.Color(204, 130, 43));
        rejectButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        rejectButton.setText("Reject");
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ngo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(524, 524, 524)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(directorApprovalbutton)
                                .addGap(59, 59, 59)
                                .addComponent(rejectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amountNeededLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(hospitalNameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amountNeededText, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hospitalNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(messageabel)
                                    .addComponent(hospitalAddressLabel))
                                .addGap(38, 38, 38)
                                .addComponent(hospitalAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(requestNGOLabel)
                            .addComponent(img))))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(requestNGOLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hospitalNameLabel)
                            .addComponent(hospitalNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountNeededText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountNeededLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hospitalAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospitalAddressLabel))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messageabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(img)))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(directorApprovalbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        jPnl.remove(this);
        Component[] componentArray = jPnl.getComponents();
        Component component = componentArray[componentArray.length - 1];
        NGOAdminWorkAreaPanel ngoAdministratorWorkAreaJPanel = (NGOAdminWorkAreaPanel) component;
        ngoAdministratorWorkAreaJPanel.populateRequestTable();
        CardLayout layout = (CardLayout) jPnl.getLayout();
        layout.previous(jPnl);
    }//GEN-LAST:event_backButtonActionPerformed

    private void directorApprovalbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorApprovalbuttonActionPerformed
        // TODO add your handling code here:

        String message = messageText.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
            ngoFndReq.setProcessMessage(message);

            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");

            if (dialogResult == JOptionPane.YES_OPTION) {

                ngoFndReq.setSndr(usrAcc);
                ngoFndReq.setProcessStatus("Sent to Director");

                Organization org = null;
                for (Organization organization : ent.getOrgDir().getOrganizations()) {
                    if (organization instanceof OrgNGODirector) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getProcessQueue().getProcesReq().add(ngoFndReq);
                    usrAcc.getProcessQueue().getProcesReq().add(ngoFndReq);
                }
                JOptionPane.showMessageDialog(null, "Request to Director Successful!!!");
                messageText.setText("");
                rejectButton.setEnabled(false);
                directorApprovalbutton.setEnabled(false);
            }
            messageText.setText("");
        }

    }//GEN-LAST:event_directorApprovalbuttonActionPerformed

    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed
        String message = messageText.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
            ngoFndReq.setProcessMessage(message);
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");

            if (dialogResult == JOptionPane.YES_OPTION) {
                ngoFndReq.setProcessStatus("Rejected");
                messageText.setText("");
                rejectButton.setEnabled(false);
                directorApprovalbutton.setEnabled(false);
            }

            messageText.setText("");
        }
    }//GEN-LAST:event_rejectButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountNeededLabel;
    private javax.swing.JTextField amountNeededText;
    private javax.swing.JButton backButton;
    private javax.swing.JButton directorApprovalbutton;
    private javax.swing.JLabel hospitalAddressLabel;
    private javax.swing.JTextField hospitalAddressText;
    private javax.swing.JLabel hospitalNameLabel;
    private javax.swing.JTextField hospitalNameText;
    private javax.swing.JLabel img;
    private javax.swing.JTextField messageText;
    private javax.swing.JLabel messageabel;
    private javax.swing.JButton rejectButton;
    private javax.swing.JLabel requestNGOLabel;
    // End of variables declaration//GEN-END:variables
}
