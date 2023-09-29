package LanguageFundamentalAndOperators;

class Employee{
    long empID = 345L;
    double empSalary = 10000.0;
    float empTax = 9.5f;
    int empDaysOfWork = 24;

    public void calculatePF(){
    float pfRate = 10.5f;
    System.out.println("The PF Rate of The Employee is "+pfRate);
}
}



public class VariableDeclaration {
    public static void main(String[] args) {
        Employee emp = new Employee();

        System.out.println("The  Id  of the Employee is "+emp.empID);
        System.out.println("The Salary of The Employee is "+ emp.empSalary);
        System.out.println("The  Percentage of Tax  The Employee needs to Pay is "+ emp.empTax);
        System.out.println("The  Total  Number  of Working Days  is "+emp.empDaysOfWork);
        emp.calculatePF();
    }
}
