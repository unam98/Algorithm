package programmers;

class Solution_13_1 {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            if(n % i == 0){
                answer += i;
            }
        }

        return answer;
    }
}

/*
약수의 합
 */