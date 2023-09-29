package HandsOn.LanguageFundamental.HeightestPlacement;

import java.util.Scanner;

public class HeightestPlacement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the no of students placed in CSE: ");
        int CSEPlacement = sc.nextInt();

        System.out.print("Enter the no of students placed in ECE: ");
        int ECEPlacement = sc.nextInt();

        System.out.print("Enter the no of students placed in MECH: ");
        int MECHPlacement = sc.nextInt();

        if(CSEPlacement < 0 || ECEPlacement < 0 || MECHPlacement < 0){
            System.out.println("Invalid Input");
        }else{
            if(CSEPlacement == ECEPlacement && ECEPlacement ==  MECHPlacement){
                System.out.println("None of the department has got the highest placement");
            }else{
                int heightestPlacement = Math.max(CSEPlacement, Math.max(ECEPlacement, MECHPlacement));

                System.out.println("Heightest Placement: ");
                if(CSEPlacement == heightestPlacement){
                    System.out.println("CSE");
                }
                if(ECEPlacement == heightestPlacement){
                    System.out.println("ECE");
                }
                if(MECHPlacement == heightestPlacement){
                    System.out.println("MECH");
                }
            }
        }
        
        sc.close();
    }
}
