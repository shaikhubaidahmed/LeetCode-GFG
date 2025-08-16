class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list = new ArrayList<Integer>();

        int n = arr.length;
        int m = arr[0].length;

        int right = arr[0].length - 1;
        int left = 0;
        int top = 0;
        int bottom = arr.length - 1;
        //right
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                list.add(arr[top][i]);
            }
            top++;
            //left
            if (top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    list.add(arr[i][right]);
                }
                right--;
            }

            //bottom
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }

            //up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(arr[i][left]);
                }
                left++;
            }

        }
        return list;
    }
}