/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import code.Networks.Networks;
import code.Org.Organization;
import code.Role.Role;
import code.Role.RoleSysAdmin;
import java.util.ArrayList;

/**
 *
 * @author jomraj
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem ecosystem;
    private ArrayList<Networks> networks;
    public static EcoSystem getInstance(){
        if(ecosystem==null){
            ecosystem=new EcoSystem();
        }
        return ecosystem;
    }
    
    public Networks createAndAddNetwork(){
        Networks network=new Networks();
        networks.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new RoleSysAdmin());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networks=new ArrayList<Networks>();
    }

    public ArrayList<Networks> getNetworks() {
        return networks;
    }

    public void setNetworks(ArrayList<Networks> networks) {
        this.networks = networks;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUsrAccDir().isUniqueUser(userName)){
            return false;
        }
        for(Networks network:networks){
            
        }
        return true;
    }
}
