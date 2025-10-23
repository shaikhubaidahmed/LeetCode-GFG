class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int ans=-1;        
        int low=1;
        int high=Integer.MIN_VALUE;

        for(int num:nums){
            if(num>high){
                high=num;
            }
        }
        while(low<=high){
            int mid=low+(high-low)/2;
                int sum=0;
            for(int num:nums){
                sum+=(int)Math.ceil((double)num/(double)mid);
                if(sum>threshold) break;
            }

            if(sum<=threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}