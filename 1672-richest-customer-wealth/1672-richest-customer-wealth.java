class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int maxWealth = 0;

        for (int i = 0; i < m; i++) {
            int sum = 0; 
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
           
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
