package com.algorithm.Lv1.기사단원의무기;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        // 1부터 number까지 각 기사별로 계산
        for (int i = 1; i <= number; i++) {
            int divisorCount = countDivisors(i);

            // 제한수치를 초과하면 power로 대체
            if (divisorCount > limit) {
                answer += power;
            } else {
                answer += divisorCount;
            }
        }

        return answer;
    }

    // 약수의 개수를 효율적으로 계산하는 메서드
    private int countDivisors(int num) {
        int count = 0;
        // 제곱근까지만 검사하여 시간복잡도 개선
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                // i가 약수인 경우
                count++;

                // i가 제곱근이 아닌 경우, 대칭되는 약수도 존재
                if (i * i != num) {
                    count++;
                }
            }
        }
        return count;
    }
}
