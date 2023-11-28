class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        for (int i = 0; i < encoded.length; i++){
            arr[0] = first; 
            //bitwise XOR, performs operation with xor and traditional operator
            arr[i+1] = encoded[i] ^ arr[i];
        }
        
        return arr; 
        
    }
}