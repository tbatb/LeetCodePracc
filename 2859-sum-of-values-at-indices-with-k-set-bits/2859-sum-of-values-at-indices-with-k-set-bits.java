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
                if (num % 2 == 1){
                    bitCount++;
                }
                num = num >> 1;
            }
            return bitCount;
    }
}