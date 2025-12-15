import java.util.*;

public class p59 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = input.nextInt();
        int temp=n;
        int p = 2;
        int k;
        System.out.print(temp + "=");
        while (n > 1)
        {
            k = 0;
            while (n % p == 0)
            {

                n = n / p;
                k++;
            }//end of while

            if (k > 0)
                System.out.print(p + "^" + k);
            if (n>1)
                System.out.print("*");
            p++;
        }


    }//end of main
}//enf of class
