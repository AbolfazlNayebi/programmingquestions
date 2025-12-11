import java.util.*;

public class p82
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = input.nextInt();

        int p=1;
        long result=0;
        while (n > 0)
        {
            int r=n%2;
            result=result+(r*p);
            p*=10;
            n=n/2;
        }
        System.out.print("result= "+result);


    }//end of main
}//end of class
