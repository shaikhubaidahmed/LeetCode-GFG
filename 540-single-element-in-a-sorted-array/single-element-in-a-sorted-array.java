class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        int low=0;
        int high=arr.length-1;
        int ans=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }

            if((arr[mid] == arr[mid-1] && (mid-1)%2==0) ||(arr[mid] == arr[mid+1] && (mid)%2==0)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}