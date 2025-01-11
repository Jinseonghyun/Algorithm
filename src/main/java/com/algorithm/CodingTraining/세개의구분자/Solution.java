package com.algorithm.CodingTraining.세개의구분자;

import java.util.Arrays;
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a|b|c]+", ",");
        myStr = myStr.charAt(0) == ',' ? myStr.substring(1) : myStr;
        myStr = myStr.equals("") ? "EMPTY" : myStr;

        return myStr.split("[,]");
    }
}
