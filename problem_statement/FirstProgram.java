package problem_statement;

public class FirstProgram{
    public static void main(String[] args) {
        
        // ANSI escape code for brown color
        String brownColor = "\u001B[33m";
        
        // ANSI escape code for green color
        String greenColor = "\u001B[32m";
        
        // ANSI escape code to reset the text color
        String resetColor = "\u001B[0m";

          // Print the first message in brown
          System.out.print(brownColor + "******** This is My First Java Program ********");
        
          // Print the second message in green
          System.out.println(greenColor + "\n********This is a demo on print ************");
          
          // Reset the text color
          System.out.print(resetColor);

    }
}