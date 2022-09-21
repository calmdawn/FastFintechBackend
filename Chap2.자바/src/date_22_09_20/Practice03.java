package date_22_09_20;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if((year % 400 ==0) || (year % 4 == 0 && year%100 != 0))
            System.out.println("윤년");
        else
            System.out.println("평년");
    }
}
