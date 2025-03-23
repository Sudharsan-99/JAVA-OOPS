package Polymorphism.Override.HomeWork.EmployeeSalary;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String Emp_Id,int salary) {
        super(salary);
        this.Emp_Id=Emp_Id;
    }

    @Override
    public double calculateSalary(double salary){
        return salary*12;
    }
}
