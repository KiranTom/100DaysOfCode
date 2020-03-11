class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int  n1 = nums1.length, n2 = nums2.length;
        int k = 0;
        int[] result = new int[n1];
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        for (int i=0, j=0; i<n1 && j<n2;) {
            
            if (nums1[i] < nums2[j]) {
                i++;
            }
            else if (nums1[i] == nums2[j++]) {
                result[k++] = nums1[i++];
            }
        }
         return Arrays.copyOf(result, k);
    }
}