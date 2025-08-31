class Solution {
    public int majorityElement(int[] nums) {
        int maj=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                count++;
                maj=num;
            }else if(num==maj){
                count++;
            }else{
                count--;
            }
        }
        return maj;
    }
}