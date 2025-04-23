class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        allSubset(nums.length,nums,0,l,new ArrayList<Integer>());
        return l;
    }

    public void allSubset(int n,int nums[],int i,List<List<Integer>> ans,List<Integer> l){
        if(i==n){
            ans.add(new ArrayList<Integer>(l));
            return ;
        }
        l.add(nums[i]);
        // System.out.print(l);
        allSubset(n,nums,i+1,ans,l);
        l.removeLast();
        allSubset(n,nums,i+1,ans,l);
        return;
    }
}