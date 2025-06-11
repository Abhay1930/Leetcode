class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[idx] = nums[i];
                idx++;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
    }
}
