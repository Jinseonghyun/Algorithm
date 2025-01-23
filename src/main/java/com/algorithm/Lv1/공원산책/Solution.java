package com.algorithm.Lv1.공원산책;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();

        // 시작 지점 찾기
        int startX = -1, startY = -1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    startX = i;
                    startY = j;
                    break;
                }
            }
            if (startX != -1) break;
        }

        // 방향 매핑
        int[] dx = {-1, 1, 0, 0}; // 북, 남, 서, 동
        int[] dy = {0, 0, -1, 1};

        // 방향 인덱스 매핑
        int x = startX, y = startY;

        for (String route : routes) {
            String[] command = route.split(" ");
            String dir = command[0];
            int dist = Integer.parseInt(command[1]);

            // 방향에 따른 인덱스 선택
            int dirIndex = switch (dir) {
                case "N" -> 0;
                case "S" -> 1;
                case "W" -> 2;
                case "E" -> 3;
                default -> -1;
            };

            // 이동 가능성 체크
            boolean canMove = true;
            for (int step = 1; step <= dist; step++) {
                int newX = x + dx[dirIndex] * step;
                int newY = y + dy[dirIndex] * step;

                // 공원 범위 체크
                if (newX < 0 || newX >= h || newY < 0 || newY >= w) {
                    canMove = false;
                    break;
                }

                // 장애물 체크
                if (park[newX].charAt(newY) == 'X') {
                    canMove = false;
                    break;
                }
            }

            // 이동 가능하면 위치 업데이트
            if (canMove) {
                x += dx[dirIndex] * dist;
                y += dy[dirIndex] * dist;
            }
        }

        return new int[]{x, y};
    }
}
