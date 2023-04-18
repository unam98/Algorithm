package inflearn.Chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chapter3_1_1 {
    public String solution(ArrayList<Integer> listA, ArrayList<Integer> listB) {

        listA.addAll(listB);
        Collections.sort(listA);

        String answerString = "";

        for(Integer element : listA){
            answerString += element + " ";
        }

        return answerString;
    }


    public static void main(String[] args) {
        Chapter3_1_1 problem = new Chapter3_1_1();

        Scanner in = new Scanner(System.in);

        int N_length = in.nextInt();

        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        for (int i = 0; i < N_length; i++) {
            int listData = in.nextInt();
            listA.add(listData);
        }

        int M_length = in.nextInt();

        for (int i = 0; i < M_length; i++) {
            int listData = in.nextInt();
            listB.add(listData);
        }

        String answer = problem.solution(listA,listB);
        System.out.println(answer);
    }
}


/*
 */