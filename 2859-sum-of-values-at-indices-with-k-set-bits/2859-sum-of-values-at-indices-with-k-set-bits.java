class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
 
        int sum = 0; 
        for (int i = 0; i < nums.size(); i++){
            if (getBitCount(i) == k){
                sum += nums.get(i);
            }
        }
        return sum;
    }
    
    int getBitCount (int num){
        int bitCount = 0; 
        while (num > 0){
              // lets check for LSB 
            if (num % 2 == 1){
                bitCount++;
            }
            // After right shift: 0000 0100, which is 4 in decimal
            num = num >> 1;
        }
        return bitCount;
    }
}