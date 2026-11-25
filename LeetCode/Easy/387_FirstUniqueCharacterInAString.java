/**
 * Problem Link : https://leetcode.com/problems/first-unique-character-in-a-string/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        int[] ind=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            if(freq[s.charAt(i)-'a']==0){
                ind[s.charAt(i)-'a']=i;
            }
            freq[s.charAt(i)-'a']=++freq[s.charAt(i)-'a'];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<freq.length;i++){
            if(freq[i]==1){
                int min_ind=ind[i];
                if(min_ind<ans){
                    ans=min_ind;
                }
            }
        }
    return ans==Integer.MAX_VALUE?-1:ans;
    }
}
