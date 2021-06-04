package logical;

import java.util.*;

public class MonthlyPayment 
{
	public static void main(String agr[]) 
	{
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter no of Year");
		  int y=s.nextInt();
		  System.out.println("Enter Principal loan ammount");
		  int p=s.nextInt();
		  System.out.println("Enter rate percent");
		  int R=s.nextInt();
		  
		  System.out.println("Your Monthly payment is");
		  int n=12*y;
		  int r=R/(12*100);
		  int l=1+r;
		  int payment=(int) ((p*r)/(1-Math.pow(l,n)));
		  System.out.println(payment);
		  
		  s.close();
	}
}