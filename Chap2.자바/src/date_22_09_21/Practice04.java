package date_22_09_21;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        if (x > 0 && y > 0)   //제 1사분면
            System.out.println("1 사분면");
        else if (x < 0 && y > 0)   //제 2사분면
            System.out.println("2 사분면");
        else if (x < 0 && y < 0)  //제 3사분면
            System.out.println("3 사분면");
        else if (x > 0 && y < 0)   //제 4사분면
            System.out.println("4 사분면");
        else if (x == 0 && y == 0)
            System.out.println("x축, y축 위에 있음");
        else if (x == 0)
            System.out.println("y축 위에 있음");
        else
            System.out.println("x축 위에 있음");
    }
}
