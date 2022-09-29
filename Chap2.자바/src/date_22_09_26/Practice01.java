package date_22_09_26;
//패키지가 선언된부분 밑부터 복사후 자신의 IDE(eclipse, Intellij)에 붙여넣으면 좀더 쉽게 볼 수 있음

import java.util.Scanner;

/**
 * - 10명의 학생들의 성적을 저장하는 배열 `int[] scores`를  만들고 성적을 입력받고자 한다.
 * - 학생 성적의 `최댓값, 최솟값, 평균, 분산, 표준편차`반환하는 프로그램을 작성해보자. `원소중복 가능`
 */
public class Practice01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] scores = new int[10]; //학생 성적 10명을 저장할 배열을 생성

        //예시로 성적을 1~10까지 입력받아보자.
        for (int i = 0; i < scores.length; i++) {   //i=0 부터,  i< scores배열의 길이(여기서는 10)가 될때까지, i값을 1씩 증가시키면서 반복한다
            scores[i] = scan.nextInt(); //scores 배열의 i번째 공간에 scan.nextInt()함수를 통해 성적을 입력받음
        }
        int max = getMax(scores); //getMax함수를 실행한 이후 반환받은 값을 max 변수에 저장함.
        int min = getMin(scores); //getMin함수를 실행한 이후 반환받은 값을 min 변수에 저장함.
        double avg = getAverage(scores);
        double var = getVariance(scores, avg);
        double std = getStandardDeviation(var);

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
        System.out.println("평균 : " + avg);
        System.out.println("분산 : " + var);
        System.out.println("표준편차 : " + std);
    }

    //최대값을 구하는 함수.
    //public static int getMax(int[] scores)의 의미는 아래와 같다.

    //어디에서나 접근할 수 있으며   ->  public
    //미리 메모리에 할당되어 클래스를 따로 만들필요없이 바로 호출할 수 있고  -> static
    //함수가 끝날시 int 자료형 값을 반환하는   -> int
    //함수의 이름은 getMax이다. -> 카멜케이스(camelCase)첫문자는 소문자로 시작 이후 다음단어마다 첫문자는 대문자로 선언하는 방식.
    //getMax함수는 실행하기위해 인자값(괄호내부에 선언된 변수)으로 int형 배열을 받는다 -> int[] scores를 받는다.
    public static int getMax(int[] scores) {
        int max = Integer.MIN_VALUE;    //최대값을 구하기 위해 기본 값으로 int가 가질수 있는 가장 작은 값을 미리 넣어준다.
        for (int i = 0; i < scores.length; i++) {   //반복문을 돌면서 max변수에 최대값을 갱신하면 넣어준다.
            max = Math.max(max, scores[i]); // Math.max(a, b) -> a, b값을 비교하여 더 큰값을 반환한다. ex Math.max(7, 3) -> 7을 반환
        }
        return max; // 함수를 종료하면 max값을 반환한다.
    }

    //현재 클래스 내부에서만 접근할 수 있으며    ->  private 여기에서는 Practice01 클래스내부에서만 접근할 수 있다.
    private static int getMin(int[] scores) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < scores.length; i++) {
            min = Math.min(min, scores[i]);
        }
        return min;
    }

    private static double getAverage(int[] scores) {
        double sum = 0; //double로 선언한이유 성적을 전부 더한 값을 학생수로 나눌때 실수값이 나올 수 있기때문
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        return sum / scores.length; // 성적의 총합 / 학생수(여기서는 10)
    }

    //표준편차란? 분산의 제곱근 즉, 루트값이다
    private static double getStandardDeviation(double var) {
        return Math.sqrt(var);
    }

    //분산이란? 기존값들 각각에 대해 평균을 뺀 값의 제곱들의 합의 평균을 말한다.
    private static double getVariance(int[] scores, double avg) {
        double result = 0;  //분산을 저장할 변수
        for (int i = 0; i < scores.length; i++) {
            result = result + Math.pow(scores[i] - avg, 2); // result변수 = result변수에 있던값 + Math.pow((어떤학생- 학생들의 평균), 제곱)
        }
        return result / scores.length;  //제곱된 값들의 평균을 반환
    }
}
