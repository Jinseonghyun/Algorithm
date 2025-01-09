package com.algorithm.CodingTraining.배열의원소만큼추가하기;

import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] arr) {
        String answer = "";

        for(int i: arr) {
            answer += (String.valueOf(i)+",").repeat(i);
        }
        return Stream.of(answer.split(",")).mapToInt(Integer::parseInt).toArray();
    }

    // for(int i: arr)는 arr 배열의 각 요소를 순회합니다
    // String.valueOf(i)는 숫자를 문자열로 변환합니다
    // repeat(i)는 해당 문자열을 i번 반복합니다
    // 각 숫자 뒤에 쉼표(,)를 추가하여 구분합니다

    // answer.split(",")로 쉼표를 기준으로 문자열을 분리합니다
    // Stream.of()로 문자열 배열을 스트림으로 변환합니다
    // mapToInt(Integer::parseInt)로 각 문자열을 정수로 변환합니다
    // toArray()로 최종 정수 배열을 생성
}
