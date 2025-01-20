package com.algorithm.Lv1.PCCE기출문제10번데이터분석;

import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // 정렬 기준 인덱스 매핑
        Map<String, Integer> columnMap = new HashMap<>();
        columnMap.put("code", 0);
        columnMap.put("date", 1);
        columnMap.put("maximum", 2);
        columnMap.put("remain", 3);

        // 필터링 기준 컬럼 인덱스
        int extIndex = columnMap.get(ext);
        // 정렬 기준 컬럼 인덱스
        int sortIndex = columnMap.get(sort_by);

        // 조건에 맞는 데이터 필터링
        List<int[]> filteredList = new ArrayList<>();
        for (int[] row : data) {
            if (row[extIndex] < val_ext) {
                filteredList.add(row);
            }
        }

        // 정렬 기준에 따라 정렬
        Collections.sort(filteredList, (a, b) -> a[sortIndex] - b[sortIndex]);

        // List를 배열로 변환
        int[][] answer = new int[filteredList.size()][];
        for (int i = 0; i < filteredList.size(); i++) {
            answer[i] = filteredList.get(i);
        }

        return answer;
    }
}
