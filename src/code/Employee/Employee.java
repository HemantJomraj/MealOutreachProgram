/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Employee;

/**
 *
 * @author Rajvi
 */
public class Employee {
    private String empName;  //Employee Name
    private int empId;      //Employee ID
    private static int count = 1;           //Employee ID Count

    public Employee () {
        //Set the employeed Id as count and increment count everytime new staff is created
        empId = count;
        count++;
    }
    //Getter Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    
    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return empName;
    }
    
    
}
