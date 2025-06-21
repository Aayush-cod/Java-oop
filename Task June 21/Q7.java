public class Q7 {
    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Q7 geo = new Q7();
        System.out.println("Circle: " + geo.calculateArea(5));
        System.out.println("Rectangle: " + geo.calculateArea(4, 6));
        System.out.println("Triangle: " + geo.calculateArea(3, 8, true));
    }
}
