import java.util.Scanner;
public class p24 {
   public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number: ");

        int n = input.nextInt();
        int c = 0;
        for (int x = 1; x <= n; x++) {
            if (n%x==0)
                c++;
            } // end of for
            if (c==2)
                System.out.println("Yes");
            else
                System.out.println("No");
        } // end of main

    } // end of class
