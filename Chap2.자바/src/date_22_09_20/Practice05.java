package date_22_09_20;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        int num1 = 123456780;
        int num2 = 123456780;

        float num3 = num2;
        num2 = (int) num3;
        System.out.println(num3);
        System.out.println(num2);

        int result = num1 - num2;
        System.out.println(result);

//        실수형의 정밀도의 제한으로 인한 오차가 발생할 수 있다.
//        int의 최대값은 약 20억으로 최대 10자리의 정밀도를 요구한다
//        float의 경우 10진수로 7자리 정도의 정밀도만을 제공하기 때문에 int -> float으로 변환할 때 정밀도 차이에 의한 오차가 발생할 수 있다.
//        그렇기때문에 10진수로 8자리 이상의 값을 실수형으로 변환할 때는 double형으로 변환해야 오차가 발생하지 않는다.

    }
}
