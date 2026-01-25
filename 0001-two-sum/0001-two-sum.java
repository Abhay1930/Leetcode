class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0 ; i < nums.length ; i++ ){
            int need = = target - nums[i];
            if(hm.contains(need){
                return new int[] {hm.get(i,need)}
            }else{
                hm.put(i,nums[i]);
            }
            return new int []{-1;-1};
        }
        
    }
}

