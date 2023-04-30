package inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_9_1 {

    public Integer crossSumRightDown(ArrayList<ArrayList<Integer>> gatherList) {
        Integer crossSum = 0;

        for (int i = 0; i < gatherList.size(); i++) {
            crossSum += gatherList.get(i).get(i);
        }

        return crossSum;
    }

    public Integer crossSumLeftDown(ArrayList<ArrayList<Integer>> gatherList) {
        Integer crossSum = 0;
        Integer j = gatherList.size() - 1;

        for (int i = 0; i < gatherList.size(); i++) {
            crossSum += gatherList.get(i).get(j);
            j--;
        }
        return crossSum;
    }

    public Integer rowSum(ArrayList<ArrayList<Integer>> gatherList) {

        Integer maxRowSum = 0;
        ArrayList<Integer> rowSumResultList = new ArrayList<>();

        for (int i = 0; i < gatherList.size(); i++) {
            int sumList = gatherList.get(i).stream().mapToInt(Integer::intValue).sum();
            rowSumResultList.add(sumList);
        }

        for (Integer element : rowSumResultList) {
            if (element > maxRowSum) {
                maxRowSum = element;
            }
        }

        return maxRowSum;
    }

    public Integer columnSum(ArrayList<ArrayList<Integer>> gatherList) {

        Integer maxColumnSum = 0;

        ArrayList<Integer> columnSumResultList = new ArrayList<>();

        for (int i = 0; i < gatherList.size(); i++) {
            int index0 = gatherList.get(i).get(0);
            columnSumResultList.add(index0);
        }

        for (Integer element : columnSumResultList) {
            if (element > maxColumnSum) {
                maxColumnSum = element;
            }
        }

        return maxColumnSum;
    }

    public Integer judgeMaxValue(ArrayList<ArrayList<Integer>> list) {
        Array_9_1 problem = new Array_9_1();

        Integer maxAnswer = 0;

        Integer answer1 = problem.rowSum(list);
        Integer answer2 = problem.columnSum(list);
        Integer answer3 = problem.crossSumLeftDown(list);
        Integer answer4 = problem.crossSumRightDown(list);

        ArrayList<Integer> answerSumResultList = new ArrayList<>();
        answerSumResultList.add(answer1);
        answerSumResultList.add(answer2);
        answerSumResultList.add(answer3);
        answerSumResultList.add(answer4);


        for (Integer element : answerSumResultList) {
            if (element > maxAnswer) {
                maxAnswer = element;
            }
        }
        return maxAnswer;
    }


    public static void main(String[] args) {
        Array_9_1 problem = new Array_9_1();

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            ArrayList<Integer> subList = new ArrayList<>(N);
            for (int j = 0; j < N; j++) {
                int num = in.nextInt();
                subList.add(num);
            }
            list.add(subList);
        }

        Integer answer = problem.judgeMaxValue(list);
        System.out.println(answer);
    }
}


/*
채점 사이트에서 5개 중 4개는 맞는데 하나가 오답으로 처리됐음.
왜 틀렸는지 모르겠는데 그걸 떠나서 문제 풀이 영상을 봤는데 내가 짠 코드보다 훨씬 더 효율적인 방법이 있었음.

1)
나는 그동안 최소값 구할 때 for문 돌리고 if문으로 대소 비교해가면서 갱신하는 식으로 코드를 짰는데
Math.max(answer, sum1) 이렇게 이미 있는 메서드를 활용하면 훨씬 간단하게 끝나는 작업이었음.

2)
그리고 큰 틀에서 접근하는 방법은 같았지만 나는 1차원 배열을 여러개 두고 계산하는 풀이였고
풀이 영상에서는 2차원 배열을 사용해주었음. 이게 유형이 있는 것 같아서 익혀두어야 할 듯.

3)
나는 대각선 합 구할 때 j라는 변수를 하나 만들어서 j--하는 방향으로 코드를 짰는데
하나의 for문에서 n-i-1 이런식으로 해주니까 굳이 변수 하나 더 안 만들어도 돼서 깔끔했음.

 */