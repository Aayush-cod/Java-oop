class Employee {
    private String name, jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void updateSalary(double amount) {
        salary += amount;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Developer", 60000);
        emp.display();
        emp.updateSalary(5000);
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}
