import java.util.Scanner;
public class tc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double F;
        F = 32+(c * 9/5.0);
        System.out.printf("%.2f",F);
    }
}