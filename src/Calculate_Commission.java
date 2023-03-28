import java.util.Scanner;

public class Calculate_Commission {
    Scanner scanner =  new Scanner(System.in);
    //method with no return type and no parameters (non-static method)
    void calcCommision ()
    {
        System.out.println("Enter the sales amount here:");
        double sales_amount = scanner.nextDouble();//scans the next token of input as double (decimal point numbers)
        if (sales_amount >= 50000.00)
        {
            System.out.println("The commission rate is 35%");
            //returns the commission amount for commission rate of 35% on sales amount
            System.out.println("The commission amount for " + sales_amount + " is " + sales_amount * 0.35);
        }
        else if (sales_amount>=30000.00)
        {
            System.out.println("The commission rate is 20%");
            //returns the commission amount for commission rate of 20% on sales amount
            System.out.println("The commission amount for " + sales_amount + " is " + sales_amount * 0.20);
        }
        else if(sales_amount>=20000.00)
        {
            System.out.println("The commission rate is 10%");
            //returns the commission amount for commission rate of 10% on sales amount
            System.out.println("The commission amount for " + sales_amount + " is " + sales_amount * 0.10);
        }
        else if (sales_amount>=10000.00)
        {
            System.out.println("The commission rate is 5%");
            //returns the commission amount for commission rate of 5% on sales amount
            System.out.println("The commission amount for " + sales_amount + " is " + sales_amount * 0.5);
        }
        else
        {
            System.out.println("The commission rate is 2%");
            //returns the commission amount for commission rate of 2% on sales amount
            System.out.println("The commission amount for " + sales_amount + " is " + sales_amount * 0.2);
        }
    }
//main method
    public static void main(String[] args) {
        Calculate_Commission calculate_commission = new Calculate_Commission();//create object
        calculate_commission.calcCommision();//create non-static method

    }
}
