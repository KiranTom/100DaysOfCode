
class Solution {
    public String reverseOnlyLetters(String S) {
      
        int j=S.length()-1;
        char[] A=S.toCharArray();
        int i=0;
        while(i<j){
            if(Character.isLetter(A[i])){
                if(Character.isLetter(A[j])){
                    char temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                    j--;
                    i++;
                }
                else{
                    j--;
                }
                
            }
            else{
                i++;
            }
        }
        return String.valueOf(A);
    }
}