class Solution {
    public int singleNumber(int[] arr) {
        int xor=0;
        for(int a:arr){
            xor^=a;
        }
        return xor;
    }
}