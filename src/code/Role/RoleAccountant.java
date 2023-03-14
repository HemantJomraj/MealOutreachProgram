/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Role;

import code.EcoSystem;
import code.Enterprise.Enterprise;
import code.Org.OrgAccountant;
import code.Org.Organization;
import code.SystemUserAccount.SystemUsers;
import javax.swing.JPanel;
import userinterface.FoodBankAccountantRole.AccountantWorkAreaJPanel;
/**
 *
 * @author Rajvi
 */
public class RoleAccountant extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, SystemUsers account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
        return new AccountantWorkAreaJPanel(userProcessContainer, account, (OrgAccountant)organization, enterprise, ecosystem);
    }
    
}

