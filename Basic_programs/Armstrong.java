// To find Armstrong Number between two given number.

import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args)
    {
        System.out.println("Enter number to find it is Armstrong or not:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int orgi = n;
        while(n != 0)
        {
            sum = sum + (n % 10) * (n % 10) * (n%10);
            n = n/10;
        }
        if(sum==orgi)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not an Armstrong");
        }
        in.close();
    }
}