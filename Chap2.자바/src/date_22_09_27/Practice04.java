package date_22_09_27;

/**
 * hashcode()가 무엇인지 설명하고 객체 비교시 hashcode()의 역할에 대해 작성하시오.
 */
public class Practice04 {
    public static void main(String[] args) {
        //일반적인 경우
        //hashcode란? = 객체를 식별하기 위해, 해당 객체의 메모리 주소값을 변환하여 반환한 정수값을 의미한다
        //hashcode 객체비교시 역할 - 비교할 객체들의 반환된 정수값을 가지고 동일한 객체인지 아닌지 판단한다
        //모든 클래스는 기본적으로 Object 클래스를 상속받아만들어진다. 즉 최상위 클래스(부모클래스)는 Object 클래스이며 extends Object가 생략되어있다.
        //위부분은 일단 그렇구나~하고 넘어가고 추후 클래스 부분 강의를 들으면 알게 될 것이다.
        Object obj = new Object();
        Object obj2 = new Object();
        obj.hashCode(); //각각의 함수에 windows -> control + 클릭 , mac -> command + 클릭을 통해 어떤 방식으로 처리하게끔 구현되어 있는지 확인해보자
        obj.equals(obj2); //각각의 함수에 windows -> control + 클릭 , mac -> command + 클릭을 통해 어떤 방식으로 처리하게끔 구현되어 있는지 확인해보자

        //일반적이지 않은경우 - (아래의 예와 같은 다양한 경우들이있다)
        //문자열 비교를위한 String 클래스를 사용했을때 equals, hashcode는 오버라이딩 되어 처리방식이 다르다.
        String str1 = "str1";
        String str2 = "str2";
        str1.hashCode(); //각각의 함수에 windows -> control + 클릭 , mac -> command + 클릭을 통해 어떤 방식으로 처리하게끔 구현되어 있는지 확인해보자
        str1.equals(str2); //각각의 함수에 windows -> control + 클릭 , mac -> command + 클릭을 통해 어떤 방식으로 처리하게끔 구현되어 있는지 확인해보자
    }
}
