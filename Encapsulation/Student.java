package Encapsulation;

public class Student {
    private String name;
    private int idNumber;
    private final double gpa;

    public Student(String name, int idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
        Student student = new Student("Ayush", 101, 3.8);
        student.setName("A. Kumar");
        System.out.println("Name: " + student.getName() + ", GPA: " + student.getGpa());
    }
}
