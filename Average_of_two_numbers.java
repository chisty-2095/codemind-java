import java.util.Scanner;
public class avg{
    public static void main(String[] args){
        double a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        double c = (a+b)/2;
        System.out.printf("Average of %.0f and %.0f is: %.2f",a,b,c);
    }
}