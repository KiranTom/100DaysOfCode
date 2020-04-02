class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int length = cost.length;
        int[] arr = new int[length];
        arr[0] = cost[0];
        arr[1] = cost[1];
        
        for (int i = 2; i < length; i++) {
            
            arr[i] = Math.min(arr[i - 1] + cost[i], arr[i - 2] + cost[i]);
        }
        return Math.min(arr[length - 1], arr[length - 2]);
    }
}