package inflearn.String;

import java.util.ArrayList;
import java.util.Scanner;

public class String_6_1 {
    public StringBuilder solution(String inputString) {
        char[] inputCharList = inputString.toCharArray();
        ArrayList<Character> emptyList = new ArrayList<>();

        for (char element : inputCharList) {
            if(!emptyList.contains(element)){
                emptyList.add(element);
            }
        }

        StringBuilder answerString = new StringBuilder();

        for(char element : emptyList){
            answerString.append(element);
        }
        return answerString;

    }

    public static void main(String[] args) {
        String_6_1 problem = new String_6_1();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        StringBuilder answer = problem.solution(inputString);


        System.out.println(answer);
    }
}

/*
    <나의 풀이 logic>
    list가 2개가 필요함
    하나는 입력받은 문자열을 list로 변환한 것 -> A
    다른 하나는 empty list -> B
    A에 for문 돌리면서 B에 not-contain이면 add. 아니면 skip하고 계속 진행
    마지막에는 B에 포함된 문자 요소들을 String으로 하나로 합쳐서 출력
 */