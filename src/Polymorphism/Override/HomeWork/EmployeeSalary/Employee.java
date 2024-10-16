package Polymorphism.Override.HomeWork.EmployeeSalary;

public class Employee {
    int salary;
    String Emp_Id;
    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(String emp_Id, int salary) {
        Emp_Id = emp_Id;
        this.salary = salary;
    }

    protected double calculateSalary(double salary){
        return salary;
    }
}
