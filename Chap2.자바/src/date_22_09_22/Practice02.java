package date_22_09_22;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "";
        while (true) {
            char ch = scan.nextLine().charAt(0);
            if (ch == 'q')
                break;
            str = ch + str;
        }
        System.out.println(str);
    }
}
