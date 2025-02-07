package com.algorithm.Lv1.개인정보수집유효기간;

import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // 약관 종류별 유효기간을 저장할 Map 생성
        Map<String, Integer> termMap = new HashMap<>();

        // 약관 정보를 Map에 저장
        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }

        // 오늘 날짜를 일수로 변환
        int todayDays = convertToDays(today);

        // 파기해야 할 개인정보 번호를 저장할 List
        List<Integer> expiredList = new ArrayList<>();

        // 각 개인정보별로 유효기간 검사
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            String date = parts[0];
            String type = parts[1];

            // 수집일자를 일수로 변환하고 유효기간을 더함
            int expirationDays = convertToDays(date) + (termMap.get(type) * 28);

            // 유효기간이 지났다면 해당 번호를 리스트에 추가
            if (todayDays >= expirationDays) {
                expiredList.add(i + 1);
            }
        }

        // List를 배열로 변환
        return expiredList.stream().mapToInt(Integer::intValue).toArray();
    }

    // 날짜를 일수로 변환하는 메서드
    private int convertToDays(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        return (year * 12 * 28) + (month * 28) + day;
    }
}
