package inflearn.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class String_9_1 {
    public int solution(String inputString) {

        StringBuilder builder = new StringBuilder();

        char[] inputCharList = inputString.toCharArray();
        List<Character> answerList = new ArrayList<>();


        for (int i = 0; i < inputCharList.length - 1; i++) {
            boolean isNumber = Character.isDigit(inputCharList[i]);
            if (isNumber) {
                answerList.add(inputCharList[i]);
            }
        }

        for (int i = 0; i < answerList.size(); i++) {
            builder.append(answerList.get(i));
        }

        int answer = Integer.parseInt(String.valueOf(builder));

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        String_9_1 test = new String_9_1();

        int answer = test.solution(inputString);
        System.out.println(answer);

    }
}

/*

Java의 Character.isDigit() 메서드는 주어진 문자가 0 ~ 9 범위의 숫자인지 여부를 판별하는 함수입니다.
이 메서드는 char 타입의 매개변수를 받아서, 해당 문자가 숫자인지 여부를 true 또는 false 값으로 반환합니다.
숫자인 경우 true를 반환하고, 숫자가 아닌 경우 false를 반환합니다.

특수문자를 걸러내기 위해서 정규식 쓸 생각을 했는데 훨씬 간단한 함수가 있었음. 저걸 알고 모르고에 따라 풀이 난이도가 엄청 달라짐.

1) answerList[0]으로 하니까 빨간 밑줄 떠서 answerList.get(0)로 바꿔주었음.
2) get 메서드가 반환하는 것은 char 타입임. 따라서 answerList.get(0) == 0 가 아닌 answerList.get(0) == '0' 으로 해주어야 함
3) 맨 앞에 0 붙는 걸 어떻게 제거할 수 있을까 고민이었는데 int로 형변환 해주면 간단히 해결되는 거였음.
 */

