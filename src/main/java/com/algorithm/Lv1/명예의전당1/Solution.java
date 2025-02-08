package com.algorithm.Lv1.명예의전당1;

import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        // 최소 힙을 사용하여 상위 k개의 점수를 관리
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            // 현재 점수를 명예의 전당에 추가
            hallOfFame.add(score[i]);

            // k개 이상이면 가장 낮은 점수를 제거
            if (hallOfFame.size() > k) {
                hallOfFame.poll();
            }

            // 현재 명예의 전당의 최하위 점수를 기록
            answer[i] = hallOfFame.peek();
        }

        return answer;
    }
}
