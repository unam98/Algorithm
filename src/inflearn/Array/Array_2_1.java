package inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;
public class Array_2_1 {
    public int solution(ArrayList<Integer> inputList){
        int numOfvisibleStudent = 1;
        int maxHeight = inputList.get(0);
        for(int i =0 ; i<inputList.size()-1 ; i++){
            if(inputList.get(i+1) > maxHeight ){
                maxHeight = inputList.get(i+1);
                System.out.println(maxHeight);
                numOfvisibleStudent++;
            }
        }

        return numOfvisibleStudent;
    }

    public static void main(String[] args) {
        Array_2_1 problem = new Array_2_1();

        Scanner in = new Scanner(System.in);

        int inputCount = in.nextInt();

        ArrayList<Integer> inputList = new ArrayList();
        for(int i = 0 ; i < inputCount ; i++){
            int inputInt = in.nextInt();
            inputList.add(inputInt);
        }
        int answer = problem.solution(inputList);

        System.out.println(answer);
    }
}