import java.util.Scanner;

public class Alphabet_City {
    Scanner scanner = new Scanner(System.in);
    //method with no return type and no parameters (non-static method)
    void cityname ()
    {
        System.out.println("Enter any alphabet from a to f or A to F :");
        char alphabet = scanner.next().charAt(0);
        if(alphabet=='a' || alphabet=='A' ) //check whether value is A or a
        {
            System.out.println("City name: Alperton"); //returns city name starting with that alphabet A or a
        }
        else if (alphabet=='b' || alphabet=='B')
        {
            System.out.println("City name: Birmingham");//returns city name starting with that alphabet B or b
        }
        else if (alphabet=='c' || alphabet=='C')
        {
            System.out.println("City name: Croydon");//returns city name starting with that alphabet C or c
        }
        else if (alphabet=='d' || alphabet=='D')
        {
            System.out.println("City name: Dartford");//returns city name starting with that alphabet D or d
        }
        else if (alphabet=='e' || alphabet=='E')
        {
            System.out.println("City name: Ealing Broadway");//returns city name starting with that alphabet E or e
        }
        else if (alphabet=='f' || alphabet=='F')
        {
            System.out.println("City name: Feltham");//returns city name starting with that alphabet F or f
        }
        else
        {
            System.out.println("Invalid entry");//if none of the above condition fulfills then returns Invalid entry
        }


    }
//main method
    public static void main(String[] args) {
        Alphabet_City alphabetCity = new Alphabet_City();//create object
        alphabetCity.cityname();//call non-static method into main()
    }
}
