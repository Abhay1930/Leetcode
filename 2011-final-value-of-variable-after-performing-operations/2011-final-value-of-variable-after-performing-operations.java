class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int counter = 0;
        for (int i = 0; i < operations.length; i++) {
            if (Objects.equals(operations[i], "++X") || Objects.equals(operations[i], "X++"))
                counter++;
            else 
                counter--;
        }
        return counter;
    }
}
