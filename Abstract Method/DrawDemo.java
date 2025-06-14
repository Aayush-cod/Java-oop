abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw {
    double side;

    Cube(double s) {
        side = s;
    }

    double calculateVolume() {
        return side * side * side;
    }

    double calculateArea() {
        return 6 * side * side;
    }

    double calculatePerimeter() {
        return 12 * side;
    }
}

class Cuboid extends Draw {
    double l, w, h;

    Cuboid(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    double calculateVolume() {
        return l * w * h;
    }

    double calculateArea() {
        return 2 * (l*w + w*h + l*h);
    }

    double calculatePerimeter() {
        return 4 * (l + w + h);
    }
}

class Cylinder extends Draw {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double calculateVolume() {
        return Math.PI * r * r * h;
    }

    double calculateArea() {
        return 2 * Math.PI * r * (r + h);
    }

    double calculatePerimeter() {
        return 2 * Math.PI * r * 2; // circumference * 2 (top and bottom)
    }
}

public class DrawDemo {
    public static void main(String[] args) {
        Draw cube = new Cube(3);
        Draw cuboid = new Cuboid(2, 4, 6);
        Draw cylinder = new Cylinder(2, 5);

        System.out.println("Cube Volume: " + cube.calculateVolume() + ", Area: " + cube.calculateArea() + ", Perimeter: " + cube.calculatePerimeter());
        System.out.println("Cuboid Volume: " + cuboid.calculateVolume() + ", Area: " + cuboid.calculateArea() + ", Perimeter: " + cuboid.calculatePerimeter());
        System.out.println("Cylinder Volume: " + cylinder.calculateVolume() + ", Area: " + cylinder.calculateArea() + ", Perimeter: " + cylinder.calculatePerimeter());
    }
}
