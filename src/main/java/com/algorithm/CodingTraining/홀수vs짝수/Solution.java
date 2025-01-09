package com.algorithm.CodingTraining.홀수vs짝수;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        int temp = 0;
        int temp1 = 0;
        for (int i=0; i<num_list.length; i++){
            if (i%2==0){
                temp += num_list[i];
            } else {
                temp1 += num_list[i];
            }
        }
        answer = temp > temp1 ? temp : temp1;
        return answer;
    }
}
