/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Beneficiary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jomraj
 */
public class BeneficiaryDirectory {
     private List<Beneficiary> beneficiaries = new ArrayList<>();//List of Beneficiaries

    //Getters and Setters
    public List<Beneficiary> getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(List<Beneficiary> beneficiaries) {
        this.beneficiaries = beneficiaries;
    }
    
}
