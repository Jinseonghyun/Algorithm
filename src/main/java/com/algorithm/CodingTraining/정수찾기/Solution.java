package com.algorithm.CodingTraining.정수찾기;

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numList, int n) {
        return IntStream.of(numList).anyMatch(num -> num == n) ? 1 : 0;

        // IntStream.of(numList)는 정수 배열을 IntStream으로 변환
        // IntStream은 int 타입의 요소들을 처리하기 위한 특별한 스트림

        //anyMatch 메소드가 스트림의 각 요소를 하나씩 자동으로 가져옵니다
        // 가져온 요소를 람다식의 변수(여기서는 num)에 자동으로 할당
        // 화살표(->) 뒤의 조건식을 실행
        // num -> num == n이라는 조건을 검사
        // num -> num == n은 람다식으로, 각 숫자(num)가 n과 같은지 비교
        // num은 배열의 각 요소를 의미
    }
}
