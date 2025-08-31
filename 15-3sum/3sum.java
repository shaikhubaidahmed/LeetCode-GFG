class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k]==0){
                    List<Integer> sublist=new ArrayList<>();
                    sublist.add(arr[i]);
                    sublist.add(arr[j]);
                    sublist.add(arr[k]);
                    list.add(sublist);
                    j++;k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--; 
                }else if(arr[i]+arr[j]+arr[k]<0){
                    j++;
                }else{
                    k--;
                }
            }
        }

        return list;
    }
}