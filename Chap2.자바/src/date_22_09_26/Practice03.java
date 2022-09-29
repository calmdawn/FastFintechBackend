package date_22_09_26;

import java.util.Arrays;

/**
 * - 아래 테이블의 데이터를 저장하는 이차원 배열 `int[][] scores2d`를 만들자. `원소중복 없음`
 * - `각 과목별 학생 성적 평균`을 계산하는 프로그램을 작성해보자.
 * - `각 학생별 과목 성적 평균`을 계산하는 프로그램을 작성해보자.
 * - 각 과목별 학생 성적 평균을 `내림차순`으로 정렬하고 각 성적을 받은 `과목 이름`도 같이 출력해보자.
 * - 각 학생별 과목 성적 평균을 `오름차순`으로 정렬하고 각 성적을 받은 `학생 번호`도 같이 같이 출력해보자.
 */

//아직 추가 설명 부족함, 구현만 완료함

public class Practice03 {
    public static void main(String[] args) {
        int[][] scores2d = {
                {50, 60, 70},
                {60, 76, 100},
                {95, 88, 87},
                {60, 65, 85},
                {100, 85, 77}};

        double[] studentsAvg = new double[scores2d.length];   //학생별 과목들의 평균을 저장할 배열
        double[] lecturesAvg = new double[scores2d[0].length]; //과목별 학생들의 평균을 저장할 배열

        setStudentsAvg(scores2d, studentsAvg);
        setLecturesAvg(scores2d, lecturesAvg);

        System.out.println("각 학생별 과목 성적 평균 : " + Arrays.toString(studentsAvg));
        System.out.println("각 과목별 학생 성적 평균 : " + Arrays.toString(lecturesAvg));

        int[] studentsNum = {1, 2, 3, 4, 5};   //기존 학생들의 번호 1 ~ 5까지 넣어주기
        String[] lecturesName = {"국어", "수학", "영어"}; //기존 과목들의 이름 넣어주기

        //다양한 정렬방식이 있지만 비교적 간단하고 기본적인 버블정렬을 활용해서 정렬했다.
        //https://wisdom-and-record.tistory.com/70
        //위 사이트 gif파일을 보면서 어떻게 동작하는지 느낌을 일단 알아보자

        bubbleAscendSort(studentsAvg, studentsNum); //오름차순 버블정렬
        bubbleDescendSort(lecturesAvg, lecturesName); //내림차순 버블정렬

        System.out.println();
        System.out.println("학생별 과목들의 평균 : " + Arrays.toString(studentsAvg));
        System.out.println("학생순서 : " + Arrays.toString(studentsNum));
        System.out.println("과목별 학생들의 평균 : " + Arrays.toString(lecturesAvg));
        System.out.println("과목순서 : " + Arrays.toString(lecturesName));

    }

    private static void bubbleDescendSort(double[] lecturesAvg, String[] lecturesName) {    //과목별 학생 평균 내림차순
        for (int i = 0; i < lecturesAvg.length; i++) {
            for (int j = lecturesAvg.length - 1; j > 0; j--) {
                if (lecturesAvg[j - 1] < lecturesAvg[j]) {    //앞과목의 학생평균 < 뒤과목의 학생평균인 경우 위치를 바꿔준다
                    double tempAvg = lecturesAvg[j - 1];
                    lecturesAvg[j - 1] = lecturesAvg[j];
                    lecturesAvg[j] = tempAvg;
                    //이때 기존의 과목이름의 순서도 같이 바꿔준다
                    String tempNum = lecturesName[j - 1];
                    lecturesName[j - 1] = lecturesName[j];
                    lecturesName[j] = tempNum;
                }
            }
        }
    }

    private static void bubbleAscendSort(double[] studentsAvg, int[] studentsNum) {   //학생별 과목 평균은 오름차순
        for (int i = 0; i < studentsAvg.length; i++) {
            for (int j = i + 1; j < studentsAvg.length; j++) {
                if (studentsAvg[j - 1] > studentsAvg[j]) {    //앞학생의 과목평균 < 뒤학생의 과목평균인 경우 위치를 바꿔준다
                    double tempAvg = studentsAvg[j - 1];
                    studentsAvg[j - 1] = studentsAvg[j];
                    studentsAvg[j] = tempAvg;
                    //이때 기존의 학생들의 순서도 같이 바꿔준다
                    int tempNum = studentsNum[j - 1];
                    studentsNum[j - 1] = studentsNum[j];
                    studentsNum[j] = tempNum;
                }
            }
        }
    }

    //2차원 배열에서 과목들의 평균을 구해서 1차원배열에 저장
    //scores2d(2차원) ->  lecturesAvg(1차원)
    private static void setLecturesAvg(int[][] scores2d, double[] lecturesAvg) {
        for (int i = 0; i < scores2d[0].length; i++) {
            double sum = 0;
            for (int j = 0; j < scores2d.length; j++) {
                sum = sum + scores2d[j][i];
            }
            lecturesAvg[i] = sum / scores2d.length;
        }
    }

    //2차원 배열에서 과목들의 평균을 구해서 1차원배열에 저장
    //scores2d(2차원) ->  studentsAvg(1차원)
    private static void setStudentsAvg(int[][] scores2d, double[] studentsAvg) {
        for (int i = 0; i < scores2d.length; i++) {
            double sum = 0;
            for (int j = 0; j < scores2d[i].length; j++) {
                sum = sum + scores2d[i][j];
            }
            studentsAvg[i] = sum / scores2d[i].length;
        }
    }
}
