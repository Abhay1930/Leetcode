class NumArray {
    int[] preffix;

    public NumArray(int[] nums) {
        int n = nums.length;
        preffix = new int[n];
        preffix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            preffix[i] = preffix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) return preffix[right];
        return preffix[right] - preffix[left - 1];
    }
}
