import java.util.Scanner;

public class IT26101289Lab5Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {

            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        // Calculate number of days
        int days = endDate - startDate;

        double discount;

        // Find discount
        if (days < 3) {
            discount = 0;
        }
        else if (days <= 4) {
            discount = DISCOUNT_10;
        }
        else {
            discount = DISCOUNT_20;
        }

        // Calculate total amount
        double total = days * ROOM_CHARGE;

        double discountAmount = total * discount;

        double finalAmount = total - discountAmount;

        // Display output
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE);
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + finalAmount);

        input.close();
    }
}