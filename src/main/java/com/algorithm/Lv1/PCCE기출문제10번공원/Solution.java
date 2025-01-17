package com.algorithm.Lv1.PCCE기출문제10번공원;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] mats, String[][] park) {
        // 공원의 크기(rows, cols)를 파악합니다
        // mats 배열을 정렬
        int rows = park.length;
        int cols = park[0].length;

        // 돗자리 크기를 내림차순으로 정렬
        Arrays.sort(mats);

        // 각 돗자리 크기에 대해 확인 (큰 크기부터 확인하는 과정)
        for (int k = mats.length - 1; k >= 0; k--) {
            int size = mats[k];

            // 공원의 크기가 돗자리보다 작으면 넘어감
            if (size > rows || size > cols) {
                continue;
            }

            // 해당 크기의 돗자리를 놓을 수 있는지 확인
            if (canPlaceMat(park, size)) {
                return size;
            }
        }

        return -1;
    }

    private boolean canPlaceMat(String[][] park, int size) {
        int rows = park.length;
        int cols = park[0].length;

        // 공원의 모든 가능한 위치에서 돗자리를 놓을 수 있는지 확인
        // 각 위치마다 새로운 HashSet을 생성하여 그 위치에 있는 기존 돗자리를 추적
        for (int i = 0; i <= rows - size; i++) {
            outer: for (int j = 0; j <= cols - size; j++) {
                // size x size 영역 확인
                Set<String> existingMats = new HashSet<>(); // 현재 영역의 기존 돗자리들

                // "-1"이 아닌 값(알파벳)을 발견하면 해당 알파벳을 existingMats에 추가
                for (int r = i; r < i + size; r++) {
                    for (int c = j; c < j + size; c++) {
                        String current = park[r][c];
                        if (!current.equals("-1")) {
                            // 알파벳이면 기존 돗자리가 있는 것
                            existingMats.add(current);
                            continue outer; // 이 위치는 불가능
                        }
                    }
                }

                // 가능한 위치 발견 시 (해당 영역에 기존 돗자리가 없으면)
                if (existingMats.isEmpty()) {
                    return true;
                }
            }
        }

        return false;
    }

    /*
    * 먼저 5x5 크기 시도: 어떤 위치에서도 5x5 크기의 연속된 "-1" 공간을 찾을 수 없음

    다음으로 3x3 크기 시도: 중앙 부분에서 3x3 크기의 연속된 "-1" 공간을 찾음,  true 반환

    결과적으로 3을 반환: 2x2도 가능하지만 이미 3x3이 가능하다는 것을 확인했으므로 3 반환
     */
}
