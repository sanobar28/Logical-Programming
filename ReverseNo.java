package logical;

import java.util.*;

public class ReverseNo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num = s.nextInt();
		
		int reversed=0;
		
	    while(num != 0) {
	    
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
		
	    s.close();
	}

}
