import java.util.*;
public class RupeesToUSD 
{
      public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount in Rupees: ");
        double rupees = sc.nextDouble();
        while(rupees < 0)
        {
            System.out.println("Negative rupees can't be processed so plaese update valid input");
            System.out.println("Enter the Amount in Rupees: ");
            rupees = sc.nextDouble();
        }

        double usd = rupees / 95.80;
        System.out.printf("Rupees in USD: %.2f dollar " , usd , " dollar");
        sc.close();
        
    }
    
}
