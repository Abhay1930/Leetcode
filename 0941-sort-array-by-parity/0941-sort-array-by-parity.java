class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int idx = 0;
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                temp[idx] = nums[i];
                idx++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                 temp[idx] = nums[i];
                idx++;
            }
        }
        return temp;
    }
}