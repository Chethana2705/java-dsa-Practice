import java.util.*;
public class DifferenceOfTwoNumb 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber, secondNumber;
        if(sc.hasNextInt())
        {
            firstNumber = sc.nextInt();
        }
        else
        {
            System.out.println("Please enter the valid Input");
            return;
        }

        System.out.print("Enter the second number: ");
        if(sc.hasNextInt())
        {
            secondNumber = sc.nextInt();
        }
        else
        {
            System.out.println("Please enter the valid Input");
            return;
        }
        

        int differenceOFTwoNUmb = firstNumber - secondNumber;
        System.out.print("Result: " + differenceOFTwoNUmb);

        sc.close();
    }
    
}
