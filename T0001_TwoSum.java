import java.util.Arrays;

public class T0001_TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,7,10};
        int target = 11;
        System.out.println(Arrays.toString((new Solution()).twoSum(nums, target)));
    }
}

/**
 * 1. 两数之和 <https://leetcode.cn/problems/two-sum/>
 * 
 * https://leetcode.cn/problems/two-sum/submissions/481270520/
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}