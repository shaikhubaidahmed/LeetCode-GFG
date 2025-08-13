class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        int n=arr.length;
        int max=Integer.MIN_VALUE;

        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        reverse(list,0,list.size()-1);
        return list;
    }
    public static void reverse(ArrayList<Integer> list,int i,int j){
        while(i<j){
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);

            i++;
            j--;
        }
    }
}
