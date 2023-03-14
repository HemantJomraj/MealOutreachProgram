/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FoodBankAccountantRole;

import code.EcoSystem;
import code.Enterprise.Enterprise;
import code.Org.OrgAccountant;
import code.SystemUserAccount.SystemUsers;
import code.ProcessQueue.AccountBillRqst;
import code.ProcessQueue.cardRequest;
import code.ProcessQueue.ProcessRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Rajvi
 */
public class ReimburseBillingsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SystemUsers userAccount;
    private Enterprise enterprise;
    private OrgAccountant accountantOrganization;
    private EcoSystem ecoSystem;

    /**
     * Creates new form ProcessMedicalBillingsJPanel
     */
    public ReimburseBillingsJPanel(JPanel userProcessContainer, SystemUsers userAccount, Enterprise enterprise, OrgAccountant accountantOrganization, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.accountantOrganization = accountantOrganization;
        this.ecoSystem = ecoSystem;
        populateTable();
        populateInsuranceClaimTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processRequestButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BeneficiaryBillingTable = new javax.swing.JTable();
        assignToMeButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInsClmStatus = new javax.swing.JTable();
        EBTClaimStatusLabel = new javax.swing.JLabel();
        BeneficiaryBillLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 249, 232));

        processRequestButton.setBackground(new java.awt.Color(204, 130, 43));
        processRequestButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        processRequestButton.setForeground(new java.awt.Color(255, 255, 255));
        processRequestButton.setText("Process Request");
        processRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequestButtonActionPerformed(evt);
            }
        });

        BeneficiaryBillingTable.setBackground(new java.awt.Color(204, 204, 204));
        BeneficiaryBillingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "BeneficiaryId", "Beneficiary Name", "Assigned Volunteer", "Accountant ", "Status", "Billing Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BeneficiaryBillingTable);

        assignToMeButton.setBackground(new java.awt.Color(204, 130, 43));
        assignToMeButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        assignToMeButton.setForeground(new java.awt.Color(255, 255, 255));
        assignToMeButton.setText("AssignToMe");
        assignToMeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(204, 130, 43));
        backButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 130, 43));
        jLabel1.setText("Receptionist: Order Billing Area");

        tblInsClmStatus.setBackground(new java.awt.Color(204, 204, 204));
        tblInsClmStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "EBT Number", "Accountant", "EBT Agent", "Billing Amount", "Claim Amount", "Claim Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblInsClmStatus);

        EBTClaimStatusLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        EBTClaimStatusLabel.setForeground(new java.awt.Color(204, 130, 43));
        EBTClaimStatusLabel.setText("EBT Claim Status Table");

        BeneficiaryBillLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        BeneficiaryBillLabel.setForeground(new java.awt.Color(204, 130, 43));
        BeneficiaryBillLabel.setText("Order Billing Table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backButton)
                                .addGap(157, 157, 157)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(372, 372, 372)
                                .addComponent(BeneficiaryBillLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(assignToMeButton)
                                .addGap(69, 69, 69)
                                .addComponent(processRequestButton)))
                        .addGap(0, 325, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(EBTClaimStatusLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)))
                .addGap(16, 16, 16)
                .addComponent(BeneficiaryBillLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(assignToMeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(processRequestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(EBTClaimStatusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = BeneficiaryBillingTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row !");
            return;
        } else {

            AccountBillRqst accountBillingRequest = (AccountBillRqst) BeneficiaryBillingTable.getValueAt(selectedRow, 5);

            if (accountBillingRequest.getRcvr() != null) {
                if (accountBillingRequest.getRcvr().equals(userAccount)) {
                    if (accountBillingRequest.getProcessStatus().equalsIgnoreCase("Pending on " + accountBillingRequest.getRcvr().getEmploye().getEmpName())) {
                        AccountantRequestJPanel panel = new AccountantRequestJPanel(userProcessContainer, userAccount, accountBillingRequest, enterprise, ecoSystem);
                        userProcessContainer.add("AccountantProcessRequestJPanel", panel);
                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        layout.next(userProcessContainer);
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot process Request as request is in " + accountBillingRequest.getProcessStatus());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Not authorised!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please assign the request first!");
            }
        }
//        }
    }//GEN-LAST:event_processRequestButtonActionPerformed

    private void assignToMeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeButtonActionPerformed
        int selectedRow = BeneficiaryBillingTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row !");
            return;
        } else {
            ProcessRequest request = (AccountBillRqst) BeneficiaryBillingTable.getValueAt(selectedRow, 5);
            if (request.getRcvr() == null) {

                request.setRcvr(userAccount);
                request.setProcessStatus("Pending on " + request.getRcvr().getEmploye().getEmpName());
                populateTable();
            } else {
                JOptionPane.showMessageDialog(null, "The request is already assigned ");
            }
        }
    }//GEN-LAST:event_assignToMeButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BeneficiaryBillLabel;
    private javax.swing.JTable BeneficiaryBillingTable;
    private javax.swing.JLabel EBTClaimStatusLabel;
    private javax.swing.JButton assignToMeButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processRequestButton;
    private javax.swing.JTable tblInsClmStatus;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) BeneficiaryBillingTable.getModel();

        model.setRowCount(0);

        for (ProcessRequest request : accountantOrganization.getProcessQueue().getProcesReq()) {
            Object[] row = new Object[6];
            String status = request.getProcessStatus();
            row[0] = ((AccountBillRqst) request).getBeneficiary();
            row[1] = ((AccountBillRqst) request).getBeneficiary().getBenFirstName() + " " + ((AccountBillRqst) request).getBeneficiary().getBenLastName();
            row[2] = request.getSndr().getEmploye().getEmpName();
            if (status.equalsIgnoreCase("Sent to Treasurer") || status.equalsIgnoreCase("Sent to Secretary")) {
                row[2] = null;
            } else {
                row[3] = request.getRcvr() == null ? null : request.getRcvr().getEmploye().getEmpName();
            }
            //row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getProcessStatus();
            row[5] = ((AccountBillRqst) request);

            model.addRow(row);
        }
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        BeneficiaryBillingTable.setRowSorter(sorter);

    }

    public void populateInsuranceClaimTable() {
        List<cardRequest> insuranceWorkRequests = new ArrayList<>();
        ArrayList<ProcessRequest> workRequests = userAccount.getProcessQueue().getProcesReq();
        for (ProcessRequest workRequest : workRequests) {
            if (workRequest instanceof cardRequest) {
                insuranceWorkRequests.add((cardRequest) workRequest);
            }
        }

        DefaultTableModel model = (DefaultTableModel) tblInsClmStatus.getModel();

        model.setRowCount(0);
        for (cardRequest insuranceWorkRequest : insuranceWorkRequests) {
            Object[] row = new Object[6];
            row[0] = insuranceWorkRequest;
            row[1] = userAccount.getEmploye().getEmpName();
            row[2] = insuranceWorkRequest.getRcvr() == null ? "" : insuranceWorkRequest.getRcvr().getEmploye().getEmpName();
            row[3] = insuranceWorkRequest.getBillingAmt();
            row[4] = insuranceWorkRequest.getClmAmt();
            row[5] = insuranceWorkRequest.getProcessStatus();
            model.addRow(row);

        }
         TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblInsClmStatus.setRowSorter(sorter);
    }
}