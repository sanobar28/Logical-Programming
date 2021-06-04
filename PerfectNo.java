package logical;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		 
		System.out.println("Enter number");
		 
		int no=s.nextInt();
		 
		 
		int sum=0;
		int temp=no;
			 
		for(int j=1;j<=no/2;j++)
		{
			if((no%j)==0)
			{
				sum=sum+j;
			}
		}
		  
		 
		if(sum==temp)
		{
			System.out.println("Number is perfect number");
		}
		else
		{
			System.out.println("Number is not perfect number");
		}

		s.close();
	}


}
