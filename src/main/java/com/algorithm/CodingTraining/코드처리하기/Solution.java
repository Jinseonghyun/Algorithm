package com.algorithm.CodingTraining.코드처리하기;

class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;  // 초기 mode는 0

        for (int idx = 0; idx < code.length(); idx++) {
            char currentChar = code.charAt(idx);

            if (currentChar == '1') {
                // mode 전환
                mode = 1 - mode;  // 0->1 또는 1->0
                continue;
            }

            if (mode == 0) {
                // mode가 0일 때는 짝수 인덱스만 처리
                if (idx % 2 == 0) {
                    ret.append(currentChar);
                }
            } else {
                // mode가 1일 때는 홀수 인덱스만 처리
                if (idx % 2 == 1) {
                    ret.append(currentChar);
                }
            }
        }

        // 결과가 빈 문자열이면 "EMPTY" 반환
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }

    /*
        StringBuilder를 사용하여 결과 문자열 생성
        mode 변수로 현재 상태(0 또는 1) 추적
        문자열을 순회하면서:
        현재 문자가 '1'이면 mode 전환
        mode가 0일 때는 짝수 인덱스의 문자만 추가
        mode가 1일 때는 홀수 인덱스의 문자만 추가

        빈 문자열인 경우 "EMPTY" 반환

        예시 "abc1abc1abc"의 처리 과정:
        mode 0: 'a'(idx 0) 추가 -> "a"
        mode 0: 'c'(idx 2) 추가 -> "ac"
        mode 1: 'b'(idx 5) 추가 -> "acb"
        mode 0: 'a'(idx 8) 추가 -> "acba"
        mode 0: 'c'(idx 10) 추가 -> "acbac"
    */
}
