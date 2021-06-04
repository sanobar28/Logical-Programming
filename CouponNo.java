package logical;

import java.util.ArrayList;
import java.util.*;

public class CouponNo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt(); 
		
		ArrayList<Integer> distinct = new ArrayList<Integer>(100);
		  
		for (int i=0; i<=num; i++) {
			
			int random = (int) (Math.random()*100)+1;
			
			for (int count=0; count<i; count++) {
				if (distinct.contains(random)) {
					
					continue;
				}
				else {
					
					distinct.add(random);
				}
			}	
		}
		
		System.out.println("Distinct random numbers = "+distinct);

		s.close();
	}

}
