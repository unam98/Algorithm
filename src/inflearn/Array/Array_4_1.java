package inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;
public class Array_4_1 {
    public String solution(Integer inputCount){

        String answerString = "";
        ArrayList<Integer> answerList = new ArrayList<>();

        answerList.add(1);
        answerList.add(1);

        for(int i = 0 ; i < inputCount-2 ; i++){
            int newData = answerList.get(i) + answerList.get(i+1);
            answerList.add(newData);
        }

        for(int i = 0 ; i < answerList.size() ; i++){
            answerString += answerList.get(i) + " ";
        }


        return answerString;
    }

    public static void main(String[] args) {
        Array_4_1 problem = new Array_4_1();

        Scanner in = new Scanner(System.in);

        int inputCount = in.nextInt();

        String answer = problem.solution(inputCount);

        System.out.println(answer);
    }
}