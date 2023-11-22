class Solution {
    public int[] buildArray(int[] nums) {
        
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[i];

        }

        for (int j = 0; j  < nums.length; j++){
            ans[j] = nums[nums[j]];
        }


        return ans; 

    }
}