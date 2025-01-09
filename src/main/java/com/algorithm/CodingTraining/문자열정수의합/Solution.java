package com.algorithm.CodingTraining.문자열정수의합;

import java.util.stream.Stream;

class Solution {
    public int solution(String num_str) {
        return Stream.of(num_str.split("")).mapToInt(Integer::parseInt).sum();

        // num_str.split(""): 문자열을 한 글자씩 분리
        // 예를 들어 "123"이라는 입력이 있다면 ["1", "2", "3"] 형태의 문자열 배열이 됩니다

        // mapToInt(Integer::parseInt): Stream의 각 문자열 요소를 정수로 변환
        // sum(): 스트림의 모든 정수를 더합니다
    }
}
