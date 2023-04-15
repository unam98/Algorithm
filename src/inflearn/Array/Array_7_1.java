package inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_7_1 {

    public boolean isCorrect(int inputValue) {
        if (inputValue == 1) {
            return true;
        } else if (inputValue == 0) {
            return false;
        }
        return false; //1도 아니고 0도 아니면 false
    }


    public int solution(ArrayList<Integer> scoreList) {
        int scoreSum = 0;
        int continuousScore = 1;

        ArrayList<Integer> checkList = new ArrayList<>();

        for (int i = 0; i < scoreList.size(); i++) {
            System.out.println("몇번째 검사하고 있나요? " + i + "번째");
            if (isCorrect(scoreList.get(i))) {
                if (i < scoreList.size() - 1) {
                    for (int j = 1 + i; ; j++) {
                        if (isCorrect(scoreList.get(j))) {
                            System.out.println("가산점이 반영된 배점은 몇점인가요? " + continuousScore);
                            checkList.add(continuousScore);
                            continuousScore += 1;
                            break;
                        } else if (!isCorrect(scoreList.get(j))) {
                            checkList.add(continuousScore);
                            continuousScore = 1;
                            break;
                        }
                    }
                    System.out.println("정답입니다! 현재까지의 scoreSum 값은? " + checkList);
                } else if (i == scoreList.size() - 1) {
                    checkList.add(continuousScore);
                    continuousScore = 1;
                    System.out.println("정답입니다! 현재까지의 scoreSum 값은? " + checkList);
                } else {
                    continuousScore = 1;
                    checkList.add(0);
                    System.out.println("틀렸습니다! 현재까지의 scoreSum 값은? " + checkList);
                }
            }
        }
        for (
                int i = 0; i < checkList.size(); i++) {
            scoreSum += checkList.get(i);
        }
        return scoreSum;
    }


    public static void main(String[] args) {
        Array_7_1 problem = new Array_7_1();

        Scanner in = new Scanner(System.in);

        int N_length = in.nextInt();

        ArrayList<Integer> scoreList = new ArrayList<>();

        for (int i = 0; i < N_length; i++) {
            int data = in.nextInt();
            scoreList.add(data);
        }

        int answer = problem.solution(scoreList);

        System.out.println(answer);
    }
}

/*
생각해보니 리스트에 한 번에 하나만 추가돼야 하는데 여러개가 추가되는 게 문제였음. 그래서 하나 추가하고 바로 break로 빠져나오게 함.
사실 list로 관리할 필요도 없이 break만 바로 써줄 생각 했으면 리스트에 있는 값을 for문 돌려서 sum하는 과정이 없어도 됐어서 코드는 더 짧아졌을 듯.

for문 if문이 여러개가 중첩돼있어서 가독성이 너무 떨어지는 것 같음. 일단 구현 해놓고보자는 생각이었는데 앞으로는 어떻게 해나가는 게 좋을까? 고민을 해봐야 할 듯.
 */