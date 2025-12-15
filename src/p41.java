public class p41 {
    public static void main(String[] args){

        long a=1;
        long b=1;
        int f=2;
        long c=0;
        while (f<50)
        {
            c=a+b;
            System.out.print(c);
            f++;
            a=b;
            b=c;
        }

    }
}
