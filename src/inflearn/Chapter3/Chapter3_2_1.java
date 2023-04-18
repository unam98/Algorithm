package inflearn.Chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chapter3_2_1 {
    public String solution(ArrayList<Integer> listA, ArrayList<Integer> listB) {

        ArrayList<Integer> listC = new ArrayList<>();

        String answerString = "";

        for (Integer element : listA) {
            if (listB.contains(element)) {
                listC.add(element);
            }
        }

        Collections.sort(listC);

        for (Integer element : listC) {
            answerString += element + " ";
        }

        return answerString;
    }


    public static void main(String[] args) {
        Chapter3_2_1 problem = new Chapter3_2_1();

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

        String answer = problem.solution(listA, listB);
        System.out.println(answer);
    }
}


/*
요구대로 출력은 해냈는데 시간 제한에 걸렸음
 */