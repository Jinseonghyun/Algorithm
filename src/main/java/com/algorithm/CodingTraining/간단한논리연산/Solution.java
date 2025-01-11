package com.algorithm.CodingTraining.간단한논리연산;

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1||x2)&&(x3||x4);
        return answer;
    }

    // (x1 || x2): x1과 x2 중 하나라도 true면 true
    // (x3 || x4): x3와 x4 중 하나라도 true면 true
    // 최종적으로 위의 두 결과를 AND(&&) 연산

    // (x1 || x2) 부분:
    // x1    x2    결과
    // F     F     F
    // F     T     T
    // T     F     T
    // T     T     T

    // (x3 || x4) 부분:
    // x3    x4    결과
    // F     F     F
    // F     T     T
    // T     F     T
    // T     T     T

    // 최종 AND 연산:
    // (x1||x2)  (x3||x4)  결과
    // F         F         F
    // F         T         F
    // T         F         F
    // T         T         T
}
