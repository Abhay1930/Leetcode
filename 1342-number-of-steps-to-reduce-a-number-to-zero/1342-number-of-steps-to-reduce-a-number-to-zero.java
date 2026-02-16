class Solution {
    public int numberOfSteps(int num) {
        int count = 0;

        if (num == 0) {
            return 0;
        }

        if (num % 2 != 0) {
            count++;
            num = num - 1;
            return count + numberOfSteps(num);
        }

        count++;
        return count + numberOfSteps(num / 2);
    }
}
