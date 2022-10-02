/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author kaustubh
 */
public class EmployeeHistory {
    
    private ArrayList<Employee> history;
    
    public EmployeeHistory(){
        this.history = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public Employee addNewEmployeeHistory(){
        Employee employee = new Employee();
        history.add(employee);
        return employee;
    }
    
    public void deleteEmployee(Employee em){
        history.remove(em);
    }
    Employee employee;
    public Employee searchEmployee(Employee e){
        
        for(Employee em : history){
            if(em.getEmployee_ID() == e.getEmployee_ID()){
                employee = em;
            }else{
                employee = null;
            }
        }
        return employee;
      
    }
    
    
}
