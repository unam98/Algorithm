package inflearn.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_6_1 {
    public boolean isAnswer(Integer checkNum) {
        if (checkNum < 2) return false;

        if (checkNum == 2) return true;
        for (int i = 2; i < checkNum; i++) {

            if (checkNum % i == 0) {
                return false;
            }
        }
        return true;
    }


    public String solution(ArrayList<Integer> testList) {

        String answerString = "";

        for (int i = 0; i < testList.size(); i++) {
            if (isAnswer(testList.get(i))) {
                answerString += testList.get(i) + " ";
            }
        }


        return answerString;
    }

    public static void main(String[] args) {
        Array_6_1 problem = new Array_6_1();

        Scanner in = new Scanner(System.in);

        int N_length = in.nextInt();

        ArrayList<Integer> reverseList = new ArrayList<>();

        for (int i = 0; i < N_length; i++) {
            int data = in.nextInt();
            String numStr = String.valueOf(data); // 정수를 문자열로 변환
            String reversedStr = new StringBuilder(numStr).reverse().toString(); // 문자열을 뒤집음
            int result = Integer.parseInt(reversedStr); // 문자열을 정수로 변환
            reverseList.add(result);
        }

        String answer = problem.solution(reverseList);

        System.out.println(answer);
    }
}


/*
소수 : 소수는 1과 자기자신을 제외한 나머지 숫자들에 나눠떨어지지 않는 1 이상의 숫자다.
toString() -> String.valueOf()
toInt() -> Integer.parseInt()
List 뒤집기 -> Collections.reverse()
문자열 뒤집기 -> StringBuilder().reverse()
 */