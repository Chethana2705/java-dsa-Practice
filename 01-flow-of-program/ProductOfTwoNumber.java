import java.util.*;
public class ProductOfTwoNumber 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the  second number: ");
        int secondNumber = sc.nextInt();

        int productOfTwoNumb = firstNumber * secondNumber ;
        System.out.println("Product of two number: " + productOfTwoNumb);
        sc.close();
    }
    
}
