import java.util.*;
public class RupeesToUSD 
{
      public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount in Rupees: ");
        double rupees = sc.nextDouble();

        double usd = Math.round(rupees / 95.80);
        System.out.print("Rupees in USD: " + usd + " dollar");
        sc.close();
        
    }
    
}
