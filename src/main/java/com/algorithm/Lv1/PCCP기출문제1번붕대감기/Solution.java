package com.algorithm.Lv1.PCCP기출문제1번붕대감기;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0];  // 시전 시간
        int x = bandage[1];  // 초당 회복량
        int y = bandage[2];  // 추가 회복량
        int maxHealth = health;  // 최대 체력
        int currentHealth = health;  // 현재 체력
        int continuousTime = 0;  // 연속 성공 시간
        int lastAttackTime = attacks[attacks.length - 1][0];  // 마지막 공격 시간

        // 공격 시간을 key로 하는 HashMap 생성
        Map<Integer, Integer> attackMap = new HashMap<>();
        for (int[] attack : attacks) {
            attackMap.put(attack[0], attack[1]);
        }

        // 0초부터 마지막 공격 시간까지 진행
        for (int time = 0; time <= lastAttackTime; time++) {
            // 공격이 있는 시간인 경우
            if (attackMap.containsKey(time)) {
                currentHealth -= attackMap.get(time);
                continuousTime = 0;  // 연속 성공 시간 초기화

                // 체력이 0 이하가 되면 캐릭터 사망
                if (currentHealth <= 0) {
                    return -1;
                }
            }
            // 공격이 없는 시간인 경우
            else {
                // 현재 체력이 최대 체력보다 작은 경우에만 회복
                if (currentHealth < maxHealth) {
                    currentHealth += x;  // 초당 회복량만큼 회복
                    continuousTime++;  // 연속 성공 시간 증가

                    // 연속 성공 시간이 t초에 도달하면
                    if (continuousTime == t) {
                        currentHealth += y;  // 추가 회복량 적용
                        continuousTime = 0;  // 연속 성공 시간 초기화
                    }

                    // 최대 체력을 초과하지 않도록 보정
                    if (currentHealth > maxHealth) {
                        currentHealth = maxHealth;
                    }
                }
            }
        }

        return currentHealth;
    }

    /*
    * 초기화
    붕대 감기 관련 변수(시전 시간, 초당 회복량, 추가 회복량)
    체력 관련 변수(최대 체력, 현재 체력)
    연속 성공 시간 추적 변수
    마지막 공격 시간

    공격 시간 매핑 : 빠른 조회를 위해 공격 시간을 키로 하는 HashMap 생성

    시간별 처리 각 시간마다:
    공격이 있는 경우: 데미지 적용, 연속 시간 초기화
    공격이 없는 경우: 회복 처리, 연속 시간 증가

    체력 관리
    최대 체력 초과 방지
    0 이하 체력 확인(사망 처리)

    연속 성공 보너스
    t초 연속 성공 시 추가 회복량 적용, 보너스 적용 후 연속 시간 초기화
    이 구현은 모든 테스트 케이스를 통과하며 특히:체력이 0 이하가 되는 경우 (-1 반환), 최대 체력을 초과하지 않도록 하는 처리
    */
}
