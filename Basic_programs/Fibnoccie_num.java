/* To calculate the fibnoccie series up to n number 
fib series : 0,1,1,2,3,
we have to find the nth num
a=0, b=1 are fixed 
i/p= n, o/p= fib num which is placed in that particular nth position*/

import java.util.Scanner;

public class Fibnoccie_num {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n)
        {
            int temp = b;
            b = b+a;
            a = temp;
            count ++;
        }
        System.out.println(b);
    }
}

/*          Other method 
int a=0, b=1, s=0
for(i=2; i<10; i++)
{
    s = a+b;
    System.out.println(s);
    a = b;
    b = s;
} */