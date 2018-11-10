package Leetcode;

import java.util.Stack;

public class P20 {

    static boolean isOpenBracket(char c) {
        if (c == '(' || c == '{' || c == '[') {
            return true;
        }

        return false;
    }

    static boolean isCloseBracket(char c) {
        if (c == ')' || c == '}' || c == ']') {
            return true;
        }

        return false;
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for (Character c : arr) {
            if (isOpenBracket(c)) {
                stack.push(c);
            } else if (isCloseBracket(c)) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();

                    if (isOpenBracket(top)) {
                        if (c == ')' && top != '(') {
                            return false;
                        } else if (c == ']' && top != '[') {
                            return false;
                        } else if (c == '}' && top != '{') {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }

        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("["));
    }
}
