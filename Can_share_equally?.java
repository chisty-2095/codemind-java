import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a!=0 && a%2==0)
        {
            System.out.println("YES");
        }
        else if(a==0 && b%2==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}