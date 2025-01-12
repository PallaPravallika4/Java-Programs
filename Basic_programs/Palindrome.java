// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println("Enter string to check it is palindrome or not");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String rev = "";

        for(int i = word.length()-1 ; i >=0 ; i-- )
        {
            rev = rev + word.charAt(i);
        }

        if(word.equalsIgnoreCase(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}