package com.algorithm.CodingTraining.특정문자열로끝나는가장긴부분문자열찾기;

class Solution {
    public String solution(String myString, String pat) {
        String answer = "";

        int idx = myString.lastIndexOf(pat);

        answer = myString.substring(0, idx) + pat;

        return answer;
    }
}
