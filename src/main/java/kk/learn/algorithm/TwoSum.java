package kk.learn.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yukang.chen
 * @since 8/4/15
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer otherIndex = numsMap.get(target - nums[i]);
            if (otherIndex != null &&  i != otherIndex) {
                ret[0] = i + 1;
                ret[1] = otherIndex + 1;
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] ret = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(ret[0]);
        System.out.println(ret[1]);
    }
}
