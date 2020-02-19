class Solution {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        HashSet<Character> jewels = new HashSet<>();
        
        for(int i=0; i<J.length(); i++){
            
            char c = J.charAt(i);
            if(jewels.contains(c) == false){
                jewels.add(c);
            }
        }
        
        for(int i=0; i<S.length(); i++){
            
            char c = S.charAt(i);
            if(jewels.contains(c)){
                res++;
            }
        }
        return res;
        
    }
}