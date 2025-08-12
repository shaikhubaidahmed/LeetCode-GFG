class Solution {
    public int majorityElement(int[] arr) {
        int el=-1;
        int count=0;
        for(int ele:arr){
            if(count==0){
                el=ele;
            }

            if(el==ele){
                count++;
            }else{
                count--;
            }
        }
        return el;
    }
}