package stack;

import java.util.ArrayList;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "()"
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * <p>
 * Input: s = "(]"
 * Output: false
 * <p>
 * C++ Implementation: https://www.linkedin.com/pulse/coding-challenge-valid-parentheses-william-fehlhaber/
 */
public class ValidParenthesis {
    private String s;
    ArrayList<Character> mStack = new ArrayList<>();

    public ValidParenthesis(String s) {
        this.s = s;
    }

    public boolean isValidString() {
        boolean isValid = false;
        for (int i = 0; i < s.length(); i++) {
            char ar = s.charAt(i);
            if (ar == '(' || ar == '[' || ar == '{') {
                push(ar);
            }
            if (ar == ')' || ar == ']' || ar == '}') {
                if (isEmpty()) {
                    isValid = false;
                    break;
                }else{
                        char peek = peek();
                        isValid = isComplete(ar, peek);
                        if (isValid){
                            System.out.println("Does");
                            pop();
                        }else {
                            break;
                        }
                }

            }
        }

        return isValid && isEmpty();
    }
    private boolean isComplete(char candidate, char peek){
        return (peek == '(' && candidate == ')')
                || (peek == '[' && candidate == ']')
                || (peek == '{' && candidate == '}');
    }
    public void push(char pc) {
        mStack.add(pc);

    }

    public char pop() {
        int n = getSize() - 1;
        char old = mStack.get(n);
        mStack.remove(n);
        return old;

    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public char peek() {
        int n = getSize() - 1;
        return mStack.get(n);
    }

    public int getSize() {
        return mStack.size();
    }
}
