package date_22_09_26;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(); //테스트 케이스의 개수를 입력받는다.

        for (int testCase = 0; testCase < T; testCase++) {
            String input = scan.next(); //OX로 이루어진 문자열을 입력받는다.
                                        // 아마 scan.next()대신 scan.nextLine()을 사용하면 잘못된 결과값을 얻게됨.
                                        // 개행(\n)을 포함시키느냐, 어디까지를 입력받는 기준으로 볼꺼냐의 차이
            int sum = 0;    //총 점수를 저장할 변수
            int count = 0;  //현재까지 연속된 O의 개수
            for (int i = 0; i < input.length(); i++) {  //전달받은 문자열을 첫번째 글자 ~ 마지막 글자까지 확인하기 위한 반복문
                if (input.charAt(i) == 'O') {   //input.charAt(i) == 'O' -> 입력받은 문자열 input의 i번쨰 위치의 '문자'를 반환 == 'O' 이라면
                    count++;
                    sum = sum + count;  //총점수 = 지금까지 총점수 + 연속된 0의개수
                } else {
                    count = 0;
                }
            }
            System.out.println(sum); //하나의 테스트케이스가 끝났으므로 현재 테스트케이스의 총 점수를 출력
        }
    }
}
