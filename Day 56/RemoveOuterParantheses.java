class Solution {
    
    public String removeOuterParentheses(String S) {

        Stack<Character> stack = new Stack<Character>();
        StringBuilder para = new StringBuilder();
        int start = 0;
        int end = 0;
        
        for (int index = 0; index<S.length(); index++) {
            
            char c = S.charAt(index);
            
            if (c == '(') {
                if (stack.isEmpty()) {
                    start = index;
                }
                stack.push(c);
            }
            
            if (c == ')') {
                stack.pop();
                if (stack.isEmpty()) {
                    end = index;
                    if (end - start == 1) {
                        continue;
                    }
                    else {
                    para.append(S.substring(start+1, end));
                    }
                } 
            }    
        }
        return para.toString();
    }
}