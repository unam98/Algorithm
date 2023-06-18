package programmers;

import java.util.*;

public class Solution_9_1 {
    public int solution(int n) {
        int answer = 0;

        for(char number : String.valueOf(n).toCharArray()){
            answer += Character.getNumericValue(number);
        }

        return answer;
    }
}

/*
자릿수 더하기
 */