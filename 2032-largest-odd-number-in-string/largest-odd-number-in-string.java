class Solution {
    public String largestOddNumber(String str) {
        int n=str.length();

        for(int i=n-1;i>=0;i--){
            if((str.charAt(i)-'0')%2==1){
                return str.substring(0,i+1);
            }
        }
        return "";
    }
}