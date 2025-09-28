class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        // FIX 1: The 'm = arr1.length;' line was the main error.
        // We need the original 'm' and 'n'. We should not change them.

        // FIX 2: To make the Gap Method work easily, first copy the elements
        // from arr2 into the empty space at the end of arr1.
        for (int i = 0; i < n; i++) {
            arr1[m + i] = arr2[i];
        }

        // Now arr1 contains all m+n elements, and we can sort it in place.
        int len = m + n;
        // FIX 3: Use a double for division to calculate ceiling correctly.
        // Start the gap calculation with the total length.
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                // FIX 4: The logic is now much simpler.
                // We only need to compare and swap elements within the single arr1.
                if (arr1[left] > arr1[right]) {
                    // Corrected swap call for a single array
                    swap(arr1, left, right);
                }
                left++;
                right++;
            }

            if (gap == 1) {
                break; // If gap is 1, the next one will be 0, so we can exit.
            }
            // Update the gap for the next iteration.
            gap = (gap / 2) + (gap % 2);
        }

        // FIX 5: The final loop to copy elements is no longer needed
        // because we did it at the very beginning.
    }

    // Corrected swap helper to work on a single array
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}