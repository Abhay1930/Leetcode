class Solution {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        int[] new_arr = new int[count + n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            new_arr[j] = arr[i];
            if (arr[i] == 0) {
                j++;
                new_arr[j] = 0;
            }
            j++;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = new_arr[i];
        }
    }
}
