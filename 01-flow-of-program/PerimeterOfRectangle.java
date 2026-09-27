import java.util.*;
public class PerimeterOfRectangle 
{
      public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();

        System.out.println("Enter the width: ");
        int width = sc.nextInt();

        int perimeterOfRectangle = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeterOfRectangle);
        sc.close();
        
    }
    
}
