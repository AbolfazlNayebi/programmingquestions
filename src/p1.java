import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = input.nextInt();

        int p = 0;

        if (n < 187) {
            if (n % 31 == 0)
                p = n / 31;
            else
                p = n / 30 + 1;
        }//end of if

        else if (n >= 187 && n < 337) {
            if ((n - 186) % 30 == 0)
                p = (n - 186) / 30 + 6;
            else
                p = (n - 186) / 30 + 6 + 1;
        }//end of else if
        else if (n > 337)
            p = 12;

        System.out.print("result: " + p);
    }//end of main
}//end of class
