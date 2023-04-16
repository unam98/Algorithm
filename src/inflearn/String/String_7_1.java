package inflearn.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class String_7_1 {
    public String solution(String inputString) {
        inputString = inputString.toUpperCase();

        ArrayList<Character> inputCharList = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            inputCharList.add(inputString.charAt(i));
        }

        ArrayList<Character> reverseList = new ArrayList<>(inputCharList);
        Collections.reverse(reverseList);

        System.out.println("inputCharList 값? " + inputCharList);
        System.out.println("reverseList 값? " + reverseList);

        if (inputCharList.equals(reverseList)) {
            return "YES";
        } else return "NO";
    }

    public static void main(String[] args) {
        String_7_1 problem = new String_7_1();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        String answer = problem.solution(inputString);


        System.out.println(answer);
    }
}

/*
같은지 확인할 때 ==를 쓰는 방법이 있고 equals()를 쓰는 방법이 있는데 두개가 다른 개념이므로 주의해야 함.
==는 주소값을 보고 equals()는 표면적으로 value가 같은지만 봄.

reverse할 때 다른 문제에서는 sortedListA.sort(Collections.reverseOrder()); 이렇게 했었는데
이건 숫자처럼 크고 작음의 개념이 있는 경우에 적절히 쓰이는 것 같고
이 문제처럼 단순히 순서만 바꾸는 건 Collections.reverse(); 이렇게 함.

+  Collections.reverseOrder() 메서드는 Comparator 객체를 생성하여 역순으로 정렬할 때 사용하고,
Collections.reverse() 메서드는 리스트의 요소를 뒤집을 때 사용합니다.
 */