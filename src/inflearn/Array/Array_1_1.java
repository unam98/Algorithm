package inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_1_1 {
    public String solution(ArrayList<Integer> inputList){
        String answer = inputList.get(0).toString();
        for(int i =0 ; i<inputList.size()-1 ; i++){
            if(inputList.get(i+1) > inputList.get(i) ){
                answer += " " + inputList.get(i+1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array_1_1 problem = new Array_1_1();

        Scanner in = new Scanner(System.in);

        int inputCount = in.nextInt();

        ArrayList<Integer> inputList = new ArrayList();
        for(int i = 0 ; i < inputCount ; i++){
            int inputInt = in.nextInt();
            inputList.add(inputInt);
        }
        String answer = problem.solution(inputList);

        System.out.println(answer);
    }
}