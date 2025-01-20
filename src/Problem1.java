public class Problem1 {


    public static void main(String[] args) {
        System.out.println("2,7,11,15, Target 9:");
        int[] nums1 = {2,7,11,15}; int target1 = 9;
        int[] res1 = twoSum(nums1, target1);
        for(int res : res1){
            System.out.print(res + ",");
        }
        System.out.println("\n3,2,4, Target 6:");
        int[] nums2 = {3,2,4}; int target2 = 6;
        int[] res2 = twoSum(nums2, target2);
        for(int res : res2){
            System.out.print(res + ",");
        }
        System.out.println("\n3,3, Target 6:");
        int[] nums3 = {3,3};int target3=6;
        int[] res3 = twoSum(nums3, target3);
        for(int res : res3){
            System.out.print(res + ",");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean found = false;
        for(int i = 0; i < nums.length; i++){
            for(int e = i+1; e < nums.length; e++){
                if(nums[i] + nums[e] == target){
                    result[0] = i;
                    result[1] = e;
                    found = true;
                    break;
                }

            } if(found){
                break;
            }
        }return result;
    }
}