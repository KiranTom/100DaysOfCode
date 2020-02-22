class Solution {
    public int repeatedNTimes(int[] A) {

        int i;
        HashSet set=new HashSet<>();
        for(i=0;i<A.length;i++)
            
            if(!set.add(A[i]))return A[i];
            return 1;
    }
}