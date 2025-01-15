package com.algorithm.Lv1.PCCE기출문제9번지폐접기;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        // 지갑과 지폐의 크기를 정렬 (작은 값, 큰 값 순서로)
        int[] sortedWallet = new int[]{Math.min(wallet[0], wallet[1]), Math.max(wallet[0], wallet[1])};
        int[] sortedBill = new int[]{Math.min(bill[0], bill[1]), Math.max(bill[0], bill[1])};

        // 지폐가 지갑에 들어갈 수 있을 때까지 반복
        while (!canFitInWallet(sortedWallet, sortedBill)) {
            // 긴 쪽을 접기
            if (sortedBill[1] > sortedBill[0]) {
                sortedBill[1] = sortedBill[1] / 2;
            } else {
                sortedBill[0] = sortedBill[0] / 2;
            }

            // 접은 후 다시 정렬 (작은 값, 큰 값 순서로)
            int temp = sortedBill[0];
            sortedBill[0] = Math.min(sortedBill[0], sortedBill[1]);
            sortedBill[1] = Math.max(temp, sortedBill[1]);

            answer++;
        }

        return answer;
    }

    // 지폐가 지갑에 들어갈 수 있는지 확인 (90도 회전 고려)
    private boolean canFitInWallet(int[] wallet, int[] bill) {
        // 그대로 넣을 수 있는 경우
        if (bill[0] <= wallet[0] && bill[1] <= wallet[1]) {
            return true;
        }
        // 90도 회전해서 넣을 수 있는 경우
        if (bill[0] <= wallet[1] && bill[1] <= wallet[0]) {
            return true;
        }
        return false;
    }

    // 입력 배열 정렬:
    // 지갑과 지폐의 크기를 작은 값, 큰 값 순서로 정렬하여 처리를 단순화

    // 접기 로직:
    // 항상 긴 쪽을 접도록 구현
    // 접을 때마다 정수 나눗셈으로 소수점 이하 버림
    // 접은 후 다시 정렬하여 일관된 비교 가능

    // 종료 조건 체크:
    // 지폐를 그대로 넣을 수 있는 경우
    // 90도 회전해서 넣을 수 있는 경우
    // 두 경우 모두 고려하여 체크
}
