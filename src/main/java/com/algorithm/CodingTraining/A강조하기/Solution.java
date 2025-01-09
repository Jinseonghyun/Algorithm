package com.algorithm.CodingTraining.A강조하기;

class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        myString = myString.replace('a', 'A');

        return myString;

    }
}