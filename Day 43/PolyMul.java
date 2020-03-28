	class PolyMul {
	 
		static int[] multiply(int A[], int B[],int m, int n) 
		{ 
			int[] prod = new int[m + n - 1]; 

			for (int i = 0; i < m + n - 1; i++) 
			{ 
				prod[i] = 0; 
			} 
			for (int i = 0; i < m; i++) 
			{ 
				for (int j = 0; j < n; j++) 
				{ 
					prod[i + j] += A[i] * B[j]; 
				} 
			} 

			return prod; 
		} 
		static void printPoly(int poly[], int n) 
		{ 
			for (int i = 0; i < n; i++) 
			{ 
				System.out.print(poly[i]); 
				if (i != 0) 
				{ 
					System.out.print("x^" + i); 
				} 
				if (i != n - 1) 
				{ 
					System.out.print(" + "); 
				} 
			} 
		}  
		public static void main(String[] args) 
		{ 
			int A[] = {5, 0, 10, 6}; 
			int B[] = {1, 2, 4}; 
			int m = A.length; 
			int n = B.length; 

			System.out.println("First polynomial is n"); 
			printPoly(A, m); 
			System.out.println("nSecond polynomial is n"); 
			printPoly(B, n); 

			int[] prod = multiply(A, B, m, n); 

			System.out.println("nProduct polynomial is n"); 
			printPoly(prod, m + n - 1); 
		} 
	} 
