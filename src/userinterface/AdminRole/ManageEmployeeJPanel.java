 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdminRole;

import code.Employee.Employee;
import code.Org.Organization;
import code.Org.OrgDirectory;
import code.Org.OrgBenificiary;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Rajvi
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrgDirectory orgDir;
    private JPanel jPanel;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer, OrgDirectory organizationDir) {
        initComponents();
        this.jPanel = userProcessContainer;
        this.orgDir = organizationDir;

        pplOrgCmbx();
        pplOrgEmpCmbx();
    }

    public void pplOrgCmbx() {
        organisationComboBox.removeAllItems();

        for (Organization organization : orgDir.getOrganizations()) {

            if (!(organization instanceof OrgBenificiary)) {
                organisationComboBox.addItem(organization);
            }
        }
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        organizationJTable.setRowSorter(sorter);
    }

    public void pplOrgEmpCmbx() {
        employeeOrganisationcomboBox.removeAllItems();

        for (Organization organization : orgDir.getOrganizations()) {

            if (!(organization instanceof OrgBenificiary)) {
                employeeOrganisationcomboBox.addItem(organization);
            }
        }
    }

    private void pplTbl(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

      
        for (Employee emp : organization.getEmpDir().getEmpList()) {
            Object[] row = new Object[2];
            row[0] = emp.getEmpId()-5;
            row[1] = emp.getEmpName();

            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        organizationJTable.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        organisationTable = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        rmployeeCreationButton = new javax.swing.JButton();
        organisationComboBox = new javax.swing.JComboBox();
        organisationLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        employeeOrganisationcomboBox = new javax.swing.JComboBox();
        organisationTextLabel = new javax.swing.JLabel();
        manageEmployeeLabel = new javax.swing.JLabel();
        manageEmployeeImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 249, 232));
        setForeground(new java.awt.Color(255, 255, 255));

        organizationJTable.setBackground(new java.awt.Color(204, 204, 204));
        organizationJTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organisationTable.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        rmployeeCreationButton.setBackground(new java.awt.Color(204, 130, 43));
        rmployeeCreationButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        rmployeeCreationButton.setText("Create Employee");
        rmployeeCreationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmployeeCreationButtonActionPerformed(evt);
            }
        });

        organisationComboBox.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 15)); // NOI18N
        organisationComboBox.setForeground(new java.awt.Color(204, 130, 43));
        organisationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organisationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organisationComboBoxActionPerformed(evt);
            }
        });

        organisationLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        organisationLabel.setForeground(new java.awt.Color(204, 130, 43));
        organisationLabel.setText("Organization");

        backButton.setBackground(new java.awt.Color(204, 204, 204));
        backButton.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        backButton.setText(" Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 130, 43));
        nameLabel.setText("Name");

        nameText.setBackground(new java.awt.Color(204, 204, 204));
        nameText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        employeeOrganisationcomboBox.setBackground(new java.awt.Color(204, 204, 204));
        employeeOrganisationcomboBox.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        employeeOrganisationcomboBox.setForeground(new java.awt.Color(204, 130, 43));
        employeeOrganisationcomboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeOrganisationcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeOrganisationcomboBoxActionPerformed(evt);
            }
        });

        organisationTextLabel.setBackground(new java.awt.Color(204, 204, 204));
        organisationTextLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        organisationTextLabel.setForeground(new java.awt.Color(204, 130, 43));
        organisationTextLabel.setText("Organization");

        manageEmployeeLabel.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        manageEmployeeLabel.setForeground(new java.awt.Color(204, 130, 43));
        manageEmployeeLabel.setText("Manage Employee");

        manageEmployeeImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageEmployeeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageEmployee.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(258, 258, 258)
                        .addComponent(manageEmployeeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(organisationLabel)
                                .addGap(44, 44, 44)
                                .addComponent(organisationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(organisationTable, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(organisationTextLabel)
                            .addComponent(nameLabel))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeOrganisationcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rmployeeCreationButton)
                .addGap(223, 223, 223))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageEmployeeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(manageEmployeeLabel)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organisationLabel)
                    .addComponent(organisationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organisationTextLabel)
                    .addComponent(employeeOrganisationcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(organisationTable, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel))
                        .addGap(36, 36, 36)
                        .addComponent(rmployeeCreationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addComponent(manageEmployeeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rmployeeCreationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmployeeCreationButtonActionPerformed

        Organization organization = (Organization) employeeOrganisationcomboBox.getSelectedItem();
        String name = nameText.getText();
        if (name == null || name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name Cannot be empty!");
            return;
        }

        organization.getEmpDir().createEmployee(name);
        pplTbl(organization);

        nameText.setText("");

    }//GEN-LAST:event_rmployeeCreationButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        jPanel.remove(this);
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_backButtonActionPerformed

    private void organisationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organisationComboBoxActionPerformed
        Organization organization = (Organization) organisationComboBox.getSelectedItem();
        if (organization != null) {
            pplTbl(organization);
        }
    }//GEN-LAST:event_organisationComboBoxActionPerformed

    private void employeeOrganisationcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeOrganisationcomboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeOrganisationcomboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox employeeOrganisationcomboBox;
    private javax.swing.JLabel manageEmployeeImage;
    private javax.swing.JLabel manageEmployeeLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox organisationComboBox;
    private javax.swing.JLabel organisationLabel;
    private javax.swing.JScrollPane organisationTable;
    private javax.swing.JLabel organisationTextLabel;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JButton rmployeeCreationButton;
    // End of variables declaration//GEN-END:variables
}