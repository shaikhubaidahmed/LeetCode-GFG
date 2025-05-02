class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int num=0;num<nums.length;num++){
            if(map.containsKey(target-nums[num])){
                ans[0]=map.get(target-nums[num]);
                ans[1]=num;
            }else{
                map.put(nums[num],num);
            }
        }
        return ans;
    }
}