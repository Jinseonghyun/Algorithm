package com.algorithm.CodingTraining.원소들의곱과합;

import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int sum = Arrays.stream(num_list).reduce(Integer::sum).getAsInt();
        int product = Arrays.stream(num_list).reduce((i,j)->i*j).getAsInt();
        return product < sum * sum ? 1 : 0;
    }

    // reduce 메서드를 사용하여 요소들의 합을 계산합니다.
    // Integer::sum은 두 개의 정수를 더하는 메서드 참조입니다.
    // 최종적으로 getAsInt()를 호출하여 합계 값을 sum 변수에 저장

    // reduce 메서드를 사용하여 요소들의 곱을 계산합니다. (i, j) -> i * j는 두 개의 정수를 곱하는 람다 표현식입니다.
    // getAsInt()를 호출하여 곱셈 결과를 product 변수에 저장

    // 계산된 곱(product)이 합의 제곱(sum * sum)보다 작은지를 비교
}
