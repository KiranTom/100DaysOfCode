class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int n = name.length();
        int m = typed.length();
        char[] a = name.toCharArray();
        char[] b = typed.toCharArray();
        int i = 0, j = 0;

         if (n > m) {
             return false;
         }
        while (a[i++] == b[j++] && j < m) {

            if (b[j] == b[j-1] && (i == n || a[i] != a[i-1])) { 
                i--;
            }
        }
         //or do return i == n && j == m;
        if (i==n && j==m) {
            return true;
        }
        return false;
    }
}