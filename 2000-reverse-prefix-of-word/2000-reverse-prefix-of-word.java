

class Solution {
    public String reversePrefix(String word, char ch) {
        int j = word.indexOf(ch);
        if (j == -1) {
            return word;
        }
        StringBuilder sb = new StringBuilder(word.substring(0, j + 1));
        sb.reverse();
        sb.append(word.substring(j + 1));
        return sb.toString();
    }
}
