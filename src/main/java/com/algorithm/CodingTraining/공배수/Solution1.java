package com.algorithm.CodingTraining.공배수;

class Solution1 {
    public int solution(int number, int n, int m) {

        if (number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}