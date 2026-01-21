class Solution {
    public int removeDuplicates(int[] arr) {
        int j = 0;
        for(int i = 1; i< arr.length;i++){
            if(arr[i]!= arr[i-1]){
                j++;
                arr[j]= arr[i];
            }
        }
        return j+1;
    }
}