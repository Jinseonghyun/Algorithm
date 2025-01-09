package com.algorithm.CodingTraining.조건에맞게수열변환하기1;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr).map(operand -> operand >= 50 && operand % 2 == 0 ? operand / 2 : operand < 50 && operand % 2 == 1 ? operand * 2 : operand).toArray();
    }

    // ap 메서드를 사용하여 각 요소 operand를 변환합니다. 변환 규칙은 다음과 같습니다:
    // operand가 50 이상이고 짝수인 경우: operand / 2 (50 이상 짝수는 절반으로 나눕니다.)
    // operand가 50 미만이고 홀수인 경우: operand * 2 (50 미만 홀수는 두 배로 증가시킵니다.)
}
