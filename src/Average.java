import java.util.Scanner;

public class Average {
    Scanner scanner =new Scanner(System.in);
    //method with no return type and no parameters (non-static method)
    void calculateAverage(){
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();
        System.out.println("Enter the fourth number:");
        int num4 = scanner.nextInt();
        System.out.println("Enter the fifth number:");
        int num5 = scanner.nextInt();
        double total = num1+num2+num3+num4+num5;
        System.out.println("Sum of 5 numbers = " +total);
        double avg = total/5;
        System.out.println("The average of 5 numbers = " +avg);
    }

    public static void main(String[] args) {
        Average average = new Average();
        average.calculateAverage();
    }
}
