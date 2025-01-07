package com.algorithm.CodingTraining.꼬리문자열;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list).filter(s -> !s.contains(ex)).collect(Collectors.joining());

        // filter(s -> !s.contains(ex))는 조건에 맞는 요소만 걸러냅니다
        // s는 배열의 각 문자열을 의미
        // !s.contains(ex)는 ex를 포함하지 않는 문자열만 선택합니다
        // Collectors.joining() 구분자 없이  필터링된 문자열들을 하나로 합칩니다
    }
}
