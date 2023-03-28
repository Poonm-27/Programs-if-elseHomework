import java.util.Scanner; // to make java scanner class available
//create class
public class Verify_Value {
    Scanner scanner = new Scanner(System.in); // use new keyword to create instance of the Scanner class
    //method with no return type and no parameters(non-static method)
    void value_check()
    {
        System.out.println("Please enter any character/value:");
        char value = scanner.next().charAt(0);//read the first character of the input
        //or next() method take input one character at a time
        if (value>='0' && value<='9')//checks whether the value is any number
        {
            System.out.println("The value is a number.");//prints the text to the screen
        }
        else if(value>='A' && value<='Z' || value>='a' && value<='z') // checks  whether value is an alphabet
        {
            System.out.println("The value is an alphabet.");
        }
        else  //checks whether value is neither a digit nor an alphabet and is a symbol
        {
            System.out.println("The value is a symbol.");
        }
    }
//main method
    public static void main(String[] args) {
        Verify_Value verifyValue = new Verify_Value();// create object
        verifyValue.value_check();//call non-static method
    }
}
