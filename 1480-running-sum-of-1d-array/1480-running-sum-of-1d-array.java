class Solution {
    public int[] runningSum(int[] nums) {
        int runningsum = 0; 
        
        for (int i = 0; i < nums.length; i++){
            nums[i] = runningsum + nums[i];
            
            runningsum = nums[i];
            //nums[i] += nums[i-1];
        }
        return nums;
        
    }
}