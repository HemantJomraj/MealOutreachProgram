/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EBTAgent;
import userinterface.EBTAgent.AddEBTMemberJPanel;
import code.Enterprise.Enterprise;
import code.Org.OrgEBTAgent;
import code.Org.Organization;
import code.SystemUserAccount.SystemUsers;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.UUID;
import javax.swing.JPanel;

/**
 *
 * @author shruti
 */
public class EBTAgentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EBTAgentWorkAreaJPanel
     */
    private JPanel jPanel;
    private SystemUsers usrAcnt;
    private OrgEBTAgent insrAgntOrg;
    private Enterprise entrpz;

    public EBTAgentWorkAreaJPanel(JPanel jpanel, SystemUsers userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.jPanel = jpanel;
        this.usrAcnt = userAccount;
        this.insrAgntOrg = (OrgEBTAgent) organization;
        this.entrpz = enterprise;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addNewCardHolderButton = new javax.swing.JButton();
        processCardRequestButton = new javax.swing.JButton();
        img = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        addNewCardHolderButton.setBackground(new java.awt.Color(204, 130, 43));
        addNewCardHolderButton.setFont(new java.awt.Font("YuGothic", 1, 11)); // NOI18N
        addNewCardHolderButton.setForeground(java.awt.Color.white);
        addNewCardHolderButton.setText("Add New Card Holder");
        addNewCardHolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewCardHolderButtonActionPerformed(evt);
            }
        });
        add(addNewCardHolderButton);
        addNewCardHolderButton.setBounds(0, 10, 184, 41);

        processCardRequestButton.setBackground(new java.awt.Color(204, 130, 43));
        processCardRequestButton.setFont(new java.awt.Font("YuGothic", 1, 11)); // NOI18N
        processCardRequestButton.setForeground(java.awt.Color.white);
        processCardRequestButton.setText("Process Card Request");
        processCardRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processCardRequestButtonActionPerformed(evt);
            }
        });
        add(processCardRequestButton);
        processCardRequestButton.setBounds(700, 550, 200, 39);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agent.png"))); // NOI18N
        add(img);
        img.setBounds(1, 5, 1130, 510);
    }// </editor-fold>//GEN-END:initComponents

    private void addNewCardHolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewCardHolderButtonActionPerformed
        String cardNo = UUID.randomUUID().toString().substring(0, 7);
        CardLayout layout = (CardLayout) jPanel.getLayout();
        jPanel.add("AddEBTMemberJPanel",new AddEBTMemberJPanel(jPanel, usrAcnt, entrpz, cardNo));
        layout.next(jPanel);

    }//GEN-LAST:event_addNewCardHolderButtonActionPerformed

    private void processCardRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processCardRequestButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) jPanel.getLayout();
        jPanel.add("ProcessInsuranceRequestsJPanel", new EBTRequestsJPanel(jPanel, usrAcnt, entrpz, insrAgntOrg));
        layout.next(jPanel);
    }//GEN-LAST:event_processCardRequestButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewCardHolderButton;
    private javax.swing.JLabel img;
    private javax.swing.JButton processCardRequestButton;
    // End of variables declaration//GEN-END:variables

    

    }
