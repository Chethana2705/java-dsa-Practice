import java.util.*;
public class AreaOfRectangle 
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      System.out.print("Enter the length: ");
      int length = sc.nextInt();
      while(length <= 0)
      {
        System.out.println("Invalid input. Please enter valid positive value.");
        System.out.print("Enter the length: ");
        length = sc.nextInt();
      }

      System.out.print("Enter the Breadth: ");
      int breadth = sc.nextInt();
      while(breadth <= 0)
      {
        System.out.println("Invalid input. Please enter valid positive value.");
        System.out.print("Enter the breadth: ");
        breadth = sc.nextInt();
      }

      int area = length * breadth;
      System.out.println("Area of Rectangle: " + area + "cm^2");
      sc.close();
    }
    
}
