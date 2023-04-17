package inflearn.String;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class String_3_2 {
    public String solution(String inputString) {
        String[] splitString = inputString.split(" ");
        List<String> splitList = Arrays.asList(splitString);
        System.out.println("splitList 값? " + splitList);

        String MaxString = "";
        int MaxLength = 0;

        for (int i = 0; i < splitList.size(); i++) {
            if (splitList.get(i).length() > MaxLength) {
                MaxLength = splitList.get(i).length();
                MaxString = splitList.get(i);
            }
        }

        return MaxString;
    }

    public static void main(String[] args) {
        String_3_2 problem = new String_3_2();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        String answer = problem.solution(inputString);


        System.out.println(answer);
    }
}

/*
공백을 기준으로 문자열을 -> 리스트로 바꾼다음 for문 돌리면서 각 element의 length를 i+i랑 비교해서 길이가 더 길면 MaxString 값 갱신
이 MaxString을 return

i+1이랑 비교하도록 logic을 짜면 맨마지막이 됐을 때 index 초과 에러가 떠서. 그냥 MaxLength를 관리할 변수 하나를 만들고
그 값이랑 비교해서 갱신하도록 해주었음.

핵심은 아래와 같이 String을 특정 기준으로 쪼개고 이를 List로 변환하는 작업이었음.

String[] splitString = inputString.split(" ");
List<String> splitList = Arrays.asList(splitString);

 */