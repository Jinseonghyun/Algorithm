package com.algorithm.CodingTraining.간단한식계산하기;

class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        String c = arr[1];
        if(c.equals("+"))
            return a+ b;
        if(c.equals("-"))
            return a-b;
        if(c.equals("*"))
            return a*b;
        return a/b;
    }
}
