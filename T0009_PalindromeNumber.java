public class T0009_PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
        System.out.println(solution.isPalindrome(-121));
        System.out.println(solution.isPalindrome(10));
    }
}

/**
 * 9. 回文数
 * https://leetcode.cn/problems/palindrome-number/
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        char[] arr = String.valueOf(x).toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}