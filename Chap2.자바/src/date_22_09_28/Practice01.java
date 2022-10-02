package date_22_09_28;

/**
 * 아래의 코드에서 오류가 발생한 이유에 대해서 설명하고 코드를 알맞게 수정해보시오.
 */
public class Practice01 {
    static int speed;   //static을 붙임

    static void run() {} //static을 붙임


    public static void main(String[] args) {
//       오류해결
         speed = 60;
         run();
        // 오류가 발생하는 이유 main은 static 함수이므로 speed변수, run()함수 모두 static이 붙어야 제대로 동작한다.
        // static 변수, 함수는 프로그램이 실행될때 미리 만들어지는데 기존의 speed변수는 static이 붙지않아 미리 만들어지지않는다.
        // 만들어진 main함수에서 만들어지지않아 존재하지않는 speed변수를 사용하려고하니 오류가 발생한다.

//        // static을 사용하지 않을 경우 아래와 같이 객체 생성후 객체를 통해 호출
//        Practice01 car = new Practice01();
//        car.speed = 60;
//        car.run();
    }
}