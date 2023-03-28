
import java.util.Scanner;

public class Marksheet {
    Scanner scanner = new Scanner(System.in);
    String student_name;//variable declaration with String datatype
    int roll_no;//variable declaration with integer datatype

    //method with no return type and no parameters (non-static method)
    public void score() {
        System.out.println("Enter your name:");
        student_name = scanner.nextLine();//returns complete line of text through java scanner
        System.out.println("Enter your roll number:");
        roll_no = scanner.nextInt();
        System.out.println("Enter your maths marks:");
        int maths = scanner.nextInt();//user can input maths marks
        System.out.println("Enter your eng marks:");
        int eng = scanner.nextInt();
        System.out.println("Enter your science marks:");
        int sci = scanner.nextInt();
        float total = maths + eng + sci;
        float percentage = (total / 3);
        System.out.println("Your total marks=" + (total));
        System.out.println("Your percentage is=" + percentage);
        if (percentage >= 80)
        {
            System.out.println("Your grade is A+ and you pass");
        }
        else if (percentage>=60)
        {
            System.out.println("Your grade is A and you pass");
        }
        else if (percentage>=50)
        {
            System.out.println("Your grade is B and you pass");
        }
        else if (percentage>=35)
        {
            System.out.println("Your grade is C and you pass");
        }
        else
        {
            System.out.println("You are fail");
        }
    }
    public static void main(String[] args) {
        Marksheet marksheet = new Marksheet();
        marksheet.score();
    }
}
