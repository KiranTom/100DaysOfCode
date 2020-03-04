class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }
        
        for(int n : nums2) {
            if (set.contains(n)) {
                res.add(n);
            }
        }
        int[] ret = new int[res.size()];
        int i = 0;
        for (int n :  res) {
            ret[i++] = n;
        }
        
        return ret;
    }
}