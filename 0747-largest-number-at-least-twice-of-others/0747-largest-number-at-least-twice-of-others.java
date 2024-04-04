class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0; 
        int newMax = 0; 
        int maxInd = 0;
        for (int i = 0; i < nums.length; i++){
            if (max < nums[i]){
                newMax = max;
                max = nums[i];
                maxInd = i; 
            }
            else if (newMax < nums[i]){
                newMax = nums[i];
            }
        }
        
        return max >= newMax * 2 ? maxInd : -1;
    }
}