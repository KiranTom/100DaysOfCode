class Solution {
    public int compress(char[] chars) {
        
        if (chars == null || chars.length == 0) {
            return 0;
        }
        int i = 0; // for reading
        int j = 0; 

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }
            chars[j++] = currentChar;
            if (count > 1) {
                for (char ch : Integer.toString(count).toCharArray()) {
                    chars[j++] = ch;
                }
            }
        }
        return j;
    }
}