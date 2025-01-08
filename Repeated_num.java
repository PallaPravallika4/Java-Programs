/* Find how many times the particular number is occuring? 

Let assume 138575737, from this number 7 is occuring 3 times */

import java.util.Scanner;

public class Repeated_num 
{
    public static void main (String[] args)
    {
        System.out.println("Enter full number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter k to count its occurance");
        Scanner m = new Scanner(System.in);
        int k = m.nextInt();
        int count = 0;
        while(n > 0)
        {
            int rem = n % 10;
            if (rem == k)
            {
                count ++;
            }
            n = n/10;
        }
        System.out.println("The "+k+" occured "+count+" times ");
    }
}