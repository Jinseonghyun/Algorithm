package com.algorithm.Lv1.가장가까운같은글자;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] lastPosition = new int[26]; // 알파벳 소문자 26개의 마지막 위치 저장

        // lastPosition 배열을 -1로 초기화
        for (int i = 0; i < 26; i++) {
            lastPosition[i] = -1;
        }

        // 각 위치의 문자에 대해 처리
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int charIndex = currentChar - 'a'; // 알파벳 인덱스 (0-25)

            // 이전에 나온 적이 없으면 -1
            if (lastPosition[charIndex] == -1) {
                answer[i] = -1;
            } else {
                // 현재 위치와 마지막 위치의 차이
                answer[i] = i - lastPosition[charIndex];
            }

            // 현재 위치를 마지막 위치로 업데이트
            lastPosition[charIndex] = i;
        }

        return answer;
    }
}
