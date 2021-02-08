// Java Program to find 
// covariance of two set. 
import java.io.*; 

class  agefrequency{ 

// Function to find mean. 
static float mean(float arr[], int n) 
{ 
	float sum = 0; 
	
	for(int i = 0; i < n; i++) 
		sum = sum + arr[i]; 
	
	return sum / n; 
} 

// Function to find covariance. 
static float covariance(float arr1[], 
					float arr2[], int n) 
{ 
	float sum = 0; 
	
	for(int i = 0; i < n; i++) 
		sum = sum + (arr1[i] - mean(arr1, n)) * 
						(arr2[i] - mean(arr2, n)); 
	return sum / (n - 1); 
} 
 static float correlationCoefficient(float X[], 
                                    float Y[], int n) 
    { 
       
        float sum_X = 0, sum_Y = 0, sum_XY = 0; 
        float squareSum_X = 0, squareSum_Y = 0; 
       
        for (int i = 0; i < n; i++) 
        { 
            // sum of elements of array X. 
            sum_X = sum_X + X[i]; 
       
            // sum of elements of array Y. 
            sum_Y = sum_Y + Y[i]; 
       
            // sum of X[i] * Y[i]. 
            sum_XY = sum_XY + X[i] * Y[i]; 
       
            // sum of square of array elements. 
            squareSum_X = squareSum_X + X[i] * X[i]; 
            squareSum_Y = squareSum_Y + Y[i] * Y[i]; 
        } 
       
        float corr = (float)(n * sum_XY - sum_X * sum_Y)/ 
                     (float)(Math.sqrt((n * squareSum_X - 
                     sum_X * sum_X) * (n * squareSum_Y -  
                     sum_Y * sum_Y))); 
       
        return corr; 
    } 

// Driver code 
	public static void main (String[] args) { 
	
	float age[] = {46,53,29,61,36,39,47,49,52,38,55,32,57,54,44}; 
	int n = age.length; 

	System.out.println("------------------------------------------------------------------------");
	System.out.println("age -[46,53,29,61,36,39,47,49,52,38,55,32,57,54,44]");
	
	float Frequency [] = {12,15,7,17,10,11,11,12,14,9,16,8,18,14,12}; 
	System.out.println("------------------------------------------------------------------------");
	System.out.println("Frequency- [12,15,7,17,10,11,11,12,14,9,16,8,18,14,12]");
	int m = Frequency.length; 
	
	if (m == n) 
	System.out.println("------------------------------------------------------------------------");
	System.out.println("covariance of the given age and Frequency = "+covariance(age, Frequency, m)); 
	System.out.println("------------------------------------------------------------------------");

System.out.println("correlationCoefficient of the given age and Frequency = "+correlationCoefficient(age, Frequency, m)); 
	
	} 
	 
} 

// This code is contributed by rohit verma. 
