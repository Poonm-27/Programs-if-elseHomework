import java.util.Scanner;

public class UpperLower_Case
{
    Scanner scanner = new Scanner(System.in);//create object scanner to scan the user input
    // use new keyword to create instance of the Scanner class

    //method with no return type and no parameters (non-static method)
        void upperToLower ()
        {
            System.out.println("Enter any uppercase letter : ");
            char alphabet = scanner.next().charAt(0);// variable 'alphabet' declared for entering uppercase letter and scanner scans it
            //or next() method take input one character at a time
            char ch2 = Character.toLowerCase(alphabet);//converts alphabet to lowercase
            System.out.println("Lowercase letter after conversion : " + ch2); //prints the lowercase alphabet
        }
        // main() method
        public static void main (String[]args)
        {
            UpperLower_Case upperLowerCase = new UpperLower_Case(); //create object by syntax "classname object_name =new classname()"
            upperLowerCase.upperToLower(); //call upperToLower() non-static method through object into main()
        }
}
