package com.algorithm.Lv1.가장많이받은선물;

import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        // 친구 이름을 인덱스로 매핑하는 HashMap 생성
        Map<String, Integer> friendIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            friendIndex.put(friends[i], i);
        }

        // 선물 주고받은 기록을 저장할 2차원 배열
        int[][] giftMatrix = new int[n][n];
        // 각 사람의 준 선물 수와 받은 선물 수를 저장할 배열
        int[] given = new int[n];
        int[] received = new int[n];

        // 선물 기록 처리
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int giver = friendIndex.get(parts[0]);
            int receiver = friendIndex.get(parts[1]);
            giftMatrix[giver][receiver]++;
            given[giver]++;
            received[receiver]++;
        }

        // 다음 달 선물 수 계산
        int[] nextMonthGifts = new int[n];

        // 모든 쌍에 대해 계산
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // 두 사람이 주고받은 선물 비교
                if (giftMatrix[i][j] > giftMatrix[j][i]) {
                    // i가 j에게 더 많이 줌
                    nextMonthGifts[i]++;
                } else if (giftMatrix[i][j] < giftMatrix[j][i]) {
                    // j가 i에게 더 많이 줌
                    nextMonthGifts[j]++;
                } else {
                    // 선물을 주고받지 않았거나 같은 수로 주고받은 경우
                    // 선물 지수 비교
                    int giftIndexI = given[i] - received[i];
                    int giftIndexJ = given[j] - received[j];

                    if (giftIndexI > giftIndexJ) {
                        nextMonthGifts[i]++;
                    } else if (giftIndexI < giftIndexJ) {
                        nextMonthGifts[j]++;
                    }
                }
            }
        }

        // 가장 많은 선물을 받는 사람의 선물 수 찾기
        int maxGifts = 0;
        for (int count : nextMonthGifts) {  // gifts를 count로 변경
            maxGifts = Math.max(maxGifts, count);
        }

        return maxGifts;
    }
}
