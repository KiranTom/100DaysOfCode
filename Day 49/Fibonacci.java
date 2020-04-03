package abc;

class Fibonacci { 
	static int fib(int n) { 
		
	int arr[] = new int[n+2];
	int i; 
	arr[0] = 0; 
	arr[1] = 1; 
	
		for (i = 2; i <= n; i++) { 
			
			arr[i] = arr[i-1] + arr[i-2]; 
		} 
	
		return arr[n]; 
	} 
	
	public static void main (String args[]) { 
		
			int n = 9; 
			System.out.println(fib(n)); 
	} 
} 

