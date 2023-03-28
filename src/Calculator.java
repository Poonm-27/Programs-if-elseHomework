import java.util.Scanner;

public class Calculator {
    //create object and scan the input
    Scanner scanner = new Scanner(System.in);
    //declaring local variables with specific datatypes
    double num1;
    double num2;
    double result;
    char symbol;

    //no return type no parameters (non-static method)
    void arithmetic_operations()
    {
        System.out.println("Enter any two numbers:"); //prints text to the screen
        num1 = scanner.nextDouble(); //initialize value to the variable when user inputs the value and scanner scan it
        num2 = scanner.nextDouble();
        System.out.println("Enter any symbol from (+, -, / or *):");
        symbol = scanner.next().charAt(0);
        //if-else statement with conditions
        if (symbol=='+')
        {
            result = num1 + num2;//perform addition
            System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
            System.out.println("Sum of numbers=" +result);
        }
        else if (symbol=='-')
        {
            result = num1 - num2; //perform substraction
            System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
            System.out.println("Difference of numbers=" +result);
        }
        else if (symbol=='*')
        {
            result = num1 * num2;//perform multiplication
            System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
            System.out.println("Multiplication of numbers=" +result);
        }
        else if (symbol=='/')
        {
            result = num1 / num2;//perform division
            System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
            System.out.println("Division of numbers=" +result);
        }
        else
        {
            System.out.println("Invalid symbol");//print "Invalid symbol" to the screen
        }
    }
    // main method
    public static void main(String[] args) {
        Calculator calculator = new Calculator();//create object and call non-static method
        calculator.arithmetic_operations();
    }
}
