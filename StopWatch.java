package logical;

import java.util.*;

public class StopWatch
{
	 public static void main(String []arg)
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter 1 to start watch");
		 int user=s.nextInt();
		 
		 long t1=0;
		 long t2=0;
		 long diff=0;
		 t1=System.currentTimeMillis();
		 System.out.println(t1);
		 
		 System.out.println("Enter 2 to stop watch");
	     int end=s.nextInt();
		 t2=System.currentTimeMillis();
		 System.out.println(t2);
	
		 diff=t2-t1;
		 System.out.println("Time is: "+diff/1000+"sec.");
	 	
		s.close(); 
		 
	 }
}