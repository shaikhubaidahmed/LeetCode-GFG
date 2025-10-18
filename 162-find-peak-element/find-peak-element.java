class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return 0;
        if (arr[n - 1] > arr[n - 2])
            return n - 1;
        if(arr[0] > arr[1]){
            return 0;
        }

        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = low + high >> 1;

            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (arr[mid - 1] < arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return low;
    }
}