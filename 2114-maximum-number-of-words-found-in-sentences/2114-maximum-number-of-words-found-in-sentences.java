class Solution {
    public int mostWordsFound(String[] sentences) {
        int MAX = 0; 
        for (int i = 0; i < sentences.length; i++){
            String wordArr[] = sentences[i].split(" ");
            if (MAX < wordArr.length){
                MAX = wordArr.length;
            }
        }
        return MAX;
    
    }
}