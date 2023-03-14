/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Networks;

import code.Enterprise.EntDirectory;

/**
 *
 * @author shruti
 */
public class Networks {
    private String networkName;
    private EntDirectory entDir;
    
    
    public Networks(){
        entDir=new EntDirectory();
    }
    
    public String getNetwrkName() {
        return networkName;
    }

    public void setNetwrkName(String netwrkNm) {
        this.networkName = netwrkNm;
    }

    public EntDirectory getEntDir() {
        return entDir;
    }
    
    @Override
    public String toString(){
        return networkName;
    }
}
