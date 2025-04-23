class Solution {
    public int findGCD(int[] nums) {
        int arr[]=findMin(nums);
        int a=arr[0];
        int b=arr[1];
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if (a==0) return b;
        return a;
    }
    public static int[] findMin(int[] nums){
        int min =Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        for(Integer num:nums){
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        return new int[]{min,max};
    }
}