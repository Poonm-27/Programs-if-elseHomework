import java.util.Scanner;

public class InterchangeNumbers {
    Scanner scanner = new Scanner(System.in);
    //method with no return type and no parameters (non-static method)
    public void valuesInterchange() {
        System.out.println("Enter the first number:");
        int first_num = scanner.nextInt();//returns an integer value through java scanner
        System.out.println("Enter the second number:");
        int second_num = scanner.nextInt();
        System.out.println("The numbers you entered are:");
        System.out.println("a=" +first_num + "  b=" + second_num);
        if (first_num>0 && second_num>0)
        {
            first_num = first_num + second_num;
            second_num = first_num - second_num;
            first_num = first_num - second_num;
            System.out.println("The numbers after interchange are:");
            System.out.println("a=" + first_num + "  b=" + second_num);
        }
        else
        {
            System.out.println("The numbers cannot be interchange");
        }


    }
//main method
    public static void main(String[] args) {
        InterchangeNumbers interchange = new InterchangeNumbers();//create object
        interchange.valuesInterchange();//call non-static method
    }

}
