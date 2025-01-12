package com.algorithm.CodingTraining.qrcode;

class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();

        // code의 각 인덱스를 순회
        for (int i = 0; i < code.length(); i++) {
            // 현재 인덱스를 q로 나눈 나머지가 r과 같으면
            if (i % q == r) {
                // 해당 위치의 문자를 결과에 추가
                answer.append(code.charAt(i));
            }
        }

        return answer.toString();
    }
}
