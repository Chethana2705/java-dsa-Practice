import java.util.*;
public class AreaofCircle 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of circle: ");
        int   radius = sc.nextInt();
        while (radius < 0 )
        {
            System.out.println("Please enter valid non-negative value: ");
            System.out.print("Enter the Radius of circle: ");
             radius = sc.nextInt();
        }
       
         
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle: " + area);
        sc.close();
    }
}
