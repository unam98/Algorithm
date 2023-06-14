package boj.implement;

import java.util.*;
import java.io.*;

public class Implement_1475_1 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Integer[] list = new Integer[10];
        Arrays.fill(list,1);
        Integer count = 1;

        String inputStr = bf.readLine();

        for(Character element : inputStr.toCharArray()){
            if(list[Character.getNumericValue(element)] >= 1){
                list[Character.getNumericValue(element)] -= 1;
            } else {
                if(element == '6' && list[9] >= 1){
                    list[9]-=1;
                } else if(element == '9' && list[6] >= 1){
                    list[6]-=1;
                } else {
                    count++;
                    for(int i=0; i<list.length; i++){
                        list[i]+=1;
                    }
                    list[Character.getNumericValue(element)] -= 1;
                }
            }
        }
        System.out.println(count);
    }
}

/*
처음엔 ArrayList 하나 만들어서 contains로 이미 포함돼있는 수라면 count++ 후 ArrayList 초기화, 해당 element add 하는 식으로
코드를 짰는데 이렇게 하니까 111444와 같은 경우에 대응이 안 됐음.

그래서 생각을 한 게 0~9라는 값이 고정적이니까 배열을 하나 만들고
어차피 무조건 1세트는 쓰이는 거니까 1로 초기값을 초기화해준다음
여러 조건들을 체크하며 배열 내 해당 인덱스에 값이 0, 즉 남아있지 않으면 count를 ++하는 식으로 logic을 수정함.

Character를 Integer로 형변환하는 것도 Integer.parseInt()로 될 줄 알았는데
Character.getNumericValue()라는 걸 써야 했었고

생성한 배열에 초기값을 지정해주려면
Arrays.fill(array,1); 이런식으로 접근해야 한다는 것도 처음 알았음.

중간에 Array 값을 그대로 유지하면서 ArrayList를 만드는 방법은 없나 고민도 됐었는데
ArrayList<>(Arrays.asList(array));의 방법이 있었음.

만약 array가 아닌 직접 값을 할당해주고 싶다면
ArrayList<>(List.of('apple','banana')); 이런식의 접근이 있다는 걸 알았음.
 */