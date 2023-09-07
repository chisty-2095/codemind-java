import java.util.Scanner;
public class aot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double d = (a+b+c)/2;
        double e = Math.sqrt(d*((d-a)*(d-b)*(d-c)));
        System.out.printf("%.2f",e);
    }
}