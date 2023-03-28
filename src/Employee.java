import java.util.Scanner;

public class Employee {
    Scanner scanner =new Scanner(System.in);
    //method with no return type and no parameters (non-static method)
    public void employee_Details ()
    {
        System.out.println("Enter Employee id : ");
        String  employeeId=scanner.nextLine(); //nextLine() returns the complete line of text to java scanner
        System.out.println("Enter name of the employee : ");
        String employeeName = scanner.nextLine();
        System.out.println("Enter the basic salary of " +employeeName+ ": ");
        float basic_salary;
        basic_salary = scanner.nextFloat();
        double hra = basic_salary * 0.10; //hra is 10% of basic salary
        double ta = (basic_salary * 9)/100;//ta is 9% of basic salary
        double da = (basic_salary * 8)/100;//da is 8% of basic salary
        double pf =basic_salary * 0.20; //pf is 20% of basic salary
        System.out.println("House Rent Allowance (HRA): " +hra);
        System.out.println("Dearness Allowance (DA): " +da);
        System.out.println("Travelling Allowance (TA): " +ta);
        System.out.println("Provident fund (PF): " +pf);
        double gross_salary = basic_salary + hra + ta + da - pf;//variable declaration & initialization. Formula to calculate Gross salary
        //System.out.println("Gross Salary of " +employeeName + "= " +gross_salary);
        System.out.println("Gross Salary of " +employeeName+ "("+employeeId+")= " +gross_salary);
    }
//main method
    public static void main(String[] args) {
        Employee employee = new Employee();//create object
        employee.employee_Details();//call non-static method
    }
}
