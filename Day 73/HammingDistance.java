class Solution {
    public int hammingDistance(int x, int y) {
        
        int z=x^y;
        int c=0;
        for(int i=0;i<32;i++) {
            
            if((z>>i&1)==1) { 
                c++;
            }
        }
        return c;
    }
}