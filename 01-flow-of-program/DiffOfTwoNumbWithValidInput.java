import java.util.*;
public class DiffOfTwoNumbWithValidInput 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber;
        while(!sc.hasNextInt())
        {
            System.out.println("Please enter the valid input");
            sc.next();
            System.out.print("Enter the first number: ");
        }
        firstNumber = sc.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber;
         while(!sc.hasNextInt())
        {
            System.out.println("Please enter the valid input");
            sc.next();
            System.out.print("Enter the second number: ");
        }
        secondNumber = sc. nextInt();

        int differenceOfTwoNumber = firstNumber - secondNumber;
        System.out.println("Result: " + differenceOfTwoNumber);
        sc.close();
    }
    
}
