class Solution {
    public int[] searchRange(int[] arr, int k) {
        int first=-1;
        int last=-1;
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
                first=mid;
                high=mid-1;
                
            }
        }

        if (first==-1) return new int[]{first,last};

        //  int n=arr.length;
        low=0;
        high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(arr[mid]<k){
                low=mid+1;
            }else if(arr[mid]>k){
                high=mid-1;
            }else{
                last=mid;
                low=mid+1;
                
                
            }
        }
        // return low;

        return new int[]{first,last};
    }
}