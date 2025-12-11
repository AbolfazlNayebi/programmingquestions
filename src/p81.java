import java.util.*;
public class p81
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = input.nextInt();

        int result = 0;
        int p=1;
        while(n>0)
        {
            if ((n%10) != 0)
            {
                result = result + ((n % 10) * p);
                p = p * 10;
            }
            n=n/10;
        }//end of while
        System.out.print(result);






    }//end of main
}//end of class
