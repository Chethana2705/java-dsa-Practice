//SI = (P * R * T)/100
import java.util.Scanner;
public class SimpleIntrest 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        int principal = sc.nextInt();

        System.out.print("Enter the Rate of Intrest: ");
        int rate = sc.nextInt();

        System.out.print("Enter the Time amount: ");
        int time = sc.nextInt();

        long simpleIntrest = (long)principal * rate * time  / 100;
        System.out.print("Simple Intrest :  " + simpleIntrest);
        sc.close();


    }

    
}
