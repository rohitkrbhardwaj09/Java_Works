package LanguageFundamentalAndOperators;

class Calculator{
    int num1, num2;

    public void addition(){

        System.out.println("The Sum of  the Two numbers "+num1+" and "+num2+" is "+ (num1+num2));
    }
    public void subtraction(){
        System.out.println("The Subtracted  Result of  the two numbers "+num1+ " and "+num2+" is "+ (num1-num2));
    }
    public void printSmaller(){
        System.out.println("The Smallest  of  the Two numbers "+num1+" and "+num2+" is "+ (num1<num2?num1:num2));
    }
}
public class Operators {
    
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        calc.num1 = 12;
        calc.num2 = 8;
        calc.addition();
        calc.subtraction();
        calc.printSmaller();
    }
}
