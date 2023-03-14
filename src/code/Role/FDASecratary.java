/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Role;

import code.EcoSystem;
import code.Enterprise.Enterprise;
import code.Org.Organization;
import code.Org.OrgSecretary;
import code.SystemUserAccount.SystemUsers;
import javax.swing.JPanel;
import userinterface.FDASecretaryRole.SecretaryWorkAreaJPanel;


/**
 *
 * @author jomraj
 */
public class FDASecratary extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, SystemUsers userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SecretaryWorkAreaJPanel(userProcessContainer, userAccount, (OrgSecretary)organization, enterprise);
    }
    
}

