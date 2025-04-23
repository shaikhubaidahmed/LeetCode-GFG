class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int arr[]={0,1};
        for(int i=2;i<=n;i++){
            int ans=arr[0]+arr[1];
            arr[0]=arr[1];
            arr[1]=ans;
        }
        return arr[1];
    }
}