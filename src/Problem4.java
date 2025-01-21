public class Problem4 {

    public static void main(String[] args) {
        System.out.println("[1,3] , [2]: " + findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
        System.out.println("[1,2], [3,4]: " + findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] nums = new double[nums1.length + nums2.length];
        int i = 0;
        int e = 0;
        int j = 0;
        while (i < nums1.length || e < nums2.length) {
            if (i < nums1.length && e == nums2.length) {
                nums[j] = nums1[i];
                i++;
            } else if (i == nums1.length) {
                nums[j] = nums2[e];
                e++;
            } else if (nums1[i] < nums2[e]) {
                nums[j] = nums1[i];
                i++;
            } else {
                nums[j] = nums2[e];
                e++;
            }
            j++;
        }
        if (nums.length % 2 != 0)
            return nums[nums.length / 2];
        return (nums[nums.length/2] + nums[(nums.length/2)-1]) / 2;
    }
}
