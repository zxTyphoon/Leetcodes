public class Problem628 {

    public static void main(String[] args) {
        System.out.println("-1,-2,1,2,3: " + maximumProduct(new int[]{-1,-2,1,2,3}));
        System.out.println("1,2,3: " + maximumProduct(new int[]{1, 2, 3}));
        System.out.println("1,2,3,4: " + maximumProduct(new int[]{1, 2, 3, 4}));
        System.out.println("-1,-2,-3: " + maximumProduct(new int[]{-1,-2,-3}));
        System.out.println("-100,-98,-1,2,3,4: " + maximumProduct(new int[]{-100,-98,-1,2,3,4}));
    }

    public static int maximumProduct(int[] nums) {
        int max = -100;
        int second = -100;
        int third = -100;
        int smallest = 100;
        int secondSmallest = 100;
        int temp;
        int temp2;
        for(int i = 0; i < nums.length; i++){
            temp = nums[i];
            if(temp > max){
                temp = max;
                max = nums[i];
            }
            if(temp > second){
                temp2 = temp;
                temp = second;
                second = temp2;
            }
            if(temp > third)third = temp;
            temp = nums[i];
            if(temp < smallest){
                temp = smallest;
                smallest = nums[i];
            }
            if(temp < secondSmallest)secondSmallest = temp;
            }
        if(secondSmallest * smallest > second * third && max >= 0 && secondSmallest + smallest < 0)return secondSmallest * smallest * max;
        return max*second*third;
    }

}
