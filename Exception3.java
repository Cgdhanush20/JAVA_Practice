import java.util.*;
public class Exception3 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try
        {
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by 0");
        }
        finally{
            System.out.println("Finally executed....");
        }
    }
}
