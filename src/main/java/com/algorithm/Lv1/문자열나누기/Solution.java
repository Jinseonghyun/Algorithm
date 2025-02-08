package com.algorithm.Lv1.문자열나누기;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int index = 0;

        while (index < s.length()) {
            char x = s.charAt(index);  // 첫 글자를 x로 지정
            int xCount = 0;  // x의 등장 횟수
            int otherCount = 0;  // x가 아닌 글자의 등장 횟수

            // 현재 위치부터 문자열 끝까지 검사
            while (index < s.length()) {
                // 현재 문자가 x인 경우
                if (s.charAt(index) == x) {
                    xCount++;
                } else {
                    otherCount++;
                }

                index++;

                // x의 개수와 다른 글자의 개수가 같아지면 분리
                if (xCount == otherCount) {
                    break;
                }
            }

            // 하나의 문자열이 분리되었으므로 카운트 증가
            answer++;
        }

        return answer;
    }
}
