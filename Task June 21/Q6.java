public class Q6 {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Q6 calc = new Q6();
        System.out.println(calc.add(5, 10));           // 15
        System.out.println(calc.add(2.5, 3.5));         // 6.0
        System.out.println(calc.add(1, 2, 3));          // 6
    }
}
