package date_22_09_22;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM = 5;
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < NUM; i++) {
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("유효하지 않은 성적 입력값입니다.");
                return;
            }
            sum += score;
        }
        avg = sum / NUM;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
