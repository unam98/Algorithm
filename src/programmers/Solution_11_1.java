package programmers;

class Solution_11_1 {
    public int solution(int n) {
        int answer = Integer.MAX_VALUE;

        for(int i=1; i<n; i++){
            if(n % i == 1){
                if(i < answer){
                    answer = i;
                }
            }
        }
        return answer;
    }
}

/*
나머지가 1이 되는 수 찾기
 */