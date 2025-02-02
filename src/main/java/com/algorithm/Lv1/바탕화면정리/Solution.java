package com.algorithm.Lv1.바탕화면정리;

class Solution {
    public int[] solution(String[] wallpaper) {
        // 초기값 설정: 최소/최대 좌표를 찾기 위해 극단값으로 초기화
        int minRow = wallpaper.length;
        int minCol = wallpaper[0].length();
        int maxRow = -1;
        int maxCol = -1;

        // 모든 파일('#')의 위치를 확인하며 최소/최대 좌표 갱신
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    // 파일이 있는 위치를 발견하면 최소/최대 좌표 갱신
                    minRow = Math.min(minRow, i);
                    minCol = Math.min(minCol, j);
                    maxRow = Math.max(maxRow, i + 1); // 드래그 끝점은 파일 위치 + 1
                    maxCol = Math.max(maxCol, j + 1); // 드래그 끝점은 파일 위치 + 1
                }
            }
        }

        // 시작점(minRow, minCol)과 끝점(maxRow, maxCol)을 배열로 반환
        return new int[]{minRow, minCol, maxRow, maxCol};
    }
}
