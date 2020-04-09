import java.io.*; 
import java.util.*; 

class PrimeNumbersWithSum { 

	static ArrayList<Integer> set = new ArrayList<Integer>(); 
	static ArrayList<Integer> prime = new ArrayList<Integer>(); 

	static boolean isPrime(int x) { 

		int sqroot = (int)Math.sqrt(x); 
		if (x == 1) { 
			return false;
		}
		for (int i = 2; i <= sqroot; i++) {
			
			if (x % i == 0) { 
				return false;
			}
		}
		return true; 
	} 
	static void display() {
		
		int length = set.size(); 
		for (int i = 0; i < length; i++) {
			
			System.out.print( set.get(i) + " ");
		}
		System.out.println(); 
	} 
	static void primeSum(int total, int N, int S, int index) { 

		if (total == S && set.size() == N) { 
			display(); 
			} 
		if (total > S || index == prime.size() || set.size() >= N) {
			return; 
			}
		else {
			set.add(prime.get(index)); 
			primeSum(total + prime.get(index), N, S, index + 1); 
			set.remove(set.size() - 1); 
			primeSum(total, N, S, index + 1); 
		}
	} 
	static void allPrime(int N, int S, int P) { 

		for (int i = P + 1; i <= S ; i++) { 

			if (isPrime(i)) { 
				prime.add(i);
			}
		} 
		if (prime.size() < N) {
			return; 
		}
		else {
			primeSum(0, N, S, 0); 
		}
	} 
	
	public static void main(String args[]) {
		
		int S = 54, N = 2, P = 3; 
		allPrime(N, S, P); 
	} 
} 