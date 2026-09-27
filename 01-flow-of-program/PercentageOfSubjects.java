import java.util.*;
public class PercentageOfSubjects 
{
      public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks of Subject1: ");
        double subject1 = sc.nextInt();

        System.out.print("Enter the Marks of Subject2: ");
        double subject2 = sc.nextInt();

        System.out.print("Enter the Marks of Subject3: ");
        double subject3 = sc.nextInt();

        System.out.print("Enter the Marks of Subject4: ");
        double subject4 = sc.nextInt();

        System.out.print("Enter the Marks of Subject5: ");
        double subject5 = sc.nextInt();

        int totalMarks = 500;
        double scoredMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        System.out.println("Total marks scored out of 500: " + scoredMarks);

        double percentage = (scoredMarks / totalMarks) * 100;
        System.out.println("Percentage: " + percentage);
        sc.close();
        
    }
    
}
