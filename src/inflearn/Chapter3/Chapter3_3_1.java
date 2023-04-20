package inflearn.Chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter3_3_1 {
    public Integer solution(ArrayList<Integer> salesList, Integer K) {

        Integer maxSales = 0;
        Integer salesSum = 0;

        Integer addCount = 0;


        for (int i = 0; i < salesList.size(); i++) {
//            System.out.println("지금 진행되는 i 값은? " + i);
            for (int j = i; ; j++) {
                salesSum += salesList.get(j);
//                System.out.println("salesSum 값은? " + salesSum);
                addCount++;
                if (addCount.equals(K)) {
                    if (salesSum > maxSales) {
                        maxSales = salesSum;
//                        System.out.println("maxSales 값은? " + maxSales);
                    }
                    salesSum = 0;
                    addCount = 0;
                    break;
                }
            }

            if (i == (salesList.size() - K)) {
                break;
            }
        }

        return maxSales;
    }


    public static void main(String[] args) {
        Chapter3_3_1 problem = new Chapter3_3_1();

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        ArrayList<Integer> salesList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int salesData = in.nextInt();
            salesList.add(salesData);
        }


        Integer answer = problem.solution(salesList, K);
        System.out.println(answer);
    }
}


/*
맞추긴 했는데 일부 input 값들에 대해서 시간 초과에 걸림

또, for문/if문 중첩으로 코드가 지저분해보임. 내가 짠 코드가 특정 조건에 걸려서 문제가 되고 있다면 기존의 코드를 건드리는 것보다
그냥 괄호 치고 if문/for문 바로 넣어주는 게 편하고 또 당장의 문제 해결엔 빠르긴 해서 이렇게 했는데
코드를 읽는 사람 입장에서 가독성이 너무 떨어져보임. 문제를 못푸는 것보단 지저분해도 맞추고 보는 게 낫긴 한데 아쉬움.
다른 사람들은 알고리즘 풀 때 코드가 보통 어떤식으로 작성되는지 샘플을 한 번 보면 좋을 듯
 */