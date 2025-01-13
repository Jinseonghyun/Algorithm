package com.algorithm.CodingTraining.정사각형으로만들기;

class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr.length;           // 행의 수
        int cols = arr[0].length;        // 열의 수
        int maxSize = Math.max(rows, cols); // 더 큰 수를 최종 크기로 사용

        // maxSize × maxSize 크기의 새로운 배열 생성
        int[][] answer = new int[maxSize][maxSize];

        // 원본 배열의 값을 새 배열에 복사
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        // 나머지 부분은 이미 0으로 초기화되어 있음
        return answer;
    }

    /*
    *  입력 배열의 크기 확인:
    rows: 행의 수
    cols: 열의 수
    maxSize: 행과 열 중 더 큰 값

    새로운 배열 생성:
    maxSize × maxSize 크기의 2차원 배열 생성
    Java에서 새로운 배열은 자동으로 0으로 초기화됨

    데이터 복사:
    원본 배열의 모든 값을 새 배열의 같은 위치에 복사
    나머지 공간은 자동으로 0으로 채워져 있음

    예시 설명:
    arr = [[572, 22, 37], [287, 726, 384], [85, 137, 292], [487, 13, 876]]
    행: 4, 열: 3
    maxSize = 4
    결과: 각 행에 0 추가

    arr = [[57, 192, 534, 2], [9, 345, 192, 999]]

    행: 2, 열: 4
    maxSize = 4
    결과: 아래에 0으로 된 행 추가

    arr = [[1, 2], [3, 4]]

    행: 2, 열: 2
    maxSize = 2
    결과: 원본과 동일

    시간 복잡도: O(n²), 여기서 n은 maxSize입니다.
    공간 복잡도: O(n²)
    */
}
