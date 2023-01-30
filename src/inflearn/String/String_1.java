package inflearn.String;

import java.util.Scanner;

public class String_1 {
    public int solution(String fullWord, char countThisWord){
        int count = 0;
        fullWord = fullWord.toUpperCase();
        countThisWord = Character.toUpperCase(countThisWord);

        for(int i=0;i<fullWord.length();i++){
            if(fullWord.charAt(i) == countThisWord){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String_1 test = new String_1();
        Scanner in = new Scanner(System.in);
        String fullWord = in.next();
        char countThisWord = in.next().charAt(0);


        int answer = test.solution(fullWord, countThisWord);
        System.out.println(answer);
    }
}