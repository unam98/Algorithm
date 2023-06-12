//package practice;
//
//import java.util.*;
//
//public class Summary {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        sc.nextLine(); // 개행 문자를 읽어내는 코드 추가
//        String[] token = new String[N];
//
//        for (int i = 0; i < N; i++) {
//            String input = sc.nextLine();
//            StringTokenizer st = new StringTokenizer(input);
//            token[i] = st.nextToken();
//        }
//
//        for (String element : token) {
//            System.out.println(element);
//
//            String test1 = "d";
//            char[] tet22 = test1.toCharArray();
//            char test2 = 'd';
//
//            Integer test3 = 1;
//
//            test3.toString();
//
//            Integer.parseInt(test1);
//            Integer.parseInt(String.valueOf(test2));
//            Character[] sample = {'1', '2', '3','4','5'};
//            System.out.println(sample[1]);
//            ArrayList<String> test = new ArrayList<>(List.of("hi"));
//
//            Collections.reverse(test);
//
//
//            Arrays.sort(sample,Comparator.reverseOrder());
//            Arrays.
//            test.sort();
//            Collections.sort(sample);
//            test.indexOf(0);
//
//            Character.
//            );
//        }
//
//    }
//}
//
/*

- split() 결과를 변수에 저장
String[] strArray = str.split("");

- toCharArray() 결과를 변수에 저장
char[] charArray = str.toCharArray();

- length/length()/size() 구분
ArrayList -> size()
String -> length()
Array -> length

- ArrayList/String/Array 별 특정 문자 접근 방법 구분
ArrayList -> get()
String -> charAt()
Array -> []

- ArrayList/String/Array 별 특정 문자의 인덱스 구하는 방법 구분
ArrayList -> indexOf()
String -> indexOf()
Array -> for문 돌리면서 직접 찾아야 함

- Scanner를 통한 input 받기
import.java.util.Scanner
Scanner sc = new Scanner(System.in)
sc.next();

- BufferedReader를 통한 input 받기
import.java.io.BufferedReader
import.java.io.InputStreamReader
import.java.io.IOException
throws IOException {}
BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
br.readLine();

- 문자열 뒤집기
String str = "ABC";
StringBuilder sb = new StringBuilder(str);
String reversedStr = sb.reverse().toString();
또는 for문으로 직접 뒤집기

- 아스키 코드 : A-65, a-97

- 스택/큐/해시맵 생성 방법 숙지 * import 해줘야 함

스택 : Stack<Integer> st = new Stack<>();
큐 : Queue<Integer> q = new LinkedList<>();
해시맵 : HashMap<Integer,Integer> map = new HashMap<>();

- 스택/큐/해시맵 메서드 숙지
스택
push() / pop() / peek() / isEmpty() / size() / clear()

큐
add() / offer() / remove() / poll() / peek() / isEmpty() / size() / clear()

해시맵
put() / get() / containsKey()

- 배열(Array) 생성과 동시에 요소 할당
char[] sample = {'1','2','3','4','5'}

- ArrayList 생성과 동시에 요소 할당
ArrayList<String> sample = new ArrayList<>(List.of("test"));

- Integer -> char : (char) (Integer)
- Integer -> String : toString()
- char -> Integer : Integer.parseInt(String.valueOf(char))
- String -> Integer : Integer.parseInt(String)
- char -> String : String.valueOf(char)

- ArrayList 정렬 방법
오름차순 : Collections.sort(arrayList);
내림차순 : Collections.reverse(arrayList);

- Array 정렬 방법
오름차순 : Arrays.sort(array);
내림차순 : Arrays.sort(array, Comparator.reverseOrder()) * input으로 넣는 배열은 Class 타입으로 선언되어야 함 ex) int (x) Integer (O)

- 대소문자 변환
Character.toUpperCase();
Character.toLowerCase();

- 대소문자 판별
Character.isUpperCase();
Character.isLowerCase();

- 알파벳 판별
Character.isAlphabetic();

- 사용자 정의 클래스 만드는 법
멤버변수 정의, 생성자 정의, new 키워드를 통해 객체 생성

class Person(){
    Integer id;
    Integer priority;

    public Person(Integer id, Integer priority){
        this.id=id;
        this.priority=priority;
    }
}

- 사용자 정의 객체 정렬하는 법
1) Comparable 인터페이스 상속

class Person() implement Comparable<Person>{
    Integer id;
    Integer priority;

    public Person(Integer id, Integer priority){
        this.id=id;
        this.priority=priority;
    }
    @Override
    public int compareTo(Person o) {
        return o.priority - this.priority
    }
}
Collections.sort(arr);

2) Comparator 객체
Comparator<Person> comparator = new Comparator<Person>() {
    @Override
    public int compare(Person a, Person b) {
        return b.priority - a.priority;
    }
    };

Collections.sort(arr, comparator);

+)
trim() : String 메서드
subString() : String 메서드
equals 메서드는 String, Integer에서 제공하고 Character는 ==로 처리해야 함
 */