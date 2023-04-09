package inflearn.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String_11_1 {

    public StringBuilder solution(String inputString) {
        char[] inputCharList = inputString.toCharArray();

        int count = 1;
        StringBuilder builder = new StringBuilder();

        List<Character> answerList = new ArrayList<>();

        for (int i = 0; i < inputString.length() - 1; i++) {
            if (inputCharList[i] == inputCharList[i + 1]) {
                count++;
                if (i == inputString.length() - 2) {
                    answerList.add(inputCharList[i + 1]);
                    if (count > 1) {
                        answerList.add(Character.forDigit(count, 10));
                    }
                }
            } else {
                answerList.add(inputCharList[i]);
                if (count > 1) {
                    answerList.add(Character.forDigit(count, 10));
                }
                if (i == inputString.length() - 2) {
                    answerList.add(inputCharList[i + 1]);
                }
                count = 1;
            }
        }

        for (int i = 0; i < answerList.size(); i++) {
            builder.append(answerList.get(i));
        }
        return builder;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        String_11_1 test = new String_11_1();

        StringBuilder answer = test.solution(inputString);
        System.out.println(answer);

    }
}

/*

point는 for문을 맨마지막 인덱스 하나 전까지만 돌리는 건데 기준을 length로 했다보니 이거 숫자 계산이 조금 헷갈렸음.
답을 맞추긴 했는데 중복 코드가 너무 많음.

1) StringBuilder?, 그냥 List를 toString()하면 자동으로 문자열로 변환되는 게 안 되는 건가?
2) get을 굳이 써야 하는 건가? 그냥 answerList[i] 이런식으로 하면 되는 거 아닌가?
3) 형변환이 좀 낯설다. 파이썬, 코틀린이랑 많이 다른 듯 하다.
4) char과 Character의 차이? 아무것도 없는 상태에서 List를 만들려면 new 키워드를 써서 꼭 객체를 만들어줘야 하는 건가?

 */

