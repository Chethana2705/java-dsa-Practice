
import java.util.*;

public class ConversionOfKilometerToMiles
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        double kilometers = sc.nextDouble();

        while (kilometers < 0)
        {
            System.out.println("Invalid input. Please enter a non-negative value.");
            System.out.print("Enter the distance in kilometers: ");
            kilometers = sc.nextDouble();
        }

        double miles = kilometers * 0.621371;

        System.out.printf("Distance in miles: %.2f miles", miles);

        sc.close();
    }
}

