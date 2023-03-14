/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FDATreasurerRole;

import code.ProcessQueue.FDAApprovalRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jomraj
 */
public class TreasurerWorkRequestJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private FDAApprovalRequest govtFndRequest;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public TreasurerWorkRequestJPanel(JPanel jPanel, FDAApprovalRequest fundRequest) {
        initComponents();
        this.jPanel = jPanel;
        this.govtFndRequest = fundRequest;
        restaurantIDText.setText(String.valueOf(govtFndRequest.getRestaurantZipCode()));
        restaurantNameText.setText(govtFndRequest.getRestaurantName());
        restaurantZipCodeText.setText(String.valueOf(govtFndRequest.getRestaurantID()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ApproveRestaurantButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        rejectRestaurantButton = new javax.swing.JButton();
        massageLabel = new javax.swing.JLabel();
        messageText = new javax.swing.JTextField();
        restaurantNameLabel = new javax.swing.JLabel();
        restaurantNameText = new javax.swing.JTextField();
        restaurantZipCodeText = new javax.swing.JTextField();
        restaurantZipCodeLabel = new javax.swing.JLabel();
        restaurantIDText = new javax.swing.JTextField();
        restaurantIDLabel = new javax.swing.JLabel();
        FDAManagerLabel = new javax.swing.JLabel();
        FDAMAngerImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 249, 232));

        ApproveRestaurantButton.setBackground(new java.awt.Color(204, 130, 43));
        ApproveRestaurantButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        ApproveRestaurantButton.setForeground(new java.awt.Color(255, 255, 255));
        ApproveRestaurantButton.setText("Approve Report");
        ApproveRestaurantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveRestaurantButtonActionPerformed(evt);
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

        rejectRestaurantButton.setBackground(new java.awt.Color(204, 130, 43));
        rejectRestaurantButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        rejectRestaurantButton.setForeground(new java.awt.Color(255, 255, 255));
        rejectRestaurantButton.setText("Reject");
        rejectRestaurantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectRestaurantButtonActionPerformed(evt);
            }
        });

        massageLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        massageLabel.setForeground(new java.awt.Color(204, 130, 43));
        massageLabel.setText("Message");

        messageText.setBackground(new java.awt.Color(204, 204, 204));

        restaurantNameLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        restaurantNameLabel.setForeground(new java.awt.Color(204, 130, 43));
        restaurantNameLabel.setText("Restaurant Name :");

        restaurantNameText.setBackground(new java.awt.Color(204, 204, 204));
        restaurantNameText.setEnabled(false);

        restaurantZipCodeText.setBackground(new java.awt.Color(204, 204, 204));
        restaurantZipCodeText.setEnabled(false);

        restaurantZipCodeLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        restaurantZipCodeLabel.setForeground(new java.awt.Color(204, 130, 43));
        restaurantZipCodeLabel.setText("Restaurant ZipCode:");

        restaurantIDText.setBackground(new java.awt.Color(204, 204, 204));
        restaurantIDText.setEnabled(false);

        restaurantIDLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        restaurantIDLabel.setForeground(new java.awt.Color(204, 130, 43));
        restaurantIDLabel.setText("Restaurant ID :");

        FDAManagerLabel.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        FDAManagerLabel.setForeground(new java.awt.Color(204, 130, 43));
        FDAManagerLabel.setText("FDA Manager Work Area");

        FDAMAngerImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/approved-stamp.gif"))); // NOI18N
        FDAMAngerImage.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(restaurantIDLabel)
                                    .addComponent(restaurantNameLabel)
                                    .addComponent(restaurantZipCodeLabel)
                                    .addComponent(massageLabel))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(restaurantZipCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(restaurantNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(restaurantIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FDAManagerLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ApproveRestaurantButton)
                                .addGap(18, 18, 18)
                                .addComponent(rejectRestaurantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FDAMAngerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(FDAMAngerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(FDAManagerLabel)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(restaurantNameLabel)
                            .addComponent(restaurantNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(restaurantIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(restaurantIDLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(restaurantZipCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(restaurantZipCodeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(massageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rejectRestaurantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ApproveRestaurantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ApproveRestaurantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveRestaurantButtonActionPerformed
        ApproveRestaurantButton.setEnabled(true);
        String message = messageText.getText();
        
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        }
        else
        {
        govtFndRequest.setProcessMessage(message);
         int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
         if (dialogResult == JOptionPane.YES_OPTION) {
        govtFndRequest.setProcessStatus("Accepted");
        JOptionPane.showMessageDialog(null, "Restaurant Passes Regulations!!!");
        ApproveRestaurantButton.setEnabled(false);
        messageText.setText("");
        rejectRestaurantButton.setEnabled(false);
        }
         messageText.setText("");
        }

    }//GEN-LAST:event_ApproveRestaurantButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TreasurerWorkAreaJPanel dwjp = (TreasurerWorkAreaJPanel) component;
        dwjp.pplTbl();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void rejectRestaurantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectRestaurantButtonActionPerformed
        String message = messageText.getText();
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
        govtFndRequest.setProcessMessage(message);
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            
            
            if (dialogResult == JOptionPane.YES_OPTION) {
        govtFndRequest.setProcessStatus("Rejected");
         messageText.setText("");
            rejectRestaurantButton.setEnabled(false);
            ApproveRestaurantButton.setEnabled(false);
        }
         messageText.setText("");   
        }
    }//GEN-LAST:event_rejectRestaurantButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApproveRestaurantButton;
    private javax.swing.JLabel FDAMAngerImage;
    private javax.swing.JLabel FDAManagerLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel massageLabel;
    private javax.swing.JTextField messageText;
    private javax.swing.JButton rejectRestaurantButton;
    private javax.swing.JLabel restaurantIDLabel;
    private javax.swing.JTextField restaurantIDText;
    private javax.swing.JLabel restaurantNameLabel;
    private javax.swing.JTextField restaurantNameText;
    private javax.swing.JLabel restaurantZipCodeLabel;
    private javax.swing.JTextField restaurantZipCodeText;
    // End of variables declaration//GEN-END:variables
}