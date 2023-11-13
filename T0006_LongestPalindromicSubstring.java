public class T0006_LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // System.out.println(solution.longestPalindrome("babad"));
        System.out.println(solution.longestPalindrome("cbbd"));
        // System.out.println(solution.longestPalindrome("abcdefedjjk"));
    }
}

/**
 * 6. 最长回文子串
 * https://leetcode.cn/problems/longest-palindromic-substring/
 */
class Solution {
    public String longestPalindrome(String s) {
        for (int len = s.length(); len > 1; len--) {
            // System.out.printf("%s:\t", len);
            for (int beginIndex = 0; beginIndex < s.length() - len + 1; beginIndex++) {
                int endIndex = beginIndex + len;
                String currentStr = s.substring(beginIndex, endIndex);
                // System.out.printf("[%s,%s):%s\t", beginIndex, endIndex, currentStr);
                if (isPalindromic(currentStr)) {
                    // System.out.println();
                    return currentStr;
                }
            }
            // System.out.println();
        }
        return s.substring(0, 1);
    }
    private boolean isPalindromic(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}