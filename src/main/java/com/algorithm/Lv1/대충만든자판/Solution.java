package com.algorithm.Lv1.대충만든자판;

import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 결과 배열 초기화
        int[] answer = new int[targets.length];

        // 각 문자별 최소 입력 횟수를 저장할 HashMap
        HashMap<Character, Integer> minPresses = new HashMap<>();

        // keymap을 순회하면서 각 문자의 최소 입력 횟수 계산
        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                // 현재 위치(i+1)가 기존 횟수보다 작으면 업데이트
                minPresses.put(c, Math.min(
                        minPresses.getOrDefault(c, Integer.MAX_VALUE),
                        i + 1
                ));
            }
        }

        // 각 target 문자열에 대해 필요한 총 입력 횟수 계산
        for (int i = 0; i < targets.length; i++) {
            int totalPresses = 0;
            boolean isPossible = true;

            // 각 문자에 대해 필요한 입력 횟수 합산
            for (char c : targets[i].toCharArray()) {
                if (!minPresses.containsKey(c)) {
                    isPossible = false;
                    break;
                }
                totalPresses += minPresses.get(c);
            }

            // 불가능한 경우 -1, 가능한 경우 총 입력 횟수 저장
            answer[i] = isPossible ? totalPresses : -1;
        }

        return answer;
    }
}
