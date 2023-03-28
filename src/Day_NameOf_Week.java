import java.util.Scanner;

public class Day_NameOf_Week
{
    Scanner scanner=new Scanner(System.in);// use new keyword to create instance of the Scanner class

    //method with no return type and no parameters (non-static method)
    void checkValue()
    {
        System.out.println("Enter any number from 1 to 7 :");
        int number = scanner.nextInt();
        if (number==1) // checks whether number is equal to 1
        {
            System.out.println("The day is Monday");//print The day is Monday
        }
        else if (number==2)// checks whether number is equal to 2
        {
            System.out.println("The day is Tuesday");//print that it's tuesday
        }
        else if (number==3)// checks whether number is equal to 3
        {
            System.out.println("The day is Wednesday"); //prints that it's wednesday
        }
        else if (number==4) // checks whether number is equal to 4
        {
            System.out.println("The day is Thursday");//prints that it's thursday
        }
        else if (number==5) // checks whether number is equal to 5
        {
            System.out.println("The day is Friday"); //prints that it's Friday
        }
        else if (number==6) // checks whether number is equal to 6
        {
            System.out.println("The day is Saturday"); //prints that it's Saturday
        }
        else if (number==7) // checks whether number is equal to 7
        {
            System.out.println("The day is Sunday"); //prints it's sunday
        }
        else
        {
            System.out.println("The number you entered is invalid ");
        }
    }
    //main() method

    public static void main(String[] args) {
        Day_NameOf_Week dayNameOfWeek=new Day_NameOf_Week();//create object
        dayNameOfWeek.checkValue();//call non-static method
    }
}
