package Encapsulation.HomeWork;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Jane Doe");
        employee.setAge(28);
        employee.setAddress("456 Elm St, Anytown, USA");
        employee.setEmployeeId("E123");

        employee.printDetails();
    }
}
