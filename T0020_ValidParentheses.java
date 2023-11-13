import java.util.Stack;

public class T0020_ValidParentheses {
    public static void main(String[] args) {

        // System.out.println((int) '(');  // 40
        // System.out.println((int) ')');  // 41
        // System.out.println((int) '[');  // 91
        // System.out.println((int) ']');  // 93
        // System.out.println((int) '{');  // 123
        // System.out.println((int) '}');  // 125

        Solution solution = new Solution();
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("{[]}"));

    }
}

/**
 * 20. 有效的括号
 * https://leetcode.cn/problems/valid-parentheses/
 */
class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            char newChar = arr[i];
            if (0 == stack.size()) {
                // 空栈，直接push
                // System.out.println("空栈，入：" + newChar);
                stack.push(newChar);
            } else {
                char stackTop = stack.peek();
                int scope = newChar - stackTop;
                // 非空栈，匹配则顶出，不匹配则入
                // System.out.printf("%s %s %d\n", newChar, stackTop, scope);
                if (2 == scope || 1 == scope) {
                    // System.out.printf("非空栈 匹配出栈 %s <-- %s\n", stack, newChar);
                    stack.pop();
                } else {
                    // System.out.printf("非空栈 不匹配入栈 %s <-- %s\n", stack, newChar);
                    stack.push(newChar);
                }
            }            
        }
        System.out.println("结果栈：" + stack.toString());
        return 0 == stack.size();
    }
}