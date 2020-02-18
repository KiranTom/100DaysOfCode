//To find numbers with even number of digits in java
class Solution {
    public int findNumbers(int[] nums) {
        
        int i,num;
        int n = nums.length;
        int count = 0;
        
        for(i=0; i<n; i++){
            num = nums[i];
            String s = Integer.toString(num);
            if(s.length()%2 == 0){
                count++;
            }            
        }
        return count;
    }
}