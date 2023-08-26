import java.util.Scanner;
public class aot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double s = (a+b+c)/2;
        double A;
        A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",A);

    }
}