class Solution {
    public int[] sortByBits(int[] arr) {
        
		Arrays.sort(arr);

		int i, Count = 13;
		int[] elements = new int[Count + 1];
        
		for (i = 0; i < arr.length; i++){
            
			elements[Integer.bitCount(arr[i])]++;
            
		}
		int[] Position = new int[Count + 1];
        
		Position[0] = 0;
        
		for (i = 1; i < Position.length; i++){
            
			Position[i] =
            Position[i - 1] + elements[i - 1];
		}
		int[] result = new int[arr.length];
		for (i = 0; i < arr.length; i++){
            
			result[Position[Integer.bitCount(arr[i])]++] = arr[i];
		}

		return result; 
    }
}