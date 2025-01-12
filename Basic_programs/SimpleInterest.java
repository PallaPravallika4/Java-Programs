//3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double P = in.nextDouble();
        double T = in.nextDouble();
        double R = in.nextDouble();

        double SI = (P*T*R)/100;

        System.out.println("Simple Interest: " + SI);

    }
}