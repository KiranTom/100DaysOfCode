class Solution {
    public int[] twoSum(int[] numbers, int target) {

  
        int n = numbers.length;
        
        for (int i = 0; i < n; i++) {
            
            int j = Arrays.binarySearch(numbers, i + 1, n, target - numbers[i]);
            if (j >= 0) {
                return new int[]{ i + 1, j + 1 };
            }
        }
        return new int[]{ -1, -1 };
    }
}