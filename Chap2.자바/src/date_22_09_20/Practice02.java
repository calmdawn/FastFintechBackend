package date_22_09_20;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num1 > num2)
            System.out.println("최소 : " + num2 + ", 최대 : " + num1);
        else
            System.out.println("최소 : " + num1 + ", 최대 : " + num2);
    }
}
