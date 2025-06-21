abstract class MenuItem {
    abstract void prepare();
    abstract void serve();
}

class Appetizer extends MenuItem {
    void prepare() { 
        System.out.println("Preparing Appetizer..."); 
    }
    void serve() { 
        System.out.println("Serving Appetizer!"); 
    }
}

class MainCourse extends MenuItem {
    void prepare() { 
        System.out.println("Cooking Main Course..."); 
    }
    void serve() { 
        System.out.println("Serving Main Course!"); 
    }
}

class Beverage extends MenuItem {
    void prepare() { 
        System.out.println("Pouring Beverage..."); 
    }
    void serve() { 
        System.out.println("Serving Beverage!"); 
    }
}

public class Q4 {
    public static void main(String[] args) {
        MenuItem[] items = {
            new Appetizer(),
            new MainCourse(),
            new Beverage()
        };
        for (MenuItem item : items) {
            item.prepare();
            item.serve();
        }
    }
}
