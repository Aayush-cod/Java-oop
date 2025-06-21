abstract class ManipulatableShape {
    abstract void resize();
    abstract void rotate();
}

class Circle extends ManipulatableShape {
    void resize() { 
        System.out.println("Resizing Circle..."); 
    }
    void rotate() { 
        System.out.println("Rotating Circle..."); 
    }
}

class Square extends ManipulatableShape {
    void resize() { 
        System.out.println("Resizing Square..."); 
    }
    void rotate() { 
        System.out.println("Rotating Square..."); 
    }
}

class Triangle extends ManipulatableShape {
    void resize() { 
        System.out.println("Resizing Triangle..."); 
    }
    void rotate() { 
        System.out.println("Rotating Triangle..."); 
    }
}

public class Q5 {
    public static void main(String[] args) {
        ManipulatableShape[] shapes = {
            new Circle(), new Square(), new Triangle()
        };
        for (ManipulatableShape s : shapes) {
            s.resize();
            s.rotate();
        }
    }
}
