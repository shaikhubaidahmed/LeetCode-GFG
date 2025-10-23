class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int ans=-1;
        int low=1;
        int high=Integer.MIN_VALUE;
        int flowers=m*k;
        //Max value finding
        for(int num:bloomDay){
            if(num>high){
                high=num;
            }
        }

            while(low<=high){
                int mid=low+(high-low)/2;

                int countB=0;
                int countF=0;
                for(int num:bloomDay){
                    if(num<=mid){
                        countF++;
                        if(countF==k){
                            countB++;
                            countF=0;
                        }
                    }else{
                        countF=0;
                    }
                    if(countB==m){
                        break;
                    }
                }

                if(countB>=m){
                    ans=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }






        return ans;
    }
}