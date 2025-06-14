abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double radius;
    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double a, b, c, h;

    Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    double calculateArea() {
        return 0.5 * b * h;
    }

    double calculatePerimeter() {
        return a + b + c;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 7);
        Shape triangle = new Triangle(3, 4, 5, 2.5);

        System.out.println("Circle: Area = " + circle.calculateArea() + ", Perimeter = " + circle.calculatePerimeter());
        System.out.println("Rectangle: Area = " + rectangle.calculateArea() + ", Perimeter = " + rectangle.calculatePerimeter());
        System.out.println("Triangle: Area = " + triangle.calculateArea() + ", Perimeter = " + triangle.calculatePerimeter());
    }
}
