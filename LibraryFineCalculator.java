import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of days the member is late to return the book:");
        int daysLate = scanner.nextInt();
        double fine = 0;

        if (daysLate <= 7) {
            fine = daysLate * 0.5;
        } else if (daysLate <= 14) {
            fine = 7 * 0.5 + (daysLate - 7) * 1;
        } else if (daysLate <= 21) {
            fine = 7 * 0.5 + 7 * 1 + (daysLate - 14) * 5;
        } else {
            System.out.println("Membership canceled. You are more than 21 days late to return the book.");
            return;
        }

        System.out.println("Fine: Rs. " + fine);
    }
}
