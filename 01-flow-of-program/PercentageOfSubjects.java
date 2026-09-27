
import java.util.*;

public class PercentageOfSubjects
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int totalMarks = 500;
        int scoredMarks = 0;

        for (int i = 1; i <= 5; i++)
        {
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = sc.nextInt();

            while (marks < 0 || marks > 100)
            {
                System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                System.out.print("Enter marks for Subject " + i + ": ");
                marks = sc.nextInt();
            }

            scoredMarks = scoredMarks + marks;
        }

        System.out.println("Total marks scored out of 500: " + scoredMarks);

        double percentage = (scoredMarks / (double) totalMarks) * 100;
        System.out.println("Percentage: " + percentage);

        sc.close();
    }
}

