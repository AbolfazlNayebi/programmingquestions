public class p40
{
    public static void main(String[] args)
    {
        int k=0;//تعداد اعداد اول
        int x=1;//اعدادی که اول بودنشان بررسی می شود
        while(k<50)
        {
            int c=0;//تعداد مقسوم علیه
            for (int y=1;y<=x;y++)
            {
                if (x % y == 0)
                    c++;
            }
                if (c==2)
                    k++;
            x++;
        }//eof while
        System.out.print("the num is="+(x-1));

    }
}

