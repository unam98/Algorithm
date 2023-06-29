package programmers;

class Solution_19_1 {
    public String solution(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
}

/*
핸드폰 번호 가리기
 */