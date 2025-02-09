package com.algorithm.Lv1.크기가작은문자열;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long pNum = Long.parseLong(p);

        // t에서 p와 같은 길이의 모든 부분문자열을 확인
        for (int i = 0; i <= t.length() - pLength; i++) {
            String substring = t.substring(i, i + pLength);
            long subNum = Long.parseLong(substring);

            // p보다 작거나 같은 경우 카운트 증가
            if (subNum <= pNum) {
                answer++;
            }
        }

        return answer;
    }
}
