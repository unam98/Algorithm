package inflearn.String;

import java.util.*;

public class String_3_1 {

    public String solution(String inputString) {
        String maxLengthString;

        String[] splitedList = inputString.split("\\s+");

        if (splitedList[0].length() > splitedList[1].length()) {
            maxLengthString = splitedList[0];
        } else {
            maxLengthString = splitedList[1];
        }

        for (int i = 2; i < splitedList.length; i++) {
            if (splitedList[i].length() > maxLengthString.length()) {
                maxLengthString = splitedList[i];
            }
        }

        return maxLengthString;

    }

    public static void main(String[] args) {
        String_3_1 problem = new String_3_1();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        String answer = problem.solution(inputString);


        System.out.println(answer);
    }
}

/*
채점 사이트에서 RunTimeError 뜸
 */