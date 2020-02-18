// To find out how many students have to move to increase in height order for photo 
class Solution {
    public int heightChecker(int[] heights) {
        
        int i;
        int[] clone = heights.clone();    
        int count = 0;
        Arrays.sort(clone);
        for (i = 0; i < heights.length; i++){
            
            if (heights[i] != clone[i]){
                count++;
            }
        }
        return count;
    }
}