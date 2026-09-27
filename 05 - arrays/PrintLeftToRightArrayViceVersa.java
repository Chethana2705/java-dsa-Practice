import java.util.*;

public class PrintLeftToRightArrayViceVersa 
{

    static void printLeftToRight(int[] numbers)
    {
        System.out.println("Print from left to Right of an array ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }

    static void printRightToLeft(int[] array)
    {
       System.out.println("Print from Right to left of an array ");
        for(int i = array.length-1; i >= 0; i--)
        {
            System.out.print(array[i] + " ");
        } 
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));

        printLeftToRight(arr);
        System.out.println();

        printRightToLeft(arr);

        sc.close();
    }
    
}
