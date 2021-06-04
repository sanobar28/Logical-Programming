package logical;

import java.util.*;
 
public class VendingMachine{
 
    
    public static void countCurrency(int amount)
    {
        int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int[] noteCounter = new int[9];
      
        // count notes 
        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
      
        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : " + noteCounter[i]);
            }
        }
    }
     
    
    public static void main(String args[]){
        
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter Ammount: ");
    	int amount = s.nextInt();
        countCurrency(amount);
        
        s.close();
    }
     
}
