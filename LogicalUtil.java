package logical;


public class LogicalUtil {

	/* Function to find the square root of given number */

	static double sqrt(double c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2;
		}

		return t;
	}
	
	
	/*  Function to convert binary into decimal */	
	
	 static int toDecimal(int[] binary) {
			int dec = 0, j = 0;
			for (int i = binary.length - 1; i >= 0; i--) {
				if (binary[i] == 1) {
					dec = dec + (int) Math.pow(2, j);
				}
				j++;
			}
			return dec;

	}
	 
	 
	 /*  Function to convert  binary String to binary int array  */
	 static int[] toBinary(int decimal) {

			String bin = "";
			while (decimal != 0) {
				bin = (decimal % 2) + bin;
				decimal /= 2;
			}
			while (bin.length() % 4 != 0) {
				bin = 0 + bin;
			}
			return stringToIntArray(bin);
		}

		
		static int[] stringToIntArray(String bin) {
			int[] binary = new int[bin.length()];
			for (int i = 0; i < binary.length; i++) {
				binary[i] = bin.charAt(i) - 48;
			}
			return binary;
		}

}
