package com.algorithm.CodingTraining.문자열정수의합;

import java.util.stream.Stream;

class Solution1 {
    public int solution(String numStr) {
        return numStr.chars().map(c -> c - 48).sum();

        // numStr.chars(): 문자열을 ASCII 코드값으로 이루어진 IntStream으로 변환
        // 예를 들어 "123"이라면 [49, 50, 51]이 됩니다 (각 숫자의 ASCII 코드값)

        // map(c -> c - 48): 각 문자의 ASCII 코드값에서 48을 빼서 실제 숫자로 변환합니다
        // 48을 빼는 이유: ASCII 코드에서 '0'은 48, '1'은 49, '2'는 50... 이런 식입니다
        // 따라서 48을 빼면 실제 숫자값이 됩니다:

        // '1' (ASCII 49) - 48 = 1
        // '2' (ASCII 50) - 48 = 2
        // '3' (ASCII 51) - 48 = 3

        // sum()
    }
}
