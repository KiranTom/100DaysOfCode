class Solution {
    public boolean isAnagram(String s, String t) {
        
    char[] schar = s.toCharArray();
    char[] tchar = t.toCharArray();
        
    Arrays.sort(schar);
    Arrays.sort(tchar);
    
    String s1 = new String(schar);
    String s2 = new String(tchar);
        
    if(s1.equals(s2)){
        return true;
    }
    else{
        return false;
        } 
    }
}