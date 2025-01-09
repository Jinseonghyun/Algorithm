package com.algorithm.CodingTraining.문자열돌리기;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(String s : a.split("")){
            System.out.println(s);
        }
    }
}
