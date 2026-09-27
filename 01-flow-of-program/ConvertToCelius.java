// c = (f - 32)* 9/5
import java.util.*;
public class ConvertToCelius 
{
      public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheit= sc.nextDouble();
        
        double celius = (fahrenheit - 32) * (9/5);
        System.out.println("Fahrenheit temperature in Celius: " + celius);
        sc.close();
        
    }
    
}
