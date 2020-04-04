import java.io.*; 
public class FriendsPairing {

	static int countFriendsPairings(int n) 
	{ 
		int[] arr = new int[n + 1]; 
		for (int i = 0; i <= n; i++) { 
			
			if (i <= 2) {
				arr[i] = i; 
			}
			else {
				arr[i] = arr[i - 1] + (i - 1) * arr[i - 2]; 
			}
		} 
		return arr[n]; 
	} 
	
	public static void main(String[] args) 
	{ 
		int n = 4; 
		System.out.println(countFriendsPairings(n)); 
	} 
} 
//f(n) = f(n - 1) + (n - 1) * f(n - 2)