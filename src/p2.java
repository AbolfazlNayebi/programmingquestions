
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = input.nextInt();

        int p = 0;

        if (n < 187) {
            if (n % 31 == 0)
                p = 31;
            else
                p = n % 31;
        }//end of if

        else if (n >= 187 && n < 337) {
            if ((n - 186) % 30 == 0)
                p = 30;
            else
                p = (n - 186) % 30;
        }//end of else if
        else if (n > 337)
            p = n - 336;

        System.out.printf("result: " + p);
    }//end of main
}//end of class
