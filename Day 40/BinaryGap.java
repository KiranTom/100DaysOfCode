class Solution {
    public int binaryGap(int N) {
        
        int arr[] = new int[32];
        int temp = 0;
        
        for(int i=0; i<32; i++) {
            
            if(N%2 == 1) {
            arr[temp++] = i;
            }
            
            N = N/2;
        }
        int ans = 0;
        for(int j=0; j<temp-1; j++) {
            
            ans = Math.max(ans,arr[j+1]-arr[j]);
        }
        return ans;
    }
}