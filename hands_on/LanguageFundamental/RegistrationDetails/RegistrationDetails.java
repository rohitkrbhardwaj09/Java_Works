package hands_on.LanguageFundamental.RegistrationDetails;

import java.util.Scanner;

public class RegistrationDetails {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your phone number: ");
        long phoneNumber = sc.nextLong();

        System.out.println("Enter your qualification: ");
        String qualification = sc.nextLine();

        sc.nextLine();
        
        System.out.println("Enter your email id: ");
        String emailId = sc.nextLine();

        System.out.println("Enter your experience(if any): ");
        double noOfExperience = sc.nextDouble();

        System.out.println("Dear "+name+", Thanks for registering in our portal, registration id will be mailed to "+emailId+" within 2 working days");
        System.out.println("Your details are: ");
        System.out.println("Your age: "+age);
        System.out.println("Your phone number: "+phoneNumber);
        System.out.println("Your qualification: "+qualification);
        System.out.println("Your experience: "+noOfExperience);
        sc.close();
    }
}
