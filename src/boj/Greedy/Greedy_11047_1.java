package boj.Greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Greedy_11047_1 {

    public static void main(String[] args) {
        int coinCount = 0;
        List<Integer> coinValueList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int coinKinds = in.nextInt();
        int coinSumResult = in.nextInt();

        for (int i = 0; i < coinKinds; i++) {
            int coinValue = in.nextInt();
            coinValueList.add(coinValue);
        }

        while (coinSumResult != 0) {

            int maxCoinValue = coinValueList.get((coinValueList.size()-1));

            if (maxCoinValue <= coinSumResult) {
                int addCoinCount = coinSumResult / maxCoinValue;
                coinCount = coinCount + addCoinCount;

                coinSumResult = coinSumResult - (maxCoinValue * addCoinCount);
                coinValueList.remove(coinValueList.size()-1);

            } else {
                coinValueList.remove(coinValueList.size()-1);
            }

            if(coinSumResult == 0){
                System.out.println(coinCount);
            }

        }


    }
}