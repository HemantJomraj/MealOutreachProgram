/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGODirectorRole;

import code.Enterprise.Enterprise;
import code.Org.OrgNGODirector;
import code.Org.Organization;
import code.Org.OrgFDAManager;
import code.SystemUserAccount.SystemUsers;
import code.ProcessQueue.FDAApprovalRequest;
import code.ProcessQueue.NGOFundRequest;
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
public class DirectorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TreasurerWorkAreaJPanel
     */
    private JPanel jPnl;
    private SystemUsers usrAcc;
    private OrgNGODirector ngoDirOrg;
    private Enterprise ent;

    public DirectorWorkAreaJPanel(JPanel jpanel, SystemUsers userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.ent = enterprise;
        this.jPnl = jpanel;
        this.ngoDirOrg = (OrgNGODirector) organization;
        this.usrAcc = userAccount;

        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDrctrWrkArea = new javax.swing.JTable();
        btnAssgndToMe = new javax.swing.JButton();
        btnPrcsReq = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 249, 232));

        jLabel1.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 130, 43));
        jLabel1.setText("Director Work Area ");

        tblDrctrWrkArea.setBackground(new java.awt.Color(204, 204, 204));
        tblDrctrWrkArea.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblDrctrWrkArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Status", "Amount", "Message", "Food Bank Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(tblDrctrWrkArea);

        btnAssgndToMe.setBackground(new java.awt.Color(204, 130, 43));
        btnAssgndToMe.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        btnAssgndToMe.setText("Assign To Me");
        btnAssgndToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssgndToMeActionPerformed(evt);
            }
        });

        btnPrcsReq.setBackground(new java.awt.Color(204, 130, 43));
        btnPrcsReq.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        btnPrcsReq.setText("Process Request");
        btnPrcsReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrcsReqActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/OfficeProcess.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(478, 478, 478))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(btnAssgndToMe)
                        .addGap(91, 91, 91)
                        .addComponent(btnPrcsReq))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrcsReq, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssgndToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssgndToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssgndToMeActionPerformed
        int selectedRow = tblDrctrWrkArea.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            ProcessRequest request = (NGOFundRequest) tblDrctrWrkArea.getValueAt(selectedRow, 5);
            if (request.getProcessStatus().equals("Sent to Director")) {
                request.setRcvr(usrAcc);
                request.setProcessStatus("Pending on " + request.getRcvr().getEmploye().getEmpName());
                populateTable();
                JOptionPane.showMessageDialog(null, "Success !! Request is assigned to you ");
            } else {
                JOptionPane.showMessageDialog(null, "Can't assign this work request, as the work request is in " + request.getProcessStatus() + " status", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnAssgndToMeActionPerformed

    private void btnPrcsReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrcsReqActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDrctrWrkArea.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            NGOFundRequest request = (NGOFundRequest) tblDrctrWrkArea.getValueAt(selectedRow, 5);
            if (request.getProcessStatus().equalsIgnoreCase("Sent to Director")) {
                JOptionPane.showMessageDialog(null, "Please assign selected request first");
                return;
            }
            if (request.getProcessStatus().equalsIgnoreCase("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request already completed", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!usrAcc.equals(request.getRcvr())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!usrAcc.equals(request.getRcvr())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!usrAcc.getEmploye().equals(request.getRcvr().getEmploye())) {
                JOptionPane.showMessageDialog(null, "Request assigned to other Officer", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (request.getProcessStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Cannot process a Rejected Request", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            //request.setStatus("Processing");
            DirectorWorkRequestJPanel directorProcessWorkRequestJPanel = new DirectorWorkRequestJPanel(jPnl, request);
            jPnl.add("TreasurerProcessWorkRequestJPanel", directorProcessWorkRequestJPanel);
            CardLayout layout = (CardLayout) jPnl.getLayout();
            layout.next(jPnl);
        }
    }//GEN-LAST:event_btnPrcsReqActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDrctrWrkArea.getModel();
        model.setRowCount(0);

        for (ProcessRequest request : ngoDirOrg.getProcessQueue().getProcesReq()) {
            String status = request.getProcessStatus();
            Object[] row = new Object[6];
            row[0] = request.getSndr().getEmploye().getEmpName();
            if (status.equalsIgnoreCase("Sent to Director") ) {
                row[1] = null;
            } else {
                row[1] = request.getRcvr() == null ? null : request.getRcvr().getEmploye().getEmpName();
            }

            row[2] = status;
            row[3] = ((NGOFundRequest) request).getAmountRequired();
            row[4] = ((NGOFundRequest) request).getProcessMessage();
            row[5] = request;

            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblDrctrWrkArea.setRowSorter(sorter);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssgndToMe;
    private javax.swing.JButton btnPrcsReq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDrctrWrkArea;
    // End of variables declaration//GEN-END:variables
}
