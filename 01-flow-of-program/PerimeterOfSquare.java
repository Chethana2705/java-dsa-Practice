import java.util.*;
public class PerimeterOfSquare
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int side = sc.nextInt();
        while(side <= 0)
        {
            System.out.println("Invalid input. Please enter valid positive values.");
            System.out.println("Enter the side: ");
            side = sc.nextInt();
        }

        int perimeterOfSquare = 4 * side;
        System.out.println("Perimeter of Square: " + perimeterOfSquare);
        sc.close();
        
    }
    
}
