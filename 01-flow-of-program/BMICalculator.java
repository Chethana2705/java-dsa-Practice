import java.util.*;
public class BMICalculator 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter the Height in meters: ");
        double height = sc.nextDouble();

        double bmi = weight / (height*height);
        System.out.printf("BMI: %.2f%n  " , bmi);

    }
    
}
