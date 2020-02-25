class Solution {
    public int balancedStringSplit(String s) {
      
        int splitString = 0;

        int rCounter = 0;
        int lCounter = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'R')
                rCounter++;
            else if (s.charAt(i) == 'L')
                lCounter++;

            if (rCounter == lCounter)
                splitString++;

        }

        return splitString;
    }
}