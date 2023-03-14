/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Rajvi
 */
public class EntDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> entList) {
        this.enterpriseList = entList;
    }
    
    public EntDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType entType){
        
        Enterprise ent=null;
        
        if(entType==Enterprise.EnterpriseType.FoodBankEnterprise){
            ent=new FoodBankEnterprise(name);
            enterpriseList.add(ent);
        }
        
        else if(entType == Enterprise.EnterpriseType.FDAEnterprise)
        {
            ent =  new FDAEnterprise(name);
            enterpriseList.add(ent);
            
        }
        
        else if(entType == Enterprise.EnterpriseType.EBTEnterprise)
        {
            ent = new EBTEnterprise(name);
            enterpriseList.add(ent);
            
            
        }
        else if(entType == Enterprise.EnterpriseType.NGOEnterprise)
        {
            ent = new NGOEnterprise(name);
            enterpriseList.add(ent);
            
        }
        return ent;
    }
}
