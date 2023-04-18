package inflearn.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class String_5_1 {
    public String solution(String inputString) {
        ArrayList<Character> originList = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            originList.add(inputString.charAt(i));
        }
        ArrayList<Character> reverseList = new ArrayList<>(originList);
        Collections.reverse(reverseList);

        System.out.println(originList);
        System.out.println(reverseList);

        HashMap<Integer, Character> valueMap = new HashMap<>();


        for (Character element : reverseList) {
            if (Character.isAlphabetic(element)) {
                valueMap.put(reverseList.indexOf(element), element);
            }
        }

        System.out.println(valueMap);

        for (int i = 0; i < originList.size(); i++) {
            if (Character.isAlphabetic(originList.get(i))) {
                originList.set(i, valueMap.get(i));
            }
        }

        System.out.println(originList);

        String answerString = "";

        for (Character element : originList) {
            answerString += element;
        }
        return answerString;
    }

    public static void main(String[] args) {
        String_5_1 problem = new String_5_1();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        String answer = problem.solution(inputString);


        System.out.println(answer);
    }
}

/*
    <나의 풀이 logic>
    문자열의 길이는 똑같을 테니 배열을 뒤집은 다음 알파벳들의 index를 기준으로 문자 값을 hashMap에 저장해뒀다가
    원본 list에서 for문 돌리다가 조금 전에 만들었던 hashMap에 key값으로 저장된 index면 거기에 대응되는 문자 값을 꺼내와서
    교체하는 식으로 logic을 짰음.

    문제에서 처음 예시로 보여준 건 맞췄는데 다른 입력값들에 대해선 틀렸음.
    봐보니까 내 logic은 좌우가 정확히 대칭일 때만 의도대로 작동함.
    여기서 대칭이라는 것은, 값이 아닌 '알파벳 여부'를 말하는 것.

    이러면 어쩔 수 없이 매번 알파벳 여부를 확인하면서 양쪽에서 좁혀오는 수밖에 없겠는데
 */