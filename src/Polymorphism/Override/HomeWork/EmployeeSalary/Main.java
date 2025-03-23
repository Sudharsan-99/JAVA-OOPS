package Polymorphism.Override.HomeWork.EmployeeSalary;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee>emp=new ArrayList<>();
        emp.add(new FullTimeEmployee("205_5R",30000));
        emp.add(new FullTimeEmployee("200R_if",50000));
        emp.add(new PartTimeEmployee("123",2500));
        emp.add(new PartTimeEmployee("456",5000));
        for(Employee employee:emp){
            System.out.println("The Salary of "+employee.Emp_Id+" is "+employee.calculateSalary(employee.salary));
        }
    }
}
