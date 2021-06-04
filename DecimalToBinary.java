package logical;

import java.util.*;

public class DecimalToBinary {

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enetr Decimal Number");
		
		int Dec=s.nextInt();
		int Bin=0;
		int idigit=0;
		int base=1;
		while(Dec>0)
		{
			idigit=Dec%2;
			Bin=Bin+ (idigit*base);
			Dec=Dec/2;
			base=base*10;
			
		}
		
		System.out.println("Decimal to Binary  "+Bin);
	
	s.close();
	}
	
}
