package HandsOn.ConditionalStatement;

import java.util.Scanner;

public class MultiplexTheater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the no of ticket: ");
        int numberOfTickets = scanner.nextInt();

        // Check if the number of tickets is within the valid range (5 to 40)
        if (numberOfTickets < 5 || numberOfTickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        } else {
            System.out.print("Do you want refreshment (y/n): ");
            char wantsRefreshment = scanner.next().charAt(0);

            System.out.print("Do you have coupon code (y/n): ");
            char hasCouponCode = scanner.next().charAt(0);

            System.out.print("Enter the circle (k/q): ");
            char circle = scanner.next().charAt(0);

            double ticketCost = 0;

            // Calculate ticket cost based on the circle (king class or queen class)
            if (circle == 'k') {
                ticketCost = numberOfTickets * 75.0;
            } else if (circle == 'q') {
                ticketCost = numberOfTickets * 150.0;
            } else {
                System.out.println("Invalid Input");
                return;
            }

            // Add refreshment cost if requested
            if (wantsRefreshment == 'y') {
                ticketCost += numberOfTickets * 50.0;
            }

            // Apply discount if there's a coupon code
            if (hasCouponCode == 'y') {
                ticketCost *= 0.98; // 2% discount
            }

            // Apply bulk booking discount
            if (numberOfTickets > 20) {
                ticketCost *= 0.90; // 10% discount
            }

            // Print the total ticket cost to two decimal places
            System.out.printf("Ticket cost: %.2f%n", ticketCost);
        }

        scanner.close();
    }
}
