class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int[] ans = new int[n*2];
        for (int i = 0 ; i < nums.length;i++ ){
           ans[i]= nums[i];
           ans[n+i]=nums[i];
        }
        return ans;
    }
}