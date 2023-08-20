import java.util.Scanner;
public class tring{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a,b,c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    if(a+b>c && a+c>b && b+c>a) {
        System.out.print("Valid triangle");
    }
    else {
        System.out.print("Invalid triangle");
    }
}
}