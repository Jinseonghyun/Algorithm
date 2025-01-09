package com.algorithm.CodingTraining.원하는문자열찾기;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        if (myString.toLowerCase().contains(pat.toLowerCase())) {
            answer = 1;
        }
        return answer;
    }
}