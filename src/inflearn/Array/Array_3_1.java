package inflearn.Array;

import java.util.ArrayList;
import java.util.Scanner;
public class Array_3_1 {
    public ArrayList<String> solution(ArrayList<Integer> A_List, ArrayList<Integer> B_List){
        ArrayList<String> gameResult = new ArrayList<>();

        for(int i = 0 ; i < A_List.size() ; i++){
            String A_choice = A_List.get(i).toString();
            String B_choice = B_List.get(i).toString();

            //비김
            if(A_choice.equals(B_choice)){
                gameResult.add("D");
            }

            //가위-바위
            if ((A_choice.equals("1")) && (B_choice.equals("2"))) {
                gameResult.add("B");
            } else if ((A_choice.equals("2")) && (B_choice.equals("1"))) {
                gameResult.add("A");
            }

            //가위-보
            if ((A_choice.equals("1")) && (B_choice.equals("3"))) {
                gameResult.add("A");
            } else if ((A_choice.equals("3")) && (B_choice.equals("1"))) {
                gameResult.add("B");
            }

            //바위-보
            if ((A_choice.equals("2")) && (B_choice.equals("3"))) {
                gameResult.add("B");
            } else if ((A_choice.equals("3")) && (B_choice.equals("2"))) {
                gameResult.add("A");
            }
        }

        return gameResult;
    }

    public static void main(String[] args) {
        Array_3_1 problem = new Array_3_1();

        Scanner in = new Scanner(System.in);

        int gameCount = in.nextInt();

        ArrayList<Integer> A_List = new ArrayList();
        ArrayList<Integer> B_List = new ArrayList();

        for(int i = 0 ; i < gameCount ; i++){
            int inputInt = in.nextInt();
            A_List.add(inputInt);
        }

        for(int i = 0 ; i < gameCount ; i++){
            int inputInt = in.nextInt();
            B_List.add(inputInt);
        }

        ArrayList<String> answer = problem.solution(A_List, B_List);

        for(int i = 0 ; i < answer.size() ; i++){
            System.out.println(answer.get(i));
        }}
}