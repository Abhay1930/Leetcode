class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s = 0;
        int e = 0; 
        double currSum = 0;
        double maxSum = Integer.MIN_VALUE;

        while (e < nums.length) {
            currSum += nums[e];
            int currentWindowSize = e - s + 1;

            if (currentWindowSize < k) {
                e++;
            } else if (currentWindowSize == k) {
                maxSum = Math.max(maxSum, currSum);
                currSum -= nums[s]; 
                s++;
                e++;
            }
        }

        return maxSum / k;
    }
}
