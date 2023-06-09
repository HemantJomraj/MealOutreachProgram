/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerRole;

import code.Enterprise.Enterprise;
import code.Org.OrgRestaurant;
import code.Org.OrderProcess;
import code.Org.Organization;
import code.SystemUserAccount.SystemUsers;
import code.ProcessQueue.RestaurantRequest;
import code.ProcessQueue.OrderPlaceRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jomraj
 */
public class HotelFoodRequestJPanel extends javax.swing.JPanel {

    private JPanel jPanel;
    private Enterprise entrpz;
    private SystemUsers usrAcnt;
    private OrderPlaceRequest pntTrWrkReq;
    //private BloodBankWorkRequest bloodBankWorkRequest;

    /**
     * Creates new form RequestLabTestJPanel
     */
    public HotelFoodRequestJPanel(JPanel userProcessContainer, SystemUsers account, Enterprise enterprise, OrderPlaceRequest patientTreatmentWorkRequest) {
        initComponents();

        this.jPanel = userProcessContainer;
        this.entrpz = enterprise;
        this.usrAcnt = account;
        this.pntTrWrkReq = patientTreatmentWorkRequest;
        //this.bloodBankWorkRequest = request;
        valueLabel.setText(enterprise.getName());
        requestButton.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        messageText = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        amountOfFoodLabel = new javax.swing.JLabel();
        amountOfFoodText = new javax.swing.JTextField();
        restaurantRequestLabel = new javax.swing.JLabel();
        restaurantImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 249, 232));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestButton.setBackground(new java.awt.Color(204, 130, 43));
        requestButton.setFont(new java.awt.Font("YuGothic", 1, 11)); // NOI18N
        requestButton.setForeground(new java.awt.Color(255, 255, 255));
        requestButton.setText("Request ");
        requestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestButtonActionPerformed(evt);
            }
        });
        add(requestButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 130, 30));

        messageLabel.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(204, 130, 43));
        messageLabel.setText("Message:");
        add(messageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 100, -1));
        add(messageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 130, 30));

        backButton.setBackground(new java.awt.Color(204, 130, 43));
        backButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        valueLabel.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(204, 130, 43));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 130, 20));

        enterpriseLabel.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(204, 130, 43));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 110, 20));

        amountOfFoodLabel.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        amountOfFoodLabel.setForeground(new java.awt.Color(204, 130, 43));
        amountOfFoodLabel.setText("Amount of food");
        add(amountOfFoodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 140, -1));
        add(amountOfFoodText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 130, 30));

        restaurantRequestLabel.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        restaurantRequestLabel.setForeground(new java.awt.Color(204, 130, 43));
        restaurantRequestLabel.setText("Restaurant Order Request ");
        add(restaurantRequestLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        restaurantImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/foodOrder.jpeg"))); // NOI18N
        restaurantImage.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(restaurantImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 490, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void requestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestButtonActionPerformed

        String  bloodUnits = amountOfFoodText.getText().trim();            
            try {
                Integer.parseInt(bloodUnits);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please provide integer values in amount of food (kgs) textfield");
                return;
            }
            
        
        String message = messageText.getText().trim();

        if (bloodUnits.equals("")) {
            JOptionPane.showMessageDialog(null, "Amount of food is mandatory!");
            return;
        }
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory");
            return;
        }

        
        pntTrWrkReq.setMsgFromRestaurant(message);
        pntTrWrkReq.setSndr(usrAcnt);
        pntTrWrkReq.setProcessStatus("SentToRestaurant");
        pntTrWrkReq.setRcvr(null);
        pntTrWrkReq.setAmountOfFood(Integer.valueOf(bloodUnits));
        
//        bloodBankWorkRequest.setMessage(message);
//        bloodBankWorkRequest.setSender(userAccount);
//        bloodBankWorkRequest.setStatus("SentToBloodBank");
//        bloodBankWorkRequest.setReceiver(null);

        Organization org = null;

        //added organization and iterating for individual enterprises and fetching all the organisations
        //the organisation will have bloodbankmanager for the enterprise
        for (Organization organization : entrpz.getOrgDir().getOrganizations()) {

            if (organization instanceof OrgRestaurant) {
                org = organization;
                break;
            }
        }
        if (org != null) {

            org.getProcessQueue().getProcesReq().add(pntTrWrkReq);
            usrAcnt.getProcessQueue().getProcesReq().add(pntTrWrkReq);


            JOptionPane.showMessageDialog(null, "Hotel order request sent successfully");
            messageText.setText("");
            amountOfFoodText.setText("");
            requestButton.setEnabled(false);
        }

    }//GEN-LAST:event_requestButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VolunteerWorkAreaJPanel dwjp = (VolunteerWorkAreaJPanel) component;
        dwjp.pplReqTbl();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);

    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountOfFoodLabel;
    private javax.swing.JTextField amountOfFoodText;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField messageText;
    private javax.swing.JButton requestButton;
    private javax.swing.JLabel restaurantImage;
    private javax.swing.JLabel restaurantRequestLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
