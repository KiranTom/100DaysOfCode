class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        if(s.length == 0 || g.length == 0) {
            return 0;
        }
        
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int position = s.length - 1;
        
        for(int i = g.length - 1; i >= 0; i--) {
            
            if(s[position] >= g[i]) {
                count++;
                position--;
            }
            
            if(position == -1) {
                break;
            }
        }
        
        return count;    
    }
}