class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0 ; i < n;i++){
            nums[i] = nums[i]*nums[i];
        }
        int left = 0 ;
        int right = n-1;
        int idx = n-1;

        while(left <= right){
            if(nums[left] > nums[right]){
                arr[idx--] = nums[left]; 
                left++;
            }else{
                arr[idx--] = nums[right];
                right--;
            }
        }
        return arr;
    }
}