class Solution {
    public int heightChecker(int[] heights) {
        // build correct array 
        
        int[] expected = heights.clone();

        Arrays.sort(expected);
        
        
        //heights given, compare expected
        // if values differ, then count++
        int counter = 0; 
        for (int i = 0; i < heights.length; i++){
            if (heights[i] != expected[i]){
                counter++; 
            }
        }
        return counter;
        
    }
}