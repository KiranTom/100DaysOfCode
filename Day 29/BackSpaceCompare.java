class Solution {
    public boolean backspaceCompare(String S, String T) {
        
          char[] c1 = S.toCharArray();
          char[] c2 = T.toCharArray();

          int i = c1.length - 1;
          int j = c2.length - 1;

          while (i >= 0 || j >= 0) {
              
            int b1 = 0;
            while (i >= 0 && (c1[i] == '#' || b1 > 0)) {
              
              if(c1[i] ==  '#') {
                  b1 = b1 + 1;
              }  
              else {
                  b1 = b1 + -1;
              }  
           // or do  b1 += c1[i] == '#'? 1: -1;
              i--;
            }

            int b2 = 0;
            while (j >= 0 && (c2[j] == '#' || b2 > 0)) {
              
                if(c2[j] == '#') {
                    b2 = b2 + 1;
                }
                else {
                    b2 = b2 -1;
                }
             // or do  b2 += c1[j] == '#'? 1: -1;
              j--;
            }

            if ((i >= 0 && j >= 0 && c1[i] != c2[j]) ||
                (i >= 0 && j < 0) || (i < 0 && j >= 0)) {
              return false;
            }

            i--;
            j--;
          }

          return true;
    }
}