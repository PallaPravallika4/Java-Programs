// 1. Write a program to print whether a number is even or odd, also take input from the user.


import java.util.Scanner;

public class EvenOdd 
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n % 2 == 0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }

    }
}