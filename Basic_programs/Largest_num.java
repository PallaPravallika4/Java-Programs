// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largest_num 
{
    public static void main(String[] args)
    {
        System.out.println("Enter any two numbers:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        if ( n > m )
        {
            System.out.println(n + " is greater than " + m );
        }
        else if ( m > n )
        {
            System.out.println(m + " is greater than " + n );
        }
        else
        {
            System.out.println("Both numbers are equal.");
        }
    }
}
