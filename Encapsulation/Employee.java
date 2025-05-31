package Encapsulation;

public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int id) {
        this.employeeId = id;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double changeAmount) {
        if (salary + changeAmount >= 0) {
            salary += changeAmount;
        } else {
            System.out.println("Invalid salary update.");
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Alice");
        emp.setEmployeeId(201);
        emp.updateSalary(3000);
        emp.updateSalary(-1000);
        System.out.println("Name: " + emp.getName() + ", Salary: " + emp.getSalary());
    }
}
