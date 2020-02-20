class Solution {
    public int countCharacters(String[] words, String chars) {
       
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : chars.toCharArray()) {
            
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        int total = 0;
        
        for (String word : words) {
            
            boolean Found = true;
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                
                char c = word.charAt(i);
                if (map.getOrDefault(c, 0) >= charCount.getOrDefault(c, 0)) {
                    Found = false;
                    break;
                }
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            if (Found) {
                total += word.length();
            }
        }
        return total;
    }
}