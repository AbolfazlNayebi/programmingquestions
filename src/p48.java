import java.util.*;
public class p48 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter the N: ");
        int N = input.nextInt();
        int p=1;
        while (N>0)
        {
            int T=N%10;
            p=p*T;
            N=N/10;
        }

        System.out.println("p="+p);




    }//end of main
}
