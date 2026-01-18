class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int a = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                a = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != a && nums[i] * 2 > max) {
                return -1;
            }
        }
        return a;
    }
}
