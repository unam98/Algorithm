package boj.String;

import java.util.*;
public class String_7568_1{

    static class Person implements Comparable<Person>{
        int weight;
        int height;
        public Person(int weight, int height){
            this.weight = weight;
            this.height = height;
        }
        @Override
        public int compareTo(Person o){
            return this.height - o.height;
        }

        @Override
        public String toString() {
            return "(" + weight + "," + height + ")";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<>();
        HashMap<Person, Integer> map = new HashMap<>();

        Integer N = sc.nextInt();

        for(int i = 0; i < N ; i++){
            Integer w = sc.nextInt();
            Integer h = sc.nextInt();
            personList.add(new Person(w,h));
        } //for문 종료

        ArrayList<Person> originalList = new ArrayList<>(personList);

        Collections.sort(personList);
        System.out.println("personList " + personList);

        Integer rank = 1;
        //몸무게 비교
        for(int i=0; i<personList.size(); i++){
            for(int j=i; j<personList.size()-1; j++){ //0,1,2,3
                if(personList.get(i).weight < personList.get(j+1).weight){
                    rank++;
                }// if문 종료
            }// inner for문
            map.put(personList.get(i),rank);
            rank = 1;
        }//outer for문

        String answer = "";

        for(Person element : originalList){
            answer += map.get(element) + " ";
        }

        System.out.println(answer.trim());

    }
}

/*
키를 내림차순으로 정렬하면 i가 증가할 때마다 이전의 것은 무조건 자기보다 작은 값이니 rank에 신경 써줄 일이 없을 거라 생각했는데
이건 키가 다 안 겹칠 때가 기준이고 만약 185 185 이렇게 겹치는 경우에는 적용이 안 되는 솔루션임.

그래도 커스텀 클래스 만들어서 여러개의 property로 구성된 data를 하나의 객체로 다루고
Comparable, Comparator를 활용해서 그 객체들을 정렬하는 법을 배웠다.

또 Collections.sort()를 쓸 때 정렬하기 전의 원본 list를 어떻게 따로 보관하는지에 대한 고민도 있었는데
해당 리스트를 새 ArrayList 생성자에 그대로 인자로 넣어주면 된다는 것을 배움.

또 이렇게 커스텀 클래스를 만들었을 때 출력 형식을 재정의해야 하는 toString() 오버라이드도 해보았음.

다른 사람들의 풀이를 보니 2차원 배열을 만들어서 완전탐색으로 돌렸음.

이번 문제도 예외에 대한 파악이 못이루어져서 틀렸음.

풀면서 고민이 좀 됐던 건 input 받을 때
nextInt()로 받으면 개행 문자 소비가 안 된다는 것 때문에
여러줄을 입력받을 때 nextLine()을 써줘야 되나? 하는 거였음.

-> nextInt()만 연달아 쓰는 경우엔 문제가 없지만 nextInt() 후에 nextLine()을 쓸 때는 nextLine()이 앞서 처리되지못한 enter(공백)을
한 line으로 읽어들이기 때문에 문제가 된다.

 */