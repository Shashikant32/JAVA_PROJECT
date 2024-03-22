import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
	public static int waterBill(int w){
        int bill;
        if(w<=100)
        {
           bill=w*15; 
        }else if(w<=200)
        {
            bill=100*15+(w-100)*14;
        }else
        {
            bill=100*15+100*14+(w-200)*12;
        }
        
        return bill;
	}
}

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
	    int w=sc.nextInt();
		System.out.println(Solution.waterBill(w));
	}
}