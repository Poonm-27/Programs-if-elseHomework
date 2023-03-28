import java.util.Scanner;

public class Marksheet_PassOrFail
{
    Scanner scanner = new Scanner(System.in);
    String student_name; //variable declaration with String datatype
    int roll_no;//variable declaration with integer datatype

    //method with no return type and no parameters (non-static method)
    void score()
    {
        System.out.println("Enter your name:");
        student_name = scanner.nextLine();//returns complete line of text through java scanner.User inputs students name
        System.out.println("Enter your Roll no:");
        roll_no = scanner.nextInt();//returns integer. user can input roll no
        System.out.println("Enter your maths marks:");
        int maths = scanner.nextInt();//user can input maths marks
        System.out.println("Enter your eng marks:");
        int eng = scanner.nextInt(); //user can input english subject marks
        System.out.println("Enter your science marks:");
        int sci = scanner.nextInt();//user can input science subject marks
        int total = maths + eng + sci; //variable declaration and initialization (sum of three subjects)
        int percentage = (total / 3); //percentage formula
        System.out.println("Your total marks=" + (total));//prints total value on screen
        System.out.println("Your percentage is=" + percentage);//prints percentage value on screen
        if (maths >= 35 && sci >= 35 && eng >= 35)
            {
                System.out.println("Result = You are pass");
            }
        else
            {
                System.out.println("Result = You are fail");
            }

    }
//main method
        public static void main (String[] args)
        {
            Marksheet_PassOrFail marksheet_passOrFail = new Marksheet_PassOrFail();//create object
            marksheet_passOrFail.score();//call non-static method into main
        }
}

