//Java Program to find coefficient of 
// variation of given array 
import java.io.*; 

class centralvalues{ 

	 
	static double mean(double arr[], int n) 
	{ 
		double sum = 0; 
		
		for (int i = 0; i < n; i++) 
			sum = sum + arr[i]; 
		return sum / n; 
	} 
	
	static double standardDeviation(double arr[], 
											int n) 
	{ 
		double sum = 0; 
		
		for (int i = 0; i < n; i++) 
			sum = sum + (arr[i] - mean(arr, n)) * 
							(arr[i] - mean(arr, n)); 
		
		return Math.sqrt(sum / (n - 1)); 
	} 
	
	static double coefficientOfVariation(double arr[], 
												int n) 
	{ 
	return (standardDeviation(arr, n) / mean(arr, n)); 
	} 
	public static double median(double[] m) {
    int middle = m.length/2;
    if (m.length%2 == 1) {
        return m[middle];
    } else {
        return (m[middle-1] + m[middle]) / 2.0;
    }
}

public static double mode(double a[]) {
    double maxValue=9999999;	
    double maxCount=0.0;

    for (int i = 0; i < a.length; ++i) {
        int count = 0;
        for (int j = 0; j < a.length; ++j) {
            if (a[j] == a[i]) ++count;
        }
        if (count > maxCount) {
            maxCount = count;
            maxValue = a[i];
        }
    }

    return maxValue;
}
static double variance(double a[],  
                           int n) 
    { 
        // Compute mean (average  
        // of elements) 
        double sum = 0; 
          
        for (int i = 0; i < n; i++) 
            sum += a[i]; 
        double mean = (double)sum /  
                      (double)n; 
      
        // Compute sum squared  
        // differences with mean. 
        double sqDiff = 0; 
        for (int i = 0; i < n; i++)  
            sqDiff += (a[i] - mean) *  
                      (a[i] - mean); 
          
        return (double)sqDiff / n; 
    } 

	public static void main (String[] args) { 
		
	double arr[] = { 15, 36, 53.67, 25.45, 
							67.8, 56, 78.09 }; 
	int n = arr.length; 
	System.out.println("-----------------------------------------");
	System.out.println("list is given below");
	System.out.println("15, 36, 53.67, 25.45,67.8, 56, 78.09"); 
	System.out.println("-----------------------------------------");
	System.out.println("median of the list ="	+median(arr));	
	System.out.println("-----------------------------------------");

	System.out.println("mode of the list ="	+mode(arr));	
	System.out.println("-----------------------------------------");
	
	System.out.println("variance of the list ="	+variance(arr,n));	
	System.out.println("-----------------------------------------");
	
	System.out.println("mean of the list = " +mean(arr, n));
	System.out.println("-----------------------------------------");
	System.out.println("standardDeviation of the list = " +standardDeviation(arr, n));
	System.out.println("-----------------------------------------");
	System.out.println("coefficientOfVariation of the list = " +coefficientOfVariation(arr, n)); 

	} 
} 


//This article is contributed by vt_m. 
