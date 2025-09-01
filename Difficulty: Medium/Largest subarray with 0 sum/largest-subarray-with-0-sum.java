class Solution {
    int maxLength(int arr[]) {
        // code here
        int n=arr.length;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int presum=0;
        for(int i=0;i<n;i++){
            presum+=arr[i];
            if(presum==0){
                max=Math.max(max,i+1);
            }else{
                if(map.get(presum)!=null){
                    max=Math.max(max,i-map.get(presum));
                }else{
                    map.put(presum,i);
                }
            }
        }
        return max;
    }
}