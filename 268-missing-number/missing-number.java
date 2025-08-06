class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length;
        int sum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            sum-=arr[i];
        }
        return sum;
    }
}