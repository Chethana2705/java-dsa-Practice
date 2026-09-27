// f = (c * (9/5)) + 32
import java.util.*;
public class ConvertToFahrenheit 
{
      public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature in celius: ");
        double celius = sc.nextDouble();
        double value = (double)9/5 ;

        double fahrenheit = (celius * value) + 32;
        System.out.println("Celius temperature in Fahrenheit: " + fahrenheit);
        sc.close();
        
    }
    
}
