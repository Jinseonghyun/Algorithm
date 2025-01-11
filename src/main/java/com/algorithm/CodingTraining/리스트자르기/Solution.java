package com.algorithm.CodingTraining.리스트자르기;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;
        int[] answer = new int[(end - start + step) / step];
        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }
        return answer;
    }

    // 시작점(start) 설정
    // n이 1이면 시작점은 0
    // 그 외의 경우 slicer[0]값을 시작점으로 사용

    // 끝점(end) 설정
    // n이 2이면 배열의 마지막 인덱스
    // 그 외의 경우 slicer[1]값을 끝점으로 사용

    // 단계(step) 설정
    // n이 4이면 slicer[2]값을 단계로 사용
    // 그 외의 경우 단계는 1

    // 결과 배열 생성과 값 채우기
    // n = 1: 처음부터 slicer[1]까지 자르기
    // n = 2: slicer[0]부터 끝까지 자르기
    // n = 3: slicer[0]부터 slicer[1]까지 자르기
    // n = 4: slicer[0]부터 slicer[1]까지 slicer[2] 간격으로 자르기
}
