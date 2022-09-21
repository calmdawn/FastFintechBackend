package date_22_09_21;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.nextLine().charAt(0);
        if ('a' <= ch && ch <= 'z') {
            ch = (char) (ch - 32);
            System.out.println(ch);
        } else
            System.out.println("영문자가 유효하지 않습니다.");
    }
}
