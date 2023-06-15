package programmers;

class Solution_4 {
    public int solution(int n, int m, int[] section) {
        int roller = section[0];
        int answer = 1;

        for(int i =0;i<section.length;i++){
            if(roller + m-1 < section[i]){
                answer++;
                roller=section[i];
            }
        }
        return answer;
    }
}





/*
덧칠하기 문제
 */