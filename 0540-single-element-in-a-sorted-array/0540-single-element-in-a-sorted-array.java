class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length - 1;

        if (nums.length == 1) {
            return nums[0];
        } 

        int left = 0, right = n;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (mid == 0 && nums[0] != nums[1]) {
                return nums[mid];
            }
            if (mid == n && nums[n] != nums[n - 1]) {
                return nums[mid];
            }


            if (mid > 0 && mid < n && nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    left = mid + 2;
                } else {
                    right = mid - 1;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}