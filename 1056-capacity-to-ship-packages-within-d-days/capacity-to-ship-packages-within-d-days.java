class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int ans=-1;
        int max=Integer.MIN_VALUE;
        int sumA=0;
        for(int num:weights){
            sumA+=num;
            if(num>max){
                max=num;
            }
        }

        int low=max;
        int high=sumA;

        while(low<=high){
            int mid=low+(high-low)/2;

            int sum=0;
            int day=1;
            for(int num:weights){
                if(sum+num>mid){
                    day++;
                    sum=num;
                }else{
                    sum+=num;
                }
            }

            if(day<=days){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
                
            }
        }
        return ans;
    }
}