class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int presum=0;
        int count=0;

        for(int num:arr){
            presum+=num;
            if(map.containsKey(presum-k)){
                count+=map.get(presum-k);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
        }   
        return count;
    }
}