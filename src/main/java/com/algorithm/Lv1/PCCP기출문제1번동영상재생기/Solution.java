package com.algorithm.Lv1.PCCP기출문제1번동영상재생기;

class Solution {
    //  "mm:ss" 형식의 시간 문자열을 초 단위로 변환
    private int timeToSeconds(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    // 초 단위 시간을 "mm:ss" 형식으로 변환
    private String secondsToTime(int totalSeconds) {
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 모든 시간을 초 단위로 변환
        int videoLength = timeToSeconds(video_len);
        int currentPos = timeToSeconds(pos);
        int opStart = timeToSeconds(op_start);
        int opEnd = timeToSeconds(op_end);

        // 초기 위치가 오프닝 구간인지 확인
        if (currentPos >= opStart && currentPos <= opEnd) {
            currentPos = opEnd;
        }

        // 각 명령어 처리
        for (String command : commands) {
            // 명령어 실행
            if (command.equals("prev")) {
                // 10초 전으로 이동
                currentPos = Math.max(0, currentPos - 10);
            } else if (command.equals("next")) {
                // 10초 후로 이동
                currentPos = Math.min(videoLength, currentPos + 10);
            }

            // 명령 실행 후 오프닝 구간 체크
            if (currentPos >= opStart && currentPos <= opEnd) {
                currentPos = opEnd;
            }
        }

        // 결과를 mm:ss 형식으로 변환하여 반환
        return secondsToTime(currentPos);
    }

    // 초기 위치가 오프닝 구간인 경우 먼저 처리
    // 각 명령어 실행 후에만 오프닝 구간 체크 (이전 버전은 명령어 실행 전에도 체크했음)
    // Math.max()와 Math.min()을 사용하여 경계값 처리를 더 명확하게 구현
}
