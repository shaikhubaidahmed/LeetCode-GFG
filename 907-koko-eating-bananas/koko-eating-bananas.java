class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int max=0;
        
        for(int num:piles){
            if(num>max){
                max=num;
            }
        }
        int high=max;
        // int high=10000;

        while(low<=high){
            int mid=low+(high-low)/2;

            long hours=findHours(piles,h,mid);
            // if(hours==h){
            //     return mid;
            // }

            if(hours<=h){
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public long findHours(int[] piles,int h,int mid){
        long count=0;
        for(int num:piles){
        //    System.out.println((int)Math.ceil(((double)num)/mid));
            count+=(long)Math.ceil(((double)num)/mid);
        }
        // System.out.println(count);
        return count;
    }
}