class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i <= n -1; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j <= n - 1; j++) {
                if (j !=i+1 && arr[j] == arr[j - 1])
                    continue;
                int low = j + 1;
                int high = n - 1;

                
                while (low < high) {
                    long sum=(long)arr[i]+arr[j]+arr[low]+arr[high];
                    if (sum == target) {
                        List<Integer> sublist = new ArrayList<>();
                        sublist.add(arr[i]);
                        sublist.add(arr[j]);
                        sublist.add(arr[low]);
                        sublist.add(arr[high]);
                        list.add(sublist);
                        low++;
                        high--;

                        while (low<high && arr[low] == arr[low - 1])
                            low++;
                        while (low<high && arr[high] == arr[high + 1])
                            high--;
                    } else if (sum > target) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        return list;
    }
}