package com.algorithm.CodingTraining.커피심부름;

class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String o : order) {
            if(o.contains("cafelatte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }
}
