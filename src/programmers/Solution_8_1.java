package programmers;

class Solution_8_1 {
    public int solution(int[] number) {
        int answer = 0;

        for(int i=0; i<number.length-2; i++){
            for(int j=i+1; j<number.length-1; j++){
                for(int k=j+1; k<number.length; k++){
                   if(number[i]+number[j]+number[k] == 0){
                       answer++;
                   }
                    
                }
            }
        }
        return answer;
    }
}

/*
삼총사
---
3중 for문
---
i=0,j=1,k=2 이렇게 했는데 이게 실수였음.
이러면 j=2,k=2 이런 경우도 발생할 수 있기 때문.

 */