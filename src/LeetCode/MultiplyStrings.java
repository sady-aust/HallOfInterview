package Leetcode;

import java.math.BigInteger;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {

        return new BigInteger(num1).multiply(new BigInteger(num2)).toString();
    }
}
