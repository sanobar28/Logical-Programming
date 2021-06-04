package logical;

import java.util.*;

public class TempConversion 
{
	 public static void main(String []args)
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter 1 for fahrenheitToCelsiusand 2 for CelsiusToFahrenheit");
		 int temp=s.nextInt();
		 float C,F;
		 
		 switch(temp)
		 {
			 case 1://fahrenheitToCelsius is //
				 System.out.println("Enter Temp.in Farhenheit");
				 F=s.nextFloat();
				 C=(F - 32) * 5/9 ;
				 System.out.println(C);
				 break;
			 case 2://CelsiusTofahrenheit is //
				 System.out.println("Enter Temp.in Celsius");
				 C=s.nextFloat();
				 F=(C * 9/5) + 32 ;
				 System.out.println(F);
		         break;
		  }
		 s.close();
	 }
	 
}