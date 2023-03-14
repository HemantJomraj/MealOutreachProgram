/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.EBTMembers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shruti
 */
public class EBTMembersDirectory {
    private List<EBTMembers> ebtMem = new ArrayList<>();

    public List<EBTMembers> getEbtMem() {
        return ebtMem;
    }

    public void setEbtMem(List<EBTMembers> ebtMem) {
        this.ebtMem = ebtMem;
    }
    
    @Override
    public String toString() {
        return "EBTMembersDirectory{" + "EBTMembers=" + ebtMem + '}';
    }
}
