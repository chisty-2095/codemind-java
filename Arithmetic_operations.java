import java.util.Scanner;
public class ao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Sum:" + (a+b));
        System.out.println("Difference:" + (a-b));
        System.out.println("Product:" + (a*b));
        System.out.println("Quotient:" + (a/b));
        System.out.println("Remainder:" + (a%b));
    }
}