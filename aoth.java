import java.util.Scanner;
public class aoth {
    public static void main(String[] args) {
        int n = 10, m = 2;
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);
        switch(choice) {
            case '+':
            System.out.println(n+m);
            break;
            case '-':
            System.out.println(n-m);
            break;
            case '*':
            System.out.println(n*m);
            break;
            case '%':
            System.out.println(n%m);
            break;
            default:
            System.out.println("Invalid");
        }
    }
}

