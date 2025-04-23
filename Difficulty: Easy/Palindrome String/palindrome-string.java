//{ Driver Code Starts
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine(); // Use lowercase 's'

            Solution ob = new Solution();
            if (ob.isPalindrome(s)) // Check palindrome
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean isPalindrome(String s) {
        // code here
        char arr[]=s.toCharArray(); 
        return checkPalindrome(arr,0,arr.length-1);
    }
    boolean checkPalindrome(char[] arr,int i,int j){
        if(i>=j) return true;
        
        if(arr[i]!=arr[j]) return false;
         return checkPalindrome(arr,i+1,j-1);
        
    }
};