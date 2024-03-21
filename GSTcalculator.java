import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable 
    {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        double gst;
        if(amount<=5000)
        {
            gst=amount*0.18;
        }else if(amount <=10000)
        {
            gst=amount*0.20;
        }else if(amount<=20000)
        {
            gst=amount*0.25;
        }else
        {
            gst=amount*0.28;
        }
        System.out.printf("%.3f",gst);
    }
}