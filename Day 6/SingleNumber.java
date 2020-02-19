class Solution {
    public int singleNumber(int[] nums) {
        
        int i; 
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(i = 0; i < nums.length; i++){
            
            if(map.containsKey(nums[i])){
                hm.remove(nums[i]);
            }
            else{
                map.put(nums[i],1);
            }
        }          
        for (Integer k: map.keySet()){
            if(map.get(k) == 1){
                return (k);
            }
        }
        return 0;
    }
}