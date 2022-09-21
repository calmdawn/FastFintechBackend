package date_22_09_22;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            char ch = scan.nextLine().charAt(0);
            if (ch == 'q')
                break;
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
