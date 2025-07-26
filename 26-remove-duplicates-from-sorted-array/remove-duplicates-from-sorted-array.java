class Solution {
    public int removeDuplicates(int[] arr) {
        int j=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j-1]){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
}