package date_22_09_22;

public class Practice05 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                for (int c = 1; c <= 100; c++) {
                    if (a + b <= c)
                        break;
                    if (a * a + b * b == c * c) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
