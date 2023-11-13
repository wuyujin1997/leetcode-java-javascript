import java.util.Stack;
import java.util.Arrays;


public class T0007_ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120));
        System.out.println(solution.reverse(0));
        System.out.println(solution.reverse(1534236469));
        // System.out.println(solution.reverse(9646324351));
        
    }
}

/**
 * 7. 整数反转
 * https://leetcode.cn/problems/reverse-integer/
 */
class Solution {
    public int reverse(int x) {
        char[] arr = String.valueOf(x).toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if ('-' == arr[0]) {
            i = 1;
            sb.append('-');
        }
        while (i < arr.length) {
            stack.push(arr[i]);
            i++;
        }
        while (0 < stack.size()) {
            sb.append(stack.pop());
        }
        long result = Long.valueOf(sb.toString());
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) result;
        }
    }
}
