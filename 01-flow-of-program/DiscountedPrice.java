import java.util.Scanner;

public class DiscountedPrice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter the Discount percentage: ");
        double discountPercentage = sc.nextDouble();

        if (price <= 0)
        {
            System.out.println("Price must be greater than 0.");
        }
        else if (discountPercentage < 0 || discountPercentage > 100)
        {
            System.out.println("Discount must be between 0 and 100.");
        }
        else
        {
            double discount = price * discountPercentage / 100;
            double finalPrice = price - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
        }

        sc.close();
    }
}