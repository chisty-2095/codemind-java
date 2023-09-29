class SimpleCalculator {
    void add(int a, int b) {
        System.out.println(a + b);
    }
    void subtract(int a, int b) {
        System.out.println(a - b);
    }
    void multiply(int a, int b) {
        System.out.println(a * b);
    }
    void divide(int a, int b) {
        System.out.println(a / b);
    }
}
class AdvancedCalculator extends SimpleCalculator {
    void getSqrt(int n) {
        System.out.println(Math.sqrt(n));
    }
    void getPow(int b, int e) {
        System.out.println(Math.pow(b, e));
    }
}
public class inher {
    public static void main(String[] args) {
        SimpleCalculator sc1 = new SimpleCalculator();
        sc1.add(10, 20);
        sc1.subtract(100, 90);
        sc1.multiply(34, 6);
        sc1.divide(70, 2);
        AdvancedCalculator ac1 = new AdvancedCalculator();
        ac1.getSqrt(81);
        ac1.getPow(5, 4);
    }
}

