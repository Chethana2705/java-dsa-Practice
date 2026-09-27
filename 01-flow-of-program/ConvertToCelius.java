// c = (f - 32)* 9/5
import java.util.*;
public class ConvertToCelius 
{
      public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit= sc.nextDouble();
        
        double celius = (fahrenheit - 32) * ((double)5/9);
        System.out.println("Fahrenheit temperature in Celius: " + celius);
        sc.close();
        
    }
    
}
