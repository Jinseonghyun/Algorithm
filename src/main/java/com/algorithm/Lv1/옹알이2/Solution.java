package com.algorithm.Lv1.옹알이2;

class Solution {
    public int solution(String[] babbling) {
        String[] possibleWords = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        // 각 단어 확인
        for (String word : babbling) {
            // 연속된 같은 발음이 있는지 확인
            if (hasConsecutiveSounds(word)) {
                continue;
            }

            // 발음 가능한 단어로 치환
            String temp = word;
            for (int i = 0; i < possibleWords.length; i++) {
                // 각 발음을 숫자로 치환 (다시 같은 발음이 나오는 것을 방지하기 위해)
                temp = temp.replace(possibleWords[i], String.valueOf(i));
            }

            // 모든 문자가 숫자로 치환되었는지 확인
            boolean isValid = true;
            for (char c : temp.toCharArray()) {
                if (!Character.isDigit(c)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                answer++;
            }
        }

        return answer;
    }

    // 연속된 같은 발음이 있는지 확인하는 메서드
    private boolean hasConsecutiveSounds(String word) {
        return word.contains("ayaaya") ||
                word.contains("yeye") ||
                word.contains("woowoo") ||
                word.contains("mama");
    }
}
