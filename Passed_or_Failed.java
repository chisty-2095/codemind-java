import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        if(a>=34 && b>=34 && c>=34 && d>=34 && e>=34) {
            System.out.print("PASSED");
        }
        else {
            System.out.print("FAILED");
        }
    }
}