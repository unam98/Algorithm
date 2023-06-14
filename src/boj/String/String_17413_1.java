package boj.String;

import java.util.*;
import java.io.*;

public class String_17413_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>(); //split 안 됨.
        char[] words = bf.readLine().toCharArray();
        String answer = "";
        boolean stackMode = true;

        for(int i=0; i<words.length; i++){
            if(words[i] == '<'){
                stackMode = false;
                if(stack.size() > 0){
                    while(!stack.isEmpty()){
                        answer += stack.pop().toString();
                    }
                }
                answer += "<";
                continue;
            } else if (words[i] == '>'){
                stackMode = true;
                answer += ">";
                continue;
            } else if (words[i] == ' '){
                while(!stack.isEmpty()){
                    answer += stack.pop().toString();
                }
                answer += " ";
                continue;
            }

            if(stackMode){
                stack.add(words[i]);
            } else {
                answer += words[i];
            }

            if (i == words.length-1){
                while(!stack.isEmpty()){
                    answer += stack.pop().toString();
                }
            }
        }
        System.out.println(answer);
    }
}

/*
맞았긴 한데 다른 사람들의 풀이보다 메모리 사용량이 너무 큼. 아마도 StringBuilder를 사용하지 않고 String을 써서 그런듯.
또, ide가 아니었으면 중간에 생긴 오류를 잡아낼 수 있었을까 싶음.

원래 i == words.length-1 이 부분 위에 작성한 코드였는데 이 부분은 print 찍어보니까
stackMode랑 관련이 없어서 String에 반영이 안 되는 문제가 있었고 이를 밑에 배치시킴으로써 해결해냈음.

읽어들인 char이 공백이면 수동으로 " "를 더해주는 코드를 짰는데 stackMode가 true로 유지되면서
밑으로 내려와서 stack.add(words[i])가 돌기 때문에 " "이 한 번 더 추가되는 문제가 있었음.
continue를 달아줘서 해결했음.

continue를 쓸 때는 쓰는 위치와 밑에 있는 코드들 간의 관계를 잘 봐야 함
 */