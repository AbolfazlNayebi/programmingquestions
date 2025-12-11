import jdk.jshell.spi.ExecutionControl;

import java.util.*;
public class p67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c=0;
        for (int i=1;i<=5;i++)
        {
            System.out.print("Enter "+i+"st number:");
            int n=input.nextInt();
            int temp=n;
            int rev=0;
             while (n>0)
             {
                 int r=n%10;
                 rev=rev*10+r;
                 n=n/10;
             }//end of while
            if (rev==temp)
                c++;
        }//end of for

        System.out.println("count="+c);

    }//end of main
}//end of class
