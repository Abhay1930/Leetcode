class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            al.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            al.add(nums2[i]);
        }

        Collections.sort(al);

        int total = nums1.length + nums2.length;
        int a = total / 2;
        double median;

        if (total % 2 == 0) {
            median = (al.get(a - 1) + al.get(a)) / 2.0;
            return median;
        }

        return al.get(a);
    }
}
