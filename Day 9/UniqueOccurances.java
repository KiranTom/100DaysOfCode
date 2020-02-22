class Solution {
    public boolean uniqueOccurrences(int[] arr) {

         Map<Integer, Integer> map = new HashMap<>();

                for(int i = 0;i<arr.length;i++){
                    
                    if(map.containsKey(arr[i])){
                        int q = map.get(arr[i]) + 1;
                        map.put(arr[i], q);   
                    }
                    else
                        map.put(arr[i], 1);
                }

                Set<Integer> set = new HashSet<>();

                for(int i : map.keySet()){
                    
                    if(!set.add(map.get(i))){
                        return false;
	}
                }
                return true;
    }
}