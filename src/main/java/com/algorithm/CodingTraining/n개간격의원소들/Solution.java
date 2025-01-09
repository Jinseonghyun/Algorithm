package com.algorithm.CodingTraining.n개간격의원소들;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i * n];
        }
        return answer;
    }

    // 홀수 일 때는 나머지로 나눈 수 에 1개를 더해 줘야 배열 개수 구할 수 있다.

    // 예시 1: num_list = [1, 2, 3, 4, 5, 6], n = 2
    //num_list.length는 6이고, 6 % 2 == 0이므로, 배열 크기는 6 / 2 = 3이 됩니다.
    //선택된 요소는 [1, 3, 5]입니다.

    //예시 2: num_list = [1, 2, 3, 4, 5], n = 2
    //num_list.length는 5이고, 5 % 2 != 0이므로, 배열 크기는 5 / 2 + 1 = 3이 됩니다.
    //선택된 요소는 [1, 3, 5]입니다.
}
