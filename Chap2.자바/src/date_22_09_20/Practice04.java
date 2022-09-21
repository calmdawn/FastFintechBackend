package date_22_09_20;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num > 0)
            System.out.println("양수");
        else if (num == 0)
            System.out.println("0");
        else
            System.out.println("음수");
    }
}
