import java.util.Scanner;
public class p3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the num: ");
        int n=input.nextInt();

        int c32=0;
        if (n>0){
            c32=n/32;
            n=n%32;
        }

        int c16=0;
        if (n>0){
            c16=n/16;
            n=n%16;
        }

        int c8=0;
        if (n>0){
            c8=n/8;
            n=n%8;

        }

        int c1=0;
        if (n>0){
            c1=n/1;
            n=n%1;
        }

        System.out.println("c32="+c32);
        System.out.println("c16="+c16);
        System.out.println("c8="+c8);
        System.out.println("c1="+c1);
    }//end of main
}// end of class
