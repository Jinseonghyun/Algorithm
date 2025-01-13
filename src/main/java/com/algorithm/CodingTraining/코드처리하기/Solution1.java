package com.algorithm.CodingTraining.코드처리하기;

class Solution1 {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                answer.append(current);
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}
