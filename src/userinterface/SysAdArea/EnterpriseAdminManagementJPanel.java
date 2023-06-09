/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rajvi
 */

package userinterface.SysAdArea;

import code.EcoSystem;
import code.Employee.Employee;
import code.Enterprise.*;
import code.Networks.Networks;
import code.Role.RoleEntAdmin;
import code.Role.Role;
import code.SystemUserAccount.SystemUsers;
import code.SystemUserAccount.UsersDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class EnterpriseAdminManagementJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private SystemUsers userAccount;
    private Employee employee;
    private UsersDirectory userAccountDirectory;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public EnterpriseAdminManagementJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        usernameText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        passwordText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        rePasswordText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        nameText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populatentTbl();
        popNtwrkComboBox();
    }

    private void populatentTbl() {
        DefaultTableModel model = (DefaultTableModel) manageEnterpriseTable.getModel();

        model.setRowCount(0);
        for (Networks network : system.getNetworks()) {
            for (Enterprise enterprise : network.getEntDir().getEnterpriseList()) {
                for (SystemUsers userAccount : enterprise.getUsrAccDir().getUsrAccList()) {
                    Object[] row = new Object[4];
                    row[0] = enterprise.getName();
                    row[1] = network.getNetwrkName();
                    row[2] = userAccount.getUsrName();
                    row[3] = enterprise.getEntType().getValue();

                    model.addRow(row);
                }
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        manageEnterpriseTable.setRowSorter(sorter);
            }
        }
         TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        manageEnterpriseTable.setRowSorter(sorter);
    }

    private void popNtwrkComboBox() {
        networkComboBox.removeAllItems();

        for (Networks network : system.getNetworks()) {
            networkComboBox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Networks network) {
        EnterpriseComboBox.removeAllItems();

        for (Enterprise enterprise : network.getEntDir().getEnterpriseList()) {
            EnterpriseComboBox.addItem(enterprise);
        }

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
        manageEnterpriseTable = new javax.swing.JTable();
        networkLabel = new javax.swing.JLabel();
        networkComboBox = new javax.swing.JComboBox();
        usernameLabel = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        EnterpriseComboBox = new javax.swing.JComboBox();
        submitButton = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        backButton = new javax.swing.JButton();
        rePasswordText = new javax.swing.JPasswordField();
        rePasswordLabel = new javax.swing.JLabel();
        manageEntAdminLAbel = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 249, 232));
        setLayout(null);

        manageEnterpriseTable.setBackground(new java.awt.Color(204, 204, 204));
        manageEnterpriseTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manageEnterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manageEnterpriseTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(200, 90, 671, 88);

        networkLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        networkLabel.setForeground(new java.awt.Color(204, 130, 43));
        networkLabel.setText("Network");
        add(networkLabel);
        networkLabel.setBounds(382, 230, 70, 22);

        networkComboBox.setForeground(new java.awt.Color(204, 130, 43));
        networkComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });
        add(networkComboBox);
        networkComboBox.setBounds(490, 230, 136, 27);

        usernameLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(204, 130, 43));
        usernameLabel.setText("Username");
        add(usernameLabel);
        usernameLabel.setBounds(360, 300, 90, 22);

        usernameText.setBackground(new java.awt.Color(204, 204, 204));
        add(usernameText);
        usernameText.setBounds(490, 290, 136, 25);

        enterpriseLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(204, 130, 43));
        enterpriseLabel.setText("Enterprise");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(360, 270, 90, 22);

        EnterpriseComboBox.setForeground(new java.awt.Color(204, 130, 43));
        EnterpriseComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(EnterpriseComboBox);
        EnterpriseComboBox.setBounds(490, 260, 136, 27);

        submitButton.setBackground(new java.awt.Color(204, 130, 43));
        submitButton.setFont(new java.awt.Font("YuGothic", 0, 13)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("CREATE");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton);
        submitButton.setBounds(490, 450, 100, 29);

        passwordLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(204, 130, 43));
        passwordLabel.setText("Password");
        add(passwordLabel);
        passwordLabel.setBounds(367, 330, 80, 22);

        nameText.setBackground(new java.awt.Color(204, 204, 204));
        nameText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(nameText);
        nameText.setBounds(490, 410, 136, 28);

        nameLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 130, 43));
        nameLabel.setText("Name");
        add(nameLabel);
        nameLabel.setBounds(380, 410, 70, 22);

        passwordText.setBackground(new java.awt.Color(204, 204, 204));
        add(passwordText);
        passwordText.setBounds(490, 330, 136, 25);

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
        backButton.setBounds(10, 11, 90, 30);

        rePasswordText.setBackground(new java.awt.Color(204, 204, 204));
        rePasswordText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        add(rePasswordText);
        rePasswordText.setBounds(490, 370, 136, 29);

        rePasswordLabel.setFont(new java.awt.Font("YuGothic", 1, 14)); // NOI18N
        rePasswordLabel.setForeground(new java.awt.Color(204, 130, 43));
        rePasswordLabel.setText("re-enter Password");
        add(rePasswordLabel);
        rePasswordLabel.setBounds(319, 370, 130, 22);

        manageEntAdminLAbel.setFont(new java.awt.Font("YuGothic", 1, 24)); // NOI18N
        manageEntAdminLAbel.setForeground(new java.awt.Color(204, 130, 43));
        manageEntAdminLAbel.setText("ENTERPRISE ADMIN DETAILS");
        add(manageEntAdminLAbel);
        manageEntAdminLAbel.setBounds(320, 20, 380, 37);

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/73-734831_happy-customer-clipart.png"))); // NOI18N
        add(img);
        img.setBounds(70, 480, 310, 280);
    }// </editor-fold>//GEN-END:initComponents

    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed

        Networks network = (Networks) networkComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }


    }//GEN-LAST:event_networkComboBoxActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        Enterprise enterprise = (Enterprise) EnterpriseComboBox.getSelectedItem();

        String username = usernameText.getText();
        Role role = null;
        String password = String.valueOf(passwordText.getPassword());
        String rePassword = String.valueOf(rePasswordText.getPassword());
        String name = nameText.getText();

        if (username == null || username.equals("")) {
            usernameText.setBorder(BorderFactory.createLineBorder(Color.RED));
            usernameLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Username can't be empty");
            return;
        }
        if (password == null || password.equals("")) {
            usernameText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            usernameLabel.setForeground(Color.BLACK);
            passwordText.setBorder(BorderFactory.createLineBorder(Color.RED));
            passwordLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Password can't be empty");
            return;
        }

        if (!passwordPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Password should be at least 6 Characters "
                    + "digits and a combination of number , uppercase letter, "
                    + "lowercase letter and Special characters are not allowed other than $, +, _");
            passwordText.setBorder(BorderFactory.createLineBorder(Color.RED));
            passwordLabel.setForeground(Color.RED);
            return;
        }

        if (!password.equals(rePassword)) {
            JOptionPane.showMessageDialog(null, "Passwords don't match");
            passwordText.setBorder(BorderFactory.createLineBorder(Color.RED));
            rePasswordText.setBorder(BorderFactory.createLineBorder(Color.RED));
            passwordLabel.setForeground(Color.RED);
            rePasswordLabel.setForeground(Color.RED);
            return;
        }

        if (name == null || name.equals("")) {
            passwordText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            rePasswordText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            passwordLabel.setForeground(Color.BLACK);
            rePasswordLabel.setForeground(Color.BLACK);
            nameText.setBorder(BorderFactory.createLineBorder(Color.RED));
            nameLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Name can't be empty");
            return;
        } else {
            List<SystemUsers> userAccountList = enterprise.getUsrAccDir().getUsrAccList();
            for (SystemUsers userAccount : userAccountList) {
                if (userAccount.getUsrName().equals(username)) {
                    JOptionPane.showMessageDialog(null, "username already taken!!");
                    usernameText.setBorder(BorderFactory.createLineBorder(Color.RED));
                    return;
                }
            }
            
            Employee employee = enterprise.getEmpDir().createEmployee(name);
            SystemUsers userAccount = enterprise.getUsrAccDir().createUserAccount(username, password, employee, new RoleEntAdmin());
            populatentTbl();

            passwordLabel.setForeground(Color.BLACK);
            rePasswordLabel.setForeground(Color.BLACK);
            nameLabel.setForeground(Color.BLACK);
            nameText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            passwordText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            rePasswordText.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            nameText.setText("");
            passwordText.setText("");
            rePasswordText.setText("");
            usernameText.setText("");
        }

    }//GEN-LAST:event_submitButtonActionPerformed

    private boolean passwordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[$+_])(?=\\S+$).{6,}$");
        Matcher m = p.matcher(String.valueOf(passwordText.getPassword()));
        boolean b = m.matches();
        return b;
    }


    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SysAdWorkJPanel sysAdminwjp = (SysAdWorkJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox EnterpriseComboBox;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel img;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageEntAdminLAbel;
    private javax.swing.JTable manageEnterpriseTable;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JLabel networkLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel rePasswordLabel;
    private javax.swing.JPasswordField rePasswordText;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
