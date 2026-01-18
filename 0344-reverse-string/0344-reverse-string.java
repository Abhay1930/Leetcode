class Solution {
    public void reverseString(char[] s) {
        int top = s.length;
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < top; i++){
            stack.push(s[i]);
        }

        for(int i = 0 ; i < top; i++){
            s[i] = stack.pop();
        }
    }
}





      

   

 
