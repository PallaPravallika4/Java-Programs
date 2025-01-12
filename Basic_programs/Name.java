//2. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Name 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello " + name + ", Welcome to GEC");
    }
}