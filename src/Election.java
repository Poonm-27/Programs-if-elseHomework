import java.util.Scanner;

public class Election {
    Scanner scanner = new Scanner(System.in);
    //method with no return type and no parameters (non-static method)
    public void eligibleForVote () {
        System.out.println("Please enter your age:");
        int age = scanner.nextInt(); //returns an integer number

        if (age>= 18) //check whether the age of the person is more than or equal to 18 for voting
        {
            System.out.println("You are eligible for vote: age="+age);
        }
        else
        {
            System.out.println("You are not eligible for vote: age="+age);

        }
    }
//main() method
    public static void main(String[] args) {
        Election election= new Election();//create object
        election.eligibleForVote(); //call non-static method

    }
}
