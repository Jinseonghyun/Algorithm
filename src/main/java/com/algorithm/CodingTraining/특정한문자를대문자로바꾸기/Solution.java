package com.algorithm.CodingTraining.특정한문자를대문자로바꾸기;

class Solution {
    public String solution(String my_string, String alp) {
        String a = alp.toUpperCase();
        return my_string.replaceAll(alp, a);
    }
}