import java.util.*;
public class AreaOfTriangle 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.println("Enter the length: ");
        int length = sc.nextInt();

        double area = 0.5 * base * length;
        System.out.println("Area of Triangle: " + area);
        sc.close();
    }
}
