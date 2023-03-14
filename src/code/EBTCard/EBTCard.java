/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.EBTCard;


/**
 *
 * @author shruti
 */
public class EBTCard {
    private String ebtType;
    private String EBTAgent;
    private double allowance;
    private String requirement;
    private double monthlyReimbursement;
    
    public EBTCard(String ebtType, String ebtAgent, double allowance) {
        this.ebtType = ebtType;
        this.EBTAgent = ebtAgent;
        this.allowance = allowance;
    }

    public String getEbtType() {
        return ebtType;
    }

    public void setEbtType(String ebtType) {
        this.ebtType = ebtType;
    }

    public String getEBTAgent() {
        return EBTAgent;
    }

    public void setEBTAgent(String EBTAgent) {
        this.EBTAgent = EBTAgent;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public double getMonthlyReimbursement() {
        return monthlyReimbursement;
    }

    public void setMonthlyReimbursement(double monthlyReimbursement) {
        this.monthlyReimbursement = monthlyReimbursement;
    }
    
    @Override
    public String toString() {
        return ebtType;
    }

}
