import java.util.Scanner;
public class p25 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("enter the num:");
        int N=input.nextInt();

        int s=1;
        for (int x=1;x<=N;x++)
            s=s*x;
        System.out.print("factorial="+s);

    }
}
