public class Problem169 {

    public static void main(String[] args) {
        System.out.println("3,2,3: " + majorityElement(new int[]{3, 2, 3}));
        System.out.println("2,2,1,1,1,2,2: " + majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement(int[] nums) {
        int number = 0;
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            number = nums[i];
            counter = 0;
            for(int e = 0; e < nums.length; e++){
                if(nums[e] == number){
                    counter++;
                }
            }
            if(counter > nums.length/2){
                break;
            }
        }
        return number;
    }
}
