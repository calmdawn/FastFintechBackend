package date_22_09_20;

public class Practice06 {
    public static void main(String[] args) {
        byte byte1 = 1;
        byte byte2 = 1;
//오류발생!        byte byte3 = byte1 + byte2;
//별도의 자료형명시가 없으면 기본자료형인 int로 변환되어 수행되기 때문에 오류발생

        byte byteValue = 65;
//오류발생!        char charValue = byteValue;
//자료형의 타입이 다르게 때문에 오류발생
    }
}
