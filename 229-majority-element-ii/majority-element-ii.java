class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        int major1=0;
        int major2=0;
        int count1=0;
        int count2=0;

        for(int num:nums){
            if(count1==0 && num!=major2){
                count1++;
                major1=num;
            }else if(count2==0 && num!=major1){
                count2++;
                major2=num;
            }else if(num==major1){
                count1++;
            }else if(num==major2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

        int freq=nums.length/3;
        count1=0;
        count2=0;
        for(int num:nums){
            if(num==major1){
                count1++;
            }else if(num==major2){
                count2++;
            }
        }
        if(count1>freq){
            list.add(major1);
         }
         if(count2>freq){
            list.add(major2);
         }
         return list;
    }
}