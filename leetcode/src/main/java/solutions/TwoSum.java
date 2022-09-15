package solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        Arrays.stream(twoSum(new int[]{1, 2, 4, 7}, 8)).forEach(index -> {
            System.out.println(index);
        });
    }
    public static int[] twoSum(int[] nums, int target) {
        final int size = nums.length;

        final int LOWER_LIMIT_FOR_ARRAY_SIZE = 2;
        final int UPPER_LIMIT_FOR_ARRAY_SIZE = (int) Math.pow(10, 4);
        final int LIMIT_FOR_NUMBER = (int) Math.pow(10, 9);

        if ((target < -LIMIT_FOR_NUMBER || target > LIMIT_FOR_NUMBER)
                || (size < LOWER_LIMIT_FOR_ARRAY_SIZE || size > UPPER_LIMIT_FOR_ARRAY_SIZE)) {
            return null;
        }

        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {

            int number = nums[index];

            if (number < -LIMIT_FOR_NUMBER || number > LIMIT_FOR_NUMBER) {
                return null;
            }

            int remaining = target - number;

            if (resultMap.containsKey(remaining)) {
                return new int[]{resultMap.get(remaining), index};
            } else {
                resultMap.put(nums[index], index);
            }
        }

        return null;
    }
}
