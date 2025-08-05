class Solution {
    public void moveZeroes(int[] arr) {
        int j=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j!=-1){
            for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                arr[i]=arr[i]^arr[j];
                arr[j]=arr[i]^arr[j];
                arr[i]=arr[i]^arr[j];
                j++;
            }
        }
        }
        
    }
}