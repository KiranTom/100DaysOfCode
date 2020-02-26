class Solution {
    public boolean judgeCircle(String moves) {
     
        int countUD = 0; 
        int countLR = 0;
        
        for(char ch : moves.toCharArray()){
            switch(ch){
             case  'U': countUD++;
                break;
             case  'D': countUD--;
                break;
             case  'L': countLR++; 
                break;
             case  'R': countLR--; 
                break;
            }
        }
        
        return countUD == 0 && countLR == 0;
    }
}