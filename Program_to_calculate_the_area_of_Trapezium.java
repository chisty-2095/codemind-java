import java.util.Scanner;
public class ptaot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, h;
        a = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        double c;
        c = (a+b)*h;
        System.out.printf("%.4f",c/2);
    }
}