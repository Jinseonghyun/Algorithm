package com.algorithm.CodingTraining.조건에맞게수열변환하기3;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr).map(operand -> k % 2 == 0 ? operand + k : operand * k).toArray();

        // Arrays.stream(arr)는 배열을 스트림으로 변환
        // map() 메소드는 스트림의 각 요소(operand)에 대해 새로운 값을 만들어냅니다

        // k가 짝수일 경우: 배열의 각 요소에 k를 더함
        // k가 홀수일 경우: 배열의 각 요소에 k를 곱함

        // toArray()는 스트림의 결과를 다시 배열로 변환
    }
}
