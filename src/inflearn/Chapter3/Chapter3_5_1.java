package inflearn.Chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter3_5_1 {
    public Integer solution(Integer N) {

        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 1; i < 500; i++) {
            numberList.add(i);
        }


        Integer sumValue = 0;
        Integer answerCount = 0;
        Integer JCount = 0;
        boolean isKeepCalc = true;


        for (int i = 0; i < numberList.size(); i++) {
            for (int j = i; j < numberList.size(); j++) {
                sumValue += numberList.get(j);
                JCount++;
                if (sumValue.equals(N)) {
                    if (JCount > 2) {
                        answerCount++;
                        sumValue = 0;
                        JCount = 0;
                    } else if (JCount.equals(2)) {
                        answerCount++;
                        sumValue = 0;
                        JCount = 0;
                        isKeepCalc = false;
                        break;
                    }
                    break;

                } else if (sumValue > N) {
                    sumValue = 0;
                    JCount = 0;
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
        Chapter3_5_1 problem = new Chapter3_5_1();

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();


        Integer answer = problem.solution(N);
        System.out.println(answer);
    }
}


/*
특별히 문제될만한 게 없어보이는데 몇몇 input에 대해서 return 값이 0이 뜨길래 봤더니
가독성을 위해 sumValue == N 이렇게 해줬던 부분이 문제였음. 이걸 equals로 바꾸니까 해결됨.

이전에 다른 문제 풀이 코드들에 대해서 채점 후 equals를 ==로 바꿔주었는데 나중에 코드 돌려보다 문제가 생기면
이 부분 먼저 확인해주면 될 듯
 */