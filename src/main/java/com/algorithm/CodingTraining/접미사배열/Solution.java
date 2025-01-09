package com.algorithm.CodingTraining.접미사배열;

import java.util.stream.IntStream;

class Solution {
    public String[] solution(String myString) {
        return IntStream.range(0, myString.length()).mapToObj(myString::substring).sorted().toArray(String[]::new);
    }

    // mapToObj(myString::substring)는 각 정수 i에 대해 myString의 i번째 인덱스부터 끝까지의 부분 문자열을 생성합니다.
    // 즉, myString의 모든 접미사를 생성함

}
