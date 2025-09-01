class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n=arr.length;
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(n<=3){
            return list;    
        }
        Arrays.sort(arr);
        for(int i=0;i<n-3;i++){
            if(i!=0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j!=i+1 && arr[j]==arr[j-1]) continue;
                int low=j+1;
                int high=n-1;
                long subt=(long)target-arr[i]-arr[j];
                while(low<high){
                    if(arr[low]+arr[high]==subt){
                        List<Integer> sublist=new ArrayList<>();
                        sublist.add(arr[i]);
                        sublist.add(arr[j]);
                        sublist.add(arr[low]);
                        sublist.add(arr[high]);
                        list.add(sublist);
                        low++;
                        high--;
                        while(low<high && arr[low]==arr[low-1]){
                            low++;
                        }
                        while(low<high && arr[high]==arr[high+1]){
                            high--;
                        }
                        
                    }else if(arr[low]+arr[high]<subt){
                        low++;
                    }else{
                        high--;
                    }
                }
                // while(j+1<n-2 && arr[j]==arr[j+1]){
                //     j++;
                // }
            }//j loop
            // while(i+1<n-3 && arr[i]==arr[i+1]){
            //     i++;
            // }
        }
        return  list;
    }
}