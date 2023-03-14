/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code.Employee;

import java.util.ArrayList;

/**
 *
 * @author Rajvi
 */
public class EmployeeDirectory {
    private ArrayList<Employee> empList;  //List of Staff

    //Getters and Setters
    public EmployeeDirectory (){
        empList = new ArrayList();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    //Creating new employee, adding it to the list of employee and returning the new employee
    public Employee createEmployee(String name) {
        Employee employee = new Employee    ();
        employee.setEmpName(name);
        empList.add(employee);
        return employee;
    }
    
}
