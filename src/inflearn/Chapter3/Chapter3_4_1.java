package inflearn.Chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter3_4_1 {
    public Integer solution(ArrayList<Integer> inputList, Integer M) {

        Integer sumValue = 0;
        Integer answerCount = 0;
        boolean isKeepCalc = true;

        for (int i = 0; i < inputList.size(); i++) {
            for (int j = i; j < inputList.size(); j++) {
                sumValue += inputList.get(j);
                if (sumValue.equals(M)) {
                    sumValue = 0;
                    answerCount++;
                    break;
                } else if (sumValue > M) {
                    sumValue = 0;
                    break;
                } else if ((sumValue < M) && (j == inputList.size() - 1)) {
                    isKeepCalc = false;
                    break;
                }
            }
            if (!isKeepCalc) {
                break;
            }
        }


        return answerCount;
    }


    public static void main(String[] args) {
        Chapter3_4_1 problem = new Chapter3_4_1();

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        ArrayList<Integer> inputList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int inputData = in.nextInt();
            inputList.add(inputData);
        }


        Integer answer = problem.solution(inputList, M);
        System.out.println(answer);
    }
}


/*
문제는 달라도 과정이 비슷한 것들이 있는데 그 경우들에 대해서 매번 똑같은 접근을 하고 있음.
가령 한 루프마다 특정 갯수만큼 list 원소들을 더하는 것.
이 경우에 나는 일단 2중 for문을 써서 쭉 돌려놓고 안에 포함돼있는 for문에 조건문을 걸고 break를 활용하여 구현해왔음.
이번 문제도 마찬가지인데 더 좋은 방법이 있을까?

답은 맞췄는데 시간 제한에 걸림.
 */