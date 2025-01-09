package com.algorithm.CodingTraining.순서바꾸기;

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).toArray();
    }
    // 0부터 num_list.length - 1까지의 정수 스트림을 생성
    // 인덱스 i에 대해, num_list의 (i + n) % num_list.length 위치의 요소를 가져옵니다.
}
