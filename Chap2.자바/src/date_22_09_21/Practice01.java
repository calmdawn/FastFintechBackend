package date_22_09_21;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double koreanScore = scan.nextDouble();
        double mathScore = scan.nextDouble();
        double englishScore = scan.nextDouble();
        double avg = (koreanScore + mathScore + englishScore) / 3;
        if (koreanScore < 0 || koreanScore > 100
                || mathScore < 0 || mathScore > 100
                || englishScore < 0 || englishScore > 100)
            System.out.println("성적이 유효하지 않습니다.");
        else
            System.out.printf("%.2f", avg);
    }
}
