class Solution {
    public int removeElement(int[] nums, int val) {
        // should return k, should delete val in nums, 
        // should delte all val in nums 

        int runner = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[runner] = nums[j];
                runner++;
            }
        }
        return runner;
    }
}