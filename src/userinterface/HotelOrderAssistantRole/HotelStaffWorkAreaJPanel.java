/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HotelOrderAssistantRole;

import code.EcoSystem;
import code.Org.OrderProcess;
import code.Org.Organization;
import code.SystemUserAccount.SystemUsers;
import code.ProcessQueue.OrderPlaceRequest;
import code.ProcessQueue.ProcessRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author shruti
 */
public class HotelStaffWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private SystemUsers userAccount;
    private OrderProcess labOrganization;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public HotelStaffWorkAreaJPanel(JPanel userProcessContainer, SystemUsers account, Organization organization, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.labOrganization = (OrderProcess) organization;

        popLabAsstTbl();
    }

    public void popLabAsstTbl() {
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();

        model.setRowCount(0);

        for (ProcessRequest request : labOrganization.getProcessQueue().getProcesReq()) {
            Object[] row = new Object[7];
            row[0] = request;
            row[1] = request.getSndr().getEmploye().getEmpName();
            row[2] = ((OrderPlaceRequest) request).getOrderPlacedVolunteer();
            row[3] = request.getProcessStatus();
            row[4] = ((OrderPlaceRequest) request).getBeneficiary().getBenFirstName() + " " + ((OrderPlaceRequest) request).getBeneficiary().getBenLastName();
            row[5] = ((OrderPlaceRequest) request).getBeneficiary().getBenId();
            row[6] = ((OrderPlaceRequest) request).getOrderType();
            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tbl.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        assignToMe = new javax.swing.JButton();
        processButton = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        btnBldTst = new javax.swing.JButton();
        btnMriScan = new javax.swing.JButton();
        btnXray = new javax.swing.JButton();

        setBackground(new java.awt.Color(253, 249, 232));
        setLayout(null);

        tbl.setBackground(new java.awt.Color(204, 204, 204));
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Beneficiary Name", "Beneficiary Id", "Order TYpe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);

        add(jScrollPane1);
        jScrollPane1.setBounds(110, 30, 730, 90);

        assignToMe.setBackground(new java.awt.Color(253, 249, 232));
        assignToMe.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        assignToMe.setText("Assign to me");
        assignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeActionPerformed(evt);
            }
        });
        add(assignToMe);
        assignToMe.setBounds(110, 140, 140, 40);

        processButton.setBackground(new java.awt.Color(253, 249, 232));
        processButton.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        processButton.setText("Process");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });
        add(processButton);
        processButton.setBounds(750, 140, 140, 40);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/brunch-order-up.gif"))); // NOI18N
        img.setToolTipText("");
        add(img);
        img.setBounds(220, 200, 710, 370);

        btnBldTst.setBackground(new java.awt.Color(253, 249, 232));
        btnBldTst.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        btnBldTst.setText("Meal");
        btnBldTst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBldTstActionPerformed(evt);
            }
        });
        add(btnBldTst);
        btnBldTst.setBounds(270, 140, 140, 40);

        btnMriScan.setBackground(new java.awt.Color(253, 249, 232));
        btnMriScan.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        btnMriScan.setText("Groceries");
        btnMriScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMriScanActionPerformed(evt);
            }
        });
        add(btnMriScan);
        btnMriScan.setBounds(590, 140, 140, 40);

        btnXray.setBackground(new java.awt.Color(253, 249, 232));
        btnXray.setFont(new java.awt.Font("YuGothic", 1, 18)); // NOI18N
        btnXray.setText("Canned Food");
        btnXray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXrayActionPerformed(evt);
            }
        });
        add(btnXray);
        btnXray.setBounds(430, 140, 140, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void assignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeActionPerformed

        int selectedRow = tbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }

        OrderPlaceRequest request = (OrderPlaceRequest) tbl.getValueAt(selectedRow, 0);
        if (request.getOrderPlacedVolunteer() == null) {
            if (request.getProcessStatus().equalsIgnoreCase("SentToStorage")) {
                request.setOrderPlacedVolunteer(userAccount);
                request.setProcessStatus("Pending on storage volunteer");
                //  request.setReceiver(userAccount);
                popLabAsstTbl();
                JOptionPane.showMessageDialog(null, "The request is assigned to You!");
            } else {
                JOptionPane.showMessageDialog(null, "Cannot assign this lab request as the current status is: " + request.getProcessStatus());
            }
        }
        else
        {
            if(userAccount.equals(request.getOrderPlacedVolunteer()))
            {
                JOptionPane.showMessageDialog(null,"Request is already assigned to you");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Request is assigned to other volunteer");
            }
        }

    }//GEN-LAST:event_assignToMeActionPerformed

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed

        int selectedRow = tbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        OrderPlaceRequest request = (OrderPlaceRequest) tbl.getValueAt(selectedRow, 0);

       // request.setStatus("Processing");
        HotelWorkRequestJPanel processWorkRequestJPanel = new HotelWorkRequestJPanel(userProcessContainer, request);
        if (request.getOrderPlacedVolunteer() != null) {
            if (userAccount.equals(request.getOrderPlacedVolunteer())) {
                if (request.getProcessStatus().equalsIgnoreCase("Pending on storage volunteer")) {

                    userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot process the request as the status is: " + request.getProcessStatus());
                }

            } else {

                JOptionPane.showMessageDialog(null, "Not authorised to process the request");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please assign the request first");
        }
    }//GEN-LAST:event_processButtonActionPerformed

    private void btnBldTstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBldTstActionPerformed

        int selectedRow = tbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }

        OrderPlaceRequest request = (OrderPlaceRequest) tbl.getValueAt(selectedRow, 0);
        if(userAccount.equals(request.getOrderPlacedVolunteer()))
            {   
                if(request.getProcessStatus().equalsIgnoreCase("Pending on storage volunteer")){
                    request.setOrderType("Meal");
                }else{
                    JOptionPane.showMessageDialog(null, "Order is already done!");
                }
                
            }else{
            JOptionPane.showMessageDialog(null, "Process volunteer is not assigned cannot modify the type of order");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBldTstActionPerformed

    private void btnMriScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMriScanActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }

        OrderPlaceRequest request = (OrderPlaceRequest) tbl.getValueAt(selectedRow, 0);
        if(userAccount.equals(request.getOrderPlacedVolunteer()))
            {   
                if(request.getProcessStatus().equalsIgnoreCase("Pending on storage volunteer")){
                    request.setOrderType("Groceries");
                }else{
                    JOptionPane.showMessageDialog(null, "Order is already done!");
                }
                
            }else{
            JOptionPane.showMessageDialog(null, "Process volunteer is not assigned cannot modify the type of order");
        }
    }//GEN-LAST:event_btnMriScanActionPerformed

    private void btnXrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXrayActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }

        OrderPlaceRequest request = (OrderPlaceRequest) tbl.getValueAt(selectedRow, 0);
        if(userAccount.equals(request.getOrderPlacedVolunteer()))
            {   
                if(request.getProcessStatus().equalsIgnoreCase("Pending on storage volunteer")){
                    request.setOrderType("Canned Food");
                }else{
                    JOptionPane.showMessageDialog(null, "Order is already done!");
                }
                
            }else{
            JOptionPane.showMessageDialog(null, "Process volunteer is not assigned cannot modify the type of order");
        }
    }//GEN-LAST:event_btnXrayActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMe;
    private javax.swing.JButton btnBldTst;
    private javax.swing.JButton btnMriScan;
    private javax.swing.JButton btnXray;
    private javax.swing.JLabel img;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processButton;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
