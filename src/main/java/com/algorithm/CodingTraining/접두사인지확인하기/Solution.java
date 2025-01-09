package com.algorithm.CodingTraining.접두사인지확인하기;

class Solution {
    public int solution(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)) return 1;
        return 0;
    }

    //  startsWith 메서드를 사용하여 my_string이 is_prefix로 시작하는지를 확인합니다.
}
