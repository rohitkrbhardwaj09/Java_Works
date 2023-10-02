public class ClassEx2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.operand1=89;
        calc.operand2=34;
        calc.displayOperand();
    }
}
class Calculator{
    int operand1;
    int operand2;

    public void displayOperand(){
        System.out.println("The value of operand 1 is "+operand1);
        System.out.println("The value of operand 2 is "+operand2);
    }
}