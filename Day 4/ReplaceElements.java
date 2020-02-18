// To replace elements with greatest elements from right side
class Solution {
    public int[] replaceElements(int[] arr) {
        
        int output[] = new int[arr.length];
        int max = -1;
        for(int i=arr.length-1;i>=0;i--){
            output[i] = max;
            max = Math.max(arr[i],max);
        }
        return output;
    }
}