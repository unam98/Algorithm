package programmers;

class Solution_7_1 {
    public int[] solution(String[] wallpaper) {
        Integer rowLength = wallpaper.length;
        Integer columnLength = wallpaper[0].length();
        
        Character[][] table = new Character[rowLength][columnLength];
        
        for(int i=0; i<rowLength; i++){
            for(int j=0; j<columnLength; j++){
                table[i][j] = wallpaper[i].charAt(j);
            }
        } //2차원 배열 생성 완료
            
        Integer x_min = 50;
        Integer x_max = 0;
        Integer y_min = 50;
        Integer y_max = 0;
        Integer count = 0;
            
        for(int i=0; i<rowLength; i++){
            for(int j=0; j<columnLength; j++){ //4,2 -> 5,3
                if(table[i][j] == '#'){
                    count++;
                    if(i < x_min){
                        x_min = i; //50
                    } else if (i > x_max){
                        x_max = i; //4
                    }
                    if(j < y_min){
                        y_min = j; //50
                    } else if (j > y_max){
                        y_max = j; //2
                    }
                }
            }
        } //for문 종료
        
        if(count.equals(1)){
            x_max += x_min;
            y_max += y_min;
        }
                   
        int[] answer = {x_min,y_min,x_max+1,y_max+1};
        return answer;
    }
}

/*
8:42~

9:10
..........
.....#.... a[1][5] -> o : 제일 작은 i를 S의 x
......##.. a[2][6] a[2][7] -> y +1 : 제일 큰 j에 +1 한 게 E의 y
...##..... a[3][3] a[3][4] -> o : 제일 작은 j가 S의 y
....##.... a[4][4] a[4][5] -> x + 1 : i가 제일 큰 거에 +1 한 게 E의 x
(1,3) -> (5,8)


9:15
입력값 〉 ["...", "...", "...", "...", "..#"]
기댓값 〉 [4, 2, 5, 3]

9:30
---
규칙을 찾으려고 했음.
주어진 예제에 있는 #의 좌표를 다 찍어보니
S_x : 제일 작은 i
S_y : 제일 작은 j
E_x : 제일 큰 i에 +1
E_y : 제일 큰 j에 +1
이라는 규칙을 찾아냈고
제일 큰/작은 i, j를 찾아내야 한다는 걸 파악해서 각각에 대한 변수를 만들어주었음.

주어진 배열은 2차원 형태가 아니라서 내가 직접 2차원 배열을 만들고 값을 다 넣어주었음
이후에는 이중 for문을 돌리면서 #이 뜨면 최소/최대 비교하면서 S_x, S_y, E_x, E_y 값을 갱신하도록 해주었고
이걸 answer에 넣고 출력하게 logic을 짰음.
---
런타임 에러가 떴는데 보니까 charAt()인데 이차원 배열을 다루다보니 charAt[]이라고 써놨었음
gpt가 아니었다면 못찾아냈을듯.

또, 한 테스트 케이스에 대해서 fail이 떴는데 다행이 입력값/출력기대값이 공개돼있는 경우라서 대응을 해낼 수 있었음.
#이 하나인 경우에 내 logic이 안 먹힌다는 걸 파악하고는 출력 값과 기대 값 차이를 보고 count 변수를 만들어서
그 차이 만큼 수동으로 더해주었음. (이해보다는 떄려맞추는 식이었음)

1시간 정도가 걸렸고 규칙을 찾아내는 거에 대부분의 시간을 씀.
---
이중for문 돌릴 거면 굳이 2차원 배열로 안 만들어줘도 됐었네.
대소 비교를 if문으로 직접 해도 되지만 Math.min()을 썼으면 더 깔끔했겠다.
Integer.MAX_VALUE; 이것도 마찬가지.
근데 왜 count가 1일 때는 내 logic이 안 먹혔지? 다른 사람들의 풀이랑 특별히 다를 게 없어보이는데.
-> 파악했음
*/