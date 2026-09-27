import java.util.*;
public class AreaOfTriangle 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the length: ");
        double length = sc.nextDouble();

        double area = 0.5 * base * length;
        System.out.println("Area of Triangle: " + area);
        sc.close();
    }
}
