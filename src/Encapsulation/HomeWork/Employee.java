package Encapsulation.HomeWork;

public class Employee extends Person {
    private String employeeId;

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void printDetails() {
        // Accessing fields using getter methods
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Employee ID: " + employeeId);
    }


}
