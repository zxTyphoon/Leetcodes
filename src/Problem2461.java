import java.util.HashMap;
import java.util.Map;

public class Problem2461 {

    public static void main(String[] args) {
        System.out.println("1,5,4,2,9,9,9 k=3: " + maximumSubarraySum(new int[]{1,5,4,2,9,9,9}, 3));
        System.out.println("4,4,4 k=3: " + maximumSubarraySum(new int[]{4,4,4}, 3));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long max = 0;
        long sum = 0;
        int r = 0;
        while (r < k) {
            sum += nums[r];
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            r++;
        }
        r--;
        if (map.size() == k) max = sum;
        for (int l = 0; l < nums.length - k; l++) {
            if (map.getOrDefault(nums[l], 0) > 1) {
                map.put(nums[l], map.get(nums[l]) - 1);
            } else {
                map.remove(nums[l]);
            }
            r++;
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            sum = sum - nums[l] + nums[r];
            if (map.size() == k && sum > max) max = sum;
        }
        return max;
    }
}