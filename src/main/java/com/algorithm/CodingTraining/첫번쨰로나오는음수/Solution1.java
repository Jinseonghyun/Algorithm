package com.algorithm.CodingTraining.첫번쨰로나오는음수;

import java.util.stream.IntStream;

class Solution1 {
    public int solution(int[] numList) {
        return IntStream.range(0, numList.length).filter(i -> numList[i] < 0).findFirst().orElse(-1);
    }

    // 첫 번째 음수 인덱스 찾기: .findFirst()는 필터링된 스트림에서 첫 번째 요소를 찾습니다.
    // .orElse(-1)는 만약 음수 요소가 없을 경우 -1을 반환
}
