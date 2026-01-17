class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0 ; i < sentences.length ; i++){
           int a = sentences[i].split("\\s+").length;
           if(a> max){
            max =a;
           }
        }
        return max;
    }
}