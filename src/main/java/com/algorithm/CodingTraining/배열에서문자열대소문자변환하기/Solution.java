package com.algorithm.CodingTraining.배열에서문자열대소문자변환하기;

import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] strArr) {
        return IntStream.range(0, strArr.length).mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase()).toArray(String[]::new);
    }
}
