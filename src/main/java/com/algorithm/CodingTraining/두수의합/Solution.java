package com.algorithm.CodingTraining.두수의합;

import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);


        return a1.add(b1).toString();
    }
}
