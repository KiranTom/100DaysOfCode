class Solution {
    public String toLowerCase(String str) {
        
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>=65 && arr[i]<=90){
                arr[i] = (char) (arr[i]+32);
            }
        }
        String s=String.copyValueOf(arr);
        return s;
       // return str.toLowerCase(); or use this line
    }
}