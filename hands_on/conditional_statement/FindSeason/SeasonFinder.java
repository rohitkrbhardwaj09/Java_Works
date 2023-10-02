package hands_on.conditional_statement.FindSeason;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month: ");
        int month = scanner.nextInt();

        String season;

        if (month >= 1 && month <= 12) {
            switch (month) {
                case 3:
                case 4:
                case 5:
                    season = "Spring";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Summer";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Autumn";
                    break;
                default:
                    season = "Winter"; // Months 12, 1, 2
                    break;
            }

            System.out.println("Season: " + season);
        } else {
            System.out.println("Invalid month");
        }

        scanner.close();
    }
}
