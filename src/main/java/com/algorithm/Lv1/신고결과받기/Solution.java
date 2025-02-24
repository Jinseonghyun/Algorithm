package com.algorithm.Lv1.신고결과받기;

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int n = id_list.length;
        int[] answer = new int[n];

        // 사용자 ID를 인덱스로 매핑하기 위한 Map
        Map<String, Integer> idToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            idToIndex.put(id_list[i], i);
        }

        // 중복 신고 제거를 위한 Set
        Set<String> uniqueReports = new HashSet<>(Arrays.asList(report));

        // 각 사용자별 신고당한 횟수를 저장할 배열
        int[] reportedCount = new int[n];

        // 각 사용자가 신고한 사용자 목록
        List<Set<Integer>> reportedUsers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            reportedUsers.add(new HashSet<>());
        }

        // 신고 정보 처리
        for (String rep : uniqueReports) {
            String[] parts = rep.split(" ");
            String reporter = parts[0]; // 신고한 사용자
            String reported = parts[1]; // 신고당한 사용자

            int reporterIdx = idToIndex.get(reporter);
            int reportedIdx = idToIndex.get(reported);

            // 신고 정보 저장
            reportedUsers.get(reporterIdx).add(reportedIdx);
            reportedCount[reportedIdx]++;
        }

        // 정지된 사용자 목록 생성
        Set<Integer> bannedUsers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (reportedCount[i] >= k) {
                bannedUsers.add(i);
            }
        }

        // 메일 수신 횟수 계산
        for (int i = 0; i < n; i++) {
            int mailCount = 0;
            for (int reportedUser : reportedUsers.get(i)) {
                if (bannedUsers.contains(reportedUser)) {
                    mailCount++;
                }
            }
            answer[i] = mailCount;
        }

        return answer;
    }
}
