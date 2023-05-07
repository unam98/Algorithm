package programmers;

import java.util.ArrayList;

class Solution_1 {
    public String solution(String s) {
        String[] splitList = s.split(" ");
        ArrayList<Integer> intList = new ArrayList<>();
        
        for(String element : splitList){
            intList.add(Integer.parseInt(element));
        }
        
        Integer min = intList.get(0);
        Integer max = intList.get(0);    
        
        for(int i = 1 ; i < intList.size() ; i++){
            min = Math.min(min,intList.get(i));
            max = Math.max(max,intList.get(i));
        }
        
        String answer;
        answer = min + " " + max;
    
        return answer;
    }
}

/*
내가 조건문을 직접 짜줘도 되는데 이번엔 Math.min(), Math.max()를 활용해봤음.
 */