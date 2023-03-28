import java.util.Scanner;

public class Number_status {
    Scanner scanner = new Scanner(System.in);// use new keyword to create instance of the Scanner class
    //method with no return type and no parameters (non-static method)
    void number()
    {
        System.out.println("Enter the number:");
        double num = scanner.nextDouble();
        //check whether number is positive
        if (num > 0)
        {
            System.out.println("The number " +num+ " is a positive number. ");
        }
        //check whether number is negative
        else if (num<0)
        {
            System.out.println("The number " +num+ " is a negative number. ");
        }
        //if above conditions are not fulfilled means number is zero or null
        else
        {
            System.out.println("The number you entered is zero/null. ");
        }

    }//main() method
    public static void main(String[] args) {
        Number_status numberStatus = new Number_status();//create object
        numberStatus.number();//call non-static method
    }
}
