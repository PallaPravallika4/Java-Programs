// Input currency in rupees and output in USD & visversa

import java.util.Scanner;

public class Currency
{
    public static void main(String[] args)
    {
        double Exchange_Rate = 83.00;
        System.out.println("To know rupees in usd enter USD otherwise INR");
        Scanner in = new Scanner(System.in);
        String money = in.nextLine();

        switch(money)
        {
            case "USD" : 
                       System.out.printf("Enter INR amount:");
                       double inr = in.nextDouble();
                       double usd = inr/Exchange_Rate;
                       System.out.printf("Given Indian Rupee Currency in USD is: %.2f\n", usd);
                       break;
            case "INR" : 
                       System.out.printf("Enter USD amount:");
                        usd = in.nextDouble();
                        inr = usd*Exchange_Rate;
                       System.out.printf("Given USD Currency in Rupees is: %.2f\n", inr);
                       break;
            default : System.out.println("Enter Correct value");
        }
        in.close();
    }
}