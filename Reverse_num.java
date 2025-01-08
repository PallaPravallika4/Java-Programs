/* Reverse a number if it is 23597 then the output need to come as 79532 */

import java.util.Scanner;

public class Reverse_num 
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        while (n > 0)
        {
            int rem = n % 10 ;
            n = n / 10;
            ans = ans * 10 + rem ;
        }
        System.out.println("The reverse number is: " + ans);
    }
}