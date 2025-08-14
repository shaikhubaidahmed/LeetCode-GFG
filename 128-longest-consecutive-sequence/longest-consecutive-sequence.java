class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        int ans=1;
        for(int num:arr){
            set.add(num);
        }

        for(int num:set){
            if(!set.contains(num-1)){
                int count=1;
                while(set.contains(num+1)){
                    count++;
                    num++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}