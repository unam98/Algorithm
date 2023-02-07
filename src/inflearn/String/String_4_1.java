package inflearn.String;

import java.util.Scanner;

public class String_4_1 {
    static Scanner scanner = new Scanner(System.in);

    public String reverseStr(String inputStr) {

        StringBuilder stringBuilder = new StringBuilder(inputStr);
        String reverseStr = stringBuilder.reverse().toString();

        return reverseStr;
    }

    public void solution(int repeatCount) {

        for (int i = 0; i < repeatCount; i++) {
            String wantReverseStr = scanner.next();
            String reverseResult = reverseStr(wantReverseStr);

            System.out.println(reverseResult);
        }
    }


    public static void main(String[] args) {
        String_4_1 problem = new String_4_1();
        int repeatCount = scanner.nextInt();
        problem.solution(repeatCount);
    }
}

/*
Scanner 객체를 하나만 만들고 재활용하려고 했는데 solution 함수에 input parameter로 아무것도 안 넣어주니까
어떤 동작을 하는 함수인지 파악이 어려운 것 같아서 조금이라도 개선해주고자 scanner.nextInt()를 solution() 내부가 아닌
main() 내부에 적어주고 solution 함수에 parameter로 전달하게 수정하였음. 그리고 Scanner 객체엔 static을 붙여주었는데 속도가 더 느려졌음.
 */