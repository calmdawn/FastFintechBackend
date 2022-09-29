package date_22_09_22;

public class Practice06 {
    public static void main(String[] args) {
        String star;
        for (int i = 1; i <= 5; i++) {
            star = "";
            for (int j = 0; j < 5 - i; j++)
                star = star + " ";
            for (int k = 0; k < i; k++)
                star = star + "*";
            System.out.println(star);
        }
    }
}
