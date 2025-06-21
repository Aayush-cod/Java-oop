class Employee {
    double baseSalary = 30000;
    double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double bonus = 5000;
    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println("Manager Salary: " + m.calculateSalary());
    }
}
