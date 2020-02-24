class Solution {
    public int maxNumberOfBalloons(String text) {
        
        if(text.length()<6){
            return 0;
        }
        
        Map<Character,Integer> dictionary = new HashMap <>();
        dictionary.put('b',0);
        dictionary.put('a',0);
        dictionary.put('l',0);
        dictionary.put('o',0);
        dictionary.put('n',0);
        
        Map<Character,Integer> letter = new HashMap<>();
        letter.put('b',1);
        letter.put('a',1);
        letter.put('l',2);
        letter.put('o',2);
        letter.put('n',1);
        
        for(int i=0; i<text.length(); i++){
            
            char c = text.charAt(i);
            
            int amount = dictionary.getOrDefault(c,-1);
            
            if(amount != -1){
                dictionary.put(c,amount+1);
            }    
        }
        
        int balloonAmount = Integer.MAX_VALUE;
        
        for (char i : dictionary.keySet()) {
            
            int ratio = dictionary.get(i)/letter.get(i);
            
            if(ratio < balloonAmount){
                balloonAmount = ratio;
            }
        
        }
                
        return balloonAmount;
    }
}