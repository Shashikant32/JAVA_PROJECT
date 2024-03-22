import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner scr = new Scanner(System.in);
        int month = scr.nextInt();
        int year = scr.nextInt();
        int days;
        if(month==2)
        {
            if((year % 4 == 0 && year % 100 != 0)||(year % 400 ==0))
            {
                days=29;
            }else
            {
                days=28;
            }
        }else if(month == 4 || month == 6 || month == 9 || month == 11)
               {
                    days=30;
                }else
                  {
                    days=31;
                 }
            
            System.out.println(days);
    }
}