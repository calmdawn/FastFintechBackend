package date_22_09_20;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int laptopPrice = scan.nextInt();
        int haveMoney = scan.nextInt();
        boolean isState = true;



        System.out.println((int) (laptopPrice * 1.1 - haveMoney));
    }
}
