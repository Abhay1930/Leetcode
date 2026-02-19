class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int low = 0; 
        int res = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {

            hm.put(s.charAt(high), hm.getOrDefault(s.charAt(high), 0) + 1);

            int k = (high - low) + 1;

            while (hm.size() < k) {
                hm.put(s.charAt(low), hm.getOrDefault(s.charAt(low), 0) - 1);

                if (hm.get(s.charAt(low)) == 0) {
                    hm.remove(s.charAt(low));
                }

                low++;
                k = (high - low) + 1;
            }

            res = Math.max(res, k);
        }

        return res;
    }
}
