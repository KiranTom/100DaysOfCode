class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
     
        int start = 0, end = letters.length-1;
        
        while (start <= end) {
            
            int mid = end +((start - end)/2);
            
            if (letters[mid] <= target) {
                
                start = mid + 1;
            } else {
                
                end = mid - 1;
            }
        }
        
        return  start < letters.length ? letters[start] : letters[0];
      /*  if (start < letters.length) {
            return letters[start];
        }

            return letters[0];
       */     
    }
}