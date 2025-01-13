package com.algorithm.CodingTraining.문자개수세기;

class Solution {
    public int[] solution(String my_string) {
        // 52개의 원소를 가진 배열 생성 (A-Z: 0-25, a-z: 26-51)
        int[] answer = new int[52];

        // 문자열의 각 문자를 순회
        for (char c : my_string.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                // 대문자인 경우 (A=65를 빼서 0부터 시작하는 인덱스로 변환)
                answer[c - 'A']++;
            } else if (c >= 'a' && c <= 'z') {
                // 소문자인 경우 (a=97를 빼서 26부터 시작하는 인덱스로 변환)
                answer[c - 'a' + 26]++;
            }
        }

        return answer;
    }
}
