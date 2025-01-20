package com.algorithm.Lv1.달리기경주;

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 선수 이름과 현재 등수를 저장하는 HashMap
        HashMap<String, Integer> rankMap = new HashMap<>();
        // 등수와 선수 이름을 저장하는 HashMap
        HashMap<Integer, String> playerMap = new HashMap<>();

        // 초기 순위 데이터 저장
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
            playerMap.put(i, players[i]);
        }

        // 경주 진행
        for (String calling : callings) {
            // 호명된 선수의 현재 등수
            int currentRank = rankMap.get(calling);
            // 앞 선수의 이름
            String frontPlayer = playerMap.get(currentRank - 1);

            // 순위 교체
            rankMap.put(calling, currentRank - 1);
            rankMap.put(frontPlayer, currentRank);

            playerMap.put(currentRank - 1, calling);
            playerMap.put(currentRank, frontPlayer);
        }

        // 최종 결과 배열 생성
        String[] answer = new String[players.length];
        for (int i = 0; i < players.length; i++) {
            answer[i] = playerMap.get(i);
        }

        return answer;
    }
}
