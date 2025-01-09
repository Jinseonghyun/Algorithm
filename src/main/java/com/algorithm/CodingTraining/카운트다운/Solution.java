package com.algorithm.CodingTraining.카운트다운;

import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
    }

    // IntStream.rangeClosed(-start, -end): 이 부분은 -start부터 -end까지의 정수 스트림을 생성합니다.
    // rangeClosed 메서드는 두 끝점을 모두 포함합니다.
    //map(i -> -i): 이 연산은 스트림의 각 정수를 부정하여 변환합니다. 예를 들어, 스트림에 -3이 포함되어 있다면, 이는 3으로 변환됩니다.
    //toArray(): 마지막으로, 변환된 정수들을 배열로 수집
}
