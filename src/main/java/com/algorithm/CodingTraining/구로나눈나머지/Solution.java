package com.algorithm.CodingTraining.구로나눈나머지;

class Solution {
    public int solution(String number) {
        return number.chars().map(c -> (c - '0') % 9).sum() % 9;
    }

    // number.chars(): 각 문자는 해당 ASCII 값으로 표현되며,
    // 숫자 문자의 경우 '0'의 ASCII 값(48)에서 해당 문자의 ASCII 값을 빼면 실제 숫자 값
    // 각 문자에 대해 (c - '0') % 9를 적용합니다. 여기서 c - '0'는 문자 c를 정수로 변환하는 과정입니다.
    // 예를 들어, 문자 '3'는 3으로 변환됩니다. 그 후, 이 값을 9로 나눈 나머지를 계산
}
