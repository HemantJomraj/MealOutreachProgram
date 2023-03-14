/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.ProcessQueue;

import java.util.ArrayList;

/**
 *
 * @author shruti
 */
public class Process {
    private ArrayList<ProcessRequest> procesReq; //List of work requests
//Getters and Setters
    public Process() {
        procesReq = new ArrayList();
    }

    public ArrayList<ProcessRequest> getProcesReq() {
        return procesReq;
    }
}
