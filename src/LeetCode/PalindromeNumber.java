package Leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        String xS = Integer.toString(x);

        String revS = new StringBuilder(xS).reverse().toString();

        return xS.equals(revS);
    }
}
