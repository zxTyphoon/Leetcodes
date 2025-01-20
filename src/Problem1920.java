public class Problem1920 {
    public static void main(String[] args) {
        System.out.println("Example 1: ");
        int[] ex1 = buildArray(new int[]{0,2,1,5,3,4});
        for (int i : ex1) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("Example 2: ");
        int[] ex2 = buildArray(new int[]{5,0,1,2,3,4});
        for (int i : ex2) {
            System.out.print(i);
        }
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i <= nums.length-1; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
