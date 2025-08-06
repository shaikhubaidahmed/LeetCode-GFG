class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int max=0;
        int count=0;
        for(int a:arr){
            if(a==1){
                count++;
            }else{
                max=Math.max(max,count);
                count=0;
            }
        }
    return Math.max(max,count);
    }
}