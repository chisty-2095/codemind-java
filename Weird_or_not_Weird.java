import java.util.Scanner;
public class tab {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.print("weird");
        }
        else if (n % 2 == 0 && n>=2 && n<=5) {
            System.out.print("not weird");
        }
        else if (n%2==0 && n>=6 && n<=20) {
            System.out.print("weird");
        }
        else if (n%2==0 && n>20) {
            System.out.print("not weird");
        }
    }
}
