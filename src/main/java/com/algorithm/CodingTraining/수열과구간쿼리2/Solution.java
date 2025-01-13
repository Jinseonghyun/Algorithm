package com.algorithm.CodingTraining.수열과구간쿼리2;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        // 각 쿼리 처리
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];  // 시작 인덱스
            int end = queries[i][1];    // 끝 인덱스
            int k = queries[i][2];      // 기준값

            int minValue = Integer.MAX_VALUE;  // k보다 큰 값들 중 최소값

            // 주어진 범위에서 k보다 큰 가장 작은 값 찾기
            for (int j = start; j <= end; j++) {
                if (arr[j] > k && arr[j] < minValue) {
                    minValue = arr[j];
                }
            }

            // 값이 없으면 -1, 있으면 찾은 값 저장
            answer[i] = (minValue == Integer.MAX_VALUE) ? -1 : minValue;
        }

        return answer;
    }

    /*
    쿼리 개수만큼의 크기를 가진 결과 배열을 생성합니다.
    각 쿼리에 대해:
    start(s), end(e), k값을 추출
    해당 범위(s부터 e까지)를 순회
    k보다 크면서 가장 작은 값을 찾음
    값을 찾지 못한 경우 -1 저장

    값을 찾는 과정:
    Integer.MAX_VALUE를 초기값으로 사용
    범위 내에서 k보다 큰 값을 발견할 때마다 최소값 갱신
    최종적으로 MAX_VALUE가 그대로면 -1 저장
    */
}
