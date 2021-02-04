

class Ramdonseries { 

	// Function to generate random numbers 
	static void lcm(int seed, int mod, int multiplier, 
					int inc, int[] randomNums, 
					int noOfRandomNum) 
	{ 

		// seed state 
		randomNums[0] = seed; 
		for (int i = 1; i < noOfRandomNum; i++) { 
 
			randomNums[i]	= ((randomNums[i - 1] * multiplier) + inc) 
				% m; 
		} 
	} 


	public static void main(String[] args) 
	{ 
 
		int seed = 5; 
		int mod = 7; 
		int multiplier = 3; 
		int inc = 3; 
		int noOfRandomNum = 10;  
		int[] randomNums = new int[noOfRandomNum]; 

		lcm(seed, mod, multiplier, inc, randomNums, 
			noOfRandomNum); 
		for (int i = 0; i < noOfRandomNum; i++) { 
			System.out.print(randomNums[i] + " "); 
		} 
	} 
} 
