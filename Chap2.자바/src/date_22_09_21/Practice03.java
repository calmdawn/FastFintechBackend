package date_22_09_21;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.nextLine();
        char oper = scan.nextLine().charAt(0);
        int result = 0;
        if (oper == '+') {
            result = a + b;
        } else if (oper == '-') {
            result = a - b;
        } else if (oper == '*') {
            result = a * b;
        } else if (oper == '/') {
            result = a / b;
        } else if (oper == '%') {
            result = a % b;
        } else {
            System.out.println("연산자가 유효하지 않습니다.");
            return;
        }
        System.out.println(a + " " + oper + " " + b + " = " + result);
    }
}
