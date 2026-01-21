class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[2];
        HashSet<Integer> hs = new HashSet<>();
        int a = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                a++; 

                if (hs.contains(grid[i][j])) {
                    arr[0] = grid[i][j]; 
                } else {
                    hs.add(grid[i][j]);
                }
            }
        }

        for (int i = 1; i <= a; i++) {
            if (!hs.contains(i)) {
                arr[1] = i; 
                break;
            }
        }

        return arr;
    }
}
