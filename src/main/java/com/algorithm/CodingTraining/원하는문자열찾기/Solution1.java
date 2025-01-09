package com.algorithm.CodingTraining.원하는문자열찾기;

class Solution1 {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}