import java.util.Scanner;
//create class
public class LeapYear {
        Scanner scanner = new Scanner(System.in);// use new keyword to create instance of the Scanner class
    //method with no return type and no parameters (non-static method)
         void verifyLeapYear()
        {
            System.out.println("Enter the year:");
            int year = scanner.nextInt(); //returns integer value
            if (year%4==0 || year%400==0 && year%100!=0)
            {
                System.out.println(year+ " is the leap year");
            }
            else
            {
                System.out.println (year+ " is not the leap year");
            }
        }
        //main method
        public static void main(String[] args)
        {
            LeapYear leapyear = new LeapYear();//create object
            leapyear.verifyLeapYear();//call non-static method

        }
}
