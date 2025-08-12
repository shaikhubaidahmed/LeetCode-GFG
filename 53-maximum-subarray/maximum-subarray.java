class Solution {
    public int maxSubArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int el:arr){
            sum+=el;
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }

        }

        return max;
    }
}