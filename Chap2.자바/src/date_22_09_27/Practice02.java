package date_22_09_27;

/***
 * - 캡슐화가 무엇인지 설명하고 정보은닉하는 방법에 대해 설명하시오.
 *
 * - 임시목표 : 특정 클래스에 정수 데이터를 저장한다. 단 정수값이 1 ~ 100 사이여야만 저장한다.
 */
public class Practice02 {
    public static void main(String[] args) {
        //캡슐화 : 연관된 데이터(변수)들과 기능들을 하나로 묶어 클래스로 만드는것
        //정보은닉 : 캡슐화한 데이터들을 외부에서 직접 접근할 수 없게 접근제어자를 통해 간접접근하도록 제한하는 것
        // ㄴ 접근제어자(public, package, default, private)
        // ㄴ 직접접근 -> 클래스이름.변수  ,  간접접근 -> 클래스이름.(get메서드 or set메서드)

        NoCapsule noCapsule = new NoCapsule();  //캡슐화, 정보은닉을 적용하지 않은 클래스.
        noCapsule.value = 200;  //직접접근 하는경우,  1~100까지의 값만 저장되어야 하지만 int value의 접근제어자가 private가 아니기 때문에 그냥 저장되어버림
        noCapsule.setValue(200); //간접접근 하는경우 , setValue함수(setter)로 값을 수정, 1~100까지 값만 저장하므로 값저장안됨

        OnCapsule onCapsule = new OnCapsule();  //캡슐화, 정보은닉을 적용한 클래스
//        onCapsule.value = 200;  //직접접근 하는경우, 변수가 private인 경우 코드실행 자체가 되지않는다.
        onCapsule.setValue(200); //간접접근 하는경우 , setValue함수(setter)를 통해 값을 수정,  1~100까지 값만 저장하므로 값 저장안됨

        //지금은 캡슐화 + 정보은닉 -> private 변수를 사용하고 이를 다루는 getter, setter 함수를 별도로 만들어서 관리하는것이라고 이해하자
        //나중에는 변수나 함수에 접근제어자를 어떤걸 사용해서 외부접근을 막고 데이터를 안전하게 관리할 것이냐를 생각하며 개발해야한다.
    }
}

class OnCapsule {
    private int value;  //접근제어자를 통해 외부접근을 막아 정보은닉 성공

    public int getValue() {
        return value;
    }

    public void setValue(int value) {   //1 ~ 100까지의 값만 저장하기위한 조건문을 추가함
        if(1<= value && value <=100) {
            this.value = value;
        }
    }
}

class NoCapsule {
    int value; //외부직접접근을 막지못하므로 정보은닉 실패

    public int getValue() {
        return value;
    }

    public void setValue(int value) {   //1 ~ 100까지의 값만 저장하기위한 조건문을 추가함
        if(1<= value && value <=100) {
            this.value = value;
        }
    }
}