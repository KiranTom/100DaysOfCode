class Solution {
    public String removeDuplicates(String S) {
        
        Stack<Character> stack = new Stack();
        String str = "";
        stack.push(S.charAt(0)); 
        str = str + S.charAt(0);
        
        for(int i = 1; i < S.length(); i++) {
            
            if(!stack.isEmpty() && stack.peek() == S.charAt(i)) {
                stack.pop();
                str = str.substring(0, str.length()-1);
            } 
            else {
                stack.push(S.charAt(i));
                str = str + S.charAt(i);
            }
        }
        return str;
    }
}