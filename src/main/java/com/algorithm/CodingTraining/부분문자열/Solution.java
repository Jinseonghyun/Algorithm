package com.algorithm.CodingTraining.부분문자열;

class Solution {
    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }
}
