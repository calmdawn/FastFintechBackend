package date_22_09_22;

public class Practice08 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;    //기존에 종료조건이 주어지지않음
        }

        int k = 1;
        while (k <= 5) {
            int l = 1;
            while (l <= 5) {
                System.out.print("*");
                l++;    //종료조건이 상위 반복문에 주어져있었음
            }
            System.out.println();
            k++;
        }

    }
}
