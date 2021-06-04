package logical;

import java.util.*;

public class DayOfWeek 
{
		public static void main(String agr[]) 
		{
			  Scanner s=new Scanner(System.in);
			  System.out.println("Enter Year");
			  int year=s.nextInt();
			  
			  System.out.println("Enter month");
			  int month=s.nextInt();
			  
			  System.out.println("Enter Day");
			  int day=s.nextInt();
			  
			  System.out.println("Day of week is");
			  int yr = year - (14 - month) / 12;
			  int x = yr + yr/4- yr/100 + yr/400;
			  int mo = month + 12 * ((14 -month) / 12)- 2;
			  int dy = (day+ x + 31*mo / 12) % 7;
			  System.out.println(dy);
			  
			  switch(dy)
			  {
				 case 0:
					 System.out.println("Sunday");
					 break;
				 case 1:
					 System.out.println("Monday");
					 break;
				 case 2:
					 System.out.println("Tuesday");
					 break;
				 case 3:
					 System.out.println("Wednesday");
					 break;
				 case 4:
					 System.out.println("Thursday");
					 break;
				 case 5:
					 System.out.println("Friday");
					 break;
				 case 6:
					 System.out.println("Saturday");
					 break;
				 }
	      
		  s.close();
		}
}