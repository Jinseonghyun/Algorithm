package com.algorithm.Lv1.둘만의암호;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String s, String skip, int index) {
        // skip 문자들을 Set으로 변환하여 빠른 탐색 지원
        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }

        // 결과 문자열을 저장할 StringBuilder
        StringBuilder answer = new StringBuilder();

        // 원본 문자열의 각 문자에 대해 변환 수행
        for (char c : s.toCharArray()) {
            answer.append(transformChar(c, skipSet, index));
        }

        return answer.toString();
    }

    // 개별 문자를 변환하는 보조 메서드
    private char transformChar(char start, Set<Character> skipSet, int index) {
        char current = start;

        // index만큼 이동
        for (int i = 0; i < index; i++) {
            // 다음 문자로 이동 (z 이후에는 a로 순환)
            current = (char)((current == 'z') ? 'a' : current + 1);

            // skip 문자를 만나면 추가 이동
            while (skipSet.contains(current)) {
                current = (char)((current == 'z') ? 'a' : current + 1);
            }
        }

        return current;
    }
}
