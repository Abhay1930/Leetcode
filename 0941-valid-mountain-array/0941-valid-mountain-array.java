class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int max = Integer.MIN_VALUE;
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                a = i;
            }
        }
        if (a == 0 || a == arr.length - 1) {
            return false;
        }

        for (int i = 1; i < a; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        for (int i = a; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}