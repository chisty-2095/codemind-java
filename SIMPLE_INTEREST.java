import java.util.Scanner;
public class simpi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, t, r;
        p = sc.nextInt();
        t = sc.nextInt();
        r = sc.nextInt();
        int si;
        si = (p*t*r)/100;
        System.out.println(si);
    }
}