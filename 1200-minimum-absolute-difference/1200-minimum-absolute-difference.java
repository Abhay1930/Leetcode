class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        int n = arr.length;
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff == minDiff) {
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return ans;
    }
}
