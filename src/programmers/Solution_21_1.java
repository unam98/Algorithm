package programmers;

class Solution_21_1 {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0){ //짝수
            answer += s.charAt(s.length()/2-1);
            answer += s.charAt(s.length()/2);
        }
        else { //홀수
            answer += s.charAt(s.length()/2);
        }

        return answer;
    }
}

/*
가운데 글자 가져오기
 */