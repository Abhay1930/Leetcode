class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // if(word1.length != word2.length){
        //     return false;
        // }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        // for(int i =0 ;i<word1.length-1;i++){
        //     sb1.append(word1[i]);
            
        // }
        for (String s : word1) {
            sb1.append(s);
        }
        String resultBuilder1 = sb1.toString();

        //  for(int i =0 ;i<word1.length-1;i++){
        //     sb2.append(word2[i]);
        // }
        for (String s : word2) {
            sb2.append(s);
        }
        String resultBuilder2 = sb2.toString();

        if(resultBuilder1.equals(resultBuilder2)) {return true;}
        return false;


    }
}
// class Solution {
//     public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//         StringBuilder sb1 = new StringBuilder();
//         StringBuilder sb2 = new StringBuilder();

//         for (String s : word1) {
//             sb1.append(s);
//         }

//         for (String s : word2) {
//             sb2.append(s);
//         }

//         return sb1.toString().equals(sb2.toString());
//     }
// }