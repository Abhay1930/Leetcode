class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int[] arr = new int[nums.length];
        int a = 0;
        int b= 0;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] < 0){
                neg[a++]=nums[i];
            }else{
                pos[b++]=nums[i];
            }
        }
        int d = 0 ;
        int c = 0 ;
        for(int i = 0 ; i < nums.length;i++ ){
            if(i%2==0){
                arr[i]=pos[c++];
            }else{
                arr[i] = neg[d++];
            }
        }

        return arr;

    }
}