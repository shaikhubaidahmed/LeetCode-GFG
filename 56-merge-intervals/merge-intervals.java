class Solution {
    public int[][] merge(int[][] intervals) {
        int rows=intervals.length;
        int col=intervals[0].length;
        List<List<Integer>> list=new ArrayList<>();

        Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int[] interval:intervals){
            if(interval[0]<=end){
                end=Math.max(interval[1],end);
            }else{
                list.add(new ArrayList<>(Arrays.asList(start,end)));
                start=interval[0];
                end=interval[1];
            }
        }
        list.add(new ArrayList<>(Arrays.asList(start, end)));
        return convertToArray(list);
    }
    public int[][] convertToArray(List<List<Integer>> twoDList){
           int rows = twoDList.size();
    int cols = twoDList.get(0).size();
    int[][] arrayFromLoop = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
         arrayFromLoop[i][j] = twoDList.get(i).get(j);
        }
    }
    return arrayFromLoop;
    }
}