class Solution {
    public int searchInsert(int[] arr, int k) {
         int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(arr[mid]<k){
                low=mid+1;
            }else if(arr[mid]>k){
                high=mid-1;
            }else{
                return mid;
            }
        }
        return low;
    }
}