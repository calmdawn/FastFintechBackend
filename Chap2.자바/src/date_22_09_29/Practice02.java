package date_22_09_29;

public class Practice02 {
    public static void main(String[] args) {
        /**
         * 실습2
         * - Electronics`클래스는 최대 10개 저장하고 있는 객체 배열 `Electronic[] electronics`이 있다.
         * - 전자제품 일련번호 `productNo`가 주어졌을 때 해당 일련번호에 해당하는 전자제품을 반환하는 함수를 작성하시오.
         * - `Electronic findByProductNo(String ProductNo)`
         * */

        //기존 강사님 실습 예상결과를 위한 코드

//        Electronics electronics = new Electronics(new Electronic[]{
//                new Electronic("0001", "", Electronic.companyName.SAMSUNG, "220110", new Electronic.authMethod[]{AuthMethod.FIN, AuthMethod.FACE}),
//                new Electronic("0002", "", Electronic.companyName.LG, "211010", new Electronic.authMethod[]{AuthMethod.FIN, AuthMethod.PATTERN}),
//                new Electronic("0003", "", Electronic.companyName.APPLE, "220722", new Electronic.authMethod[]{AuthMethod.FIN}),
//                new Electronic("0004", "", Electronic.companyName.SAMSUNG, "220310", new Electronic.authMethod[]{AuthMethod.FIN, AuthMethod.FINGER}),
//                new Electronic("0005", "", Electronic.companyName.LG, "210722", new Electronic.authMethod[]{AuthMethod.FIN, AuthMethod.FINGER, AuthMethod.PATTERN, AuthMethod.FACE}),
//                new Electronic("0006", "", Electronic.companyName.APPLE, "200310", new Electronic.authMethod[]{AuthMethod.FIN, AuthMethod.FINGER})});
//
//        Electronic findResult = electronics.findByProductNo("0003");


        //임의로 바꾼 실습 예상결과를 위한 코드
        //아무리 생각해봐도 의도를 파악하지 못하고 주어진코드가 오류가 안날 수 있는 정답을 찾지못하겠어서 임의로 바꾸었습니다.

        //1. Enum이 클래스 외부에 별도로 있는경우
        //   기존 - new Electronic("0001", "", Electronic.companyName.SAMSUNG, "220110", new Electronic.authMethod[]{AuthMethod.FIN, AuthMethod.FACE}),
        //   변경 - new Electronic("0001", "", CompanyName.SAMSUNG, "220110", new AuthMethod[]{AuthMethod.FIN, AuthMethod.FACE}),

        //2. Enum이 클래스 내부에 존재하는 경우
        //   기존 - new Electronic("0001", "", Electronic.companyName.SAMSUNG, "220110", new Electronic.authMethod[]{AuthMethod.FIN, AuthMethod.FACE}),
        //   변경 - new Electronic("0001", "", Electronic.CompanyName.SAMSUNG, "220110", new Electronic.AuthMethod[]{Electronic.AuthMethod.FIN, Electronic.AuthMethod.FACE}),

        //주어진 예상결과 코드의 Electronic.companyName.SAMSUNG에서
        // -> Electronic클래스 내부의 companyName 변수를 표현한걸까?
        //          - .SAMSUNG을 쓰기위해서는 Enum이아닌 별도의 클래스를 두고 내부에 SAMSUNG이라는 변수를 선언해서 넘겨줘야한다고 생각함. 하지만 문제에서는 Enum을 사용하라고 했으니 아닌것같음
        // -> Electronic클래스 내부의 companyName이 Enum을 표현한거라면 대문자여야 맞지않나??
        //          - 클래스 이름처럼 대문자로 쓰는게 관례적일뿐 규칙은 아니기때문에 소문자로 사용했다고 해서 기능상의 문제는 없다.companyName은 그렇다 치고 넘어가보자
        //          - new Electronic.authMethod[]{AuthMethod.FIN, AuthMethod.FACE} 에서도 enum을 소문자 authMethod로 선언했다고 가정했을때 new Electronic.authMethod[] - > Electronic 내부의 authMethod enum 배열을 새롭게 생성하겠다
        //          - {AuthMethod.FIN, AuthMethod.FACE} -> 생성한 배열에는 괄호안의 값들이 들어간다. 그런데 여기서는 AuthMethod.FIN 대문자를 사용하고 있고 Electronic 클래스 내부가 아닌 외부에 따로 존재한다.
        //          - 위처럼 쓰려면 Electronic 내부, 외부에 각각 authMethod enum이 선언되어야하며 그이름은 각각 authMethod, AuthMethod가 생성되어야하는데 이렇게 사용하기를 의도하진 않았다고 생각함.

        Electronics electronics = new Electronics(new Electronic[]{
                new Electronic("0001", "", Electronic.CompanyName.SAMSUNG, "220110", new Electronic.AuthMethod[]{Electronic.AuthMethod.FIN, Electronic.AuthMethod.FACE}),
                new Electronic("0002", "", Electronic.CompanyName.LG, "211010", new Electronic.AuthMethod[]{Electronic.AuthMethod.FIN, Electronic.AuthMethod.PATTERN}),
                new Electronic("0003", "", Electronic.CompanyName.APPLE, "220722", new Electronic.AuthMethod[]{Electronic.AuthMethod.FIN}),
                new Electronic("0004", "", Electronic.CompanyName.SAMSUNG, "220310", new Electronic.AuthMethod[]{Electronic.AuthMethod.FIN, Electronic.AuthMethod.FINGER}),
                new Electronic("0005", "", Electronic.CompanyName.LG, "210722", new Electronic.AuthMethod[]{Electronic.AuthMethod.FIN, Electronic.AuthMethod.FINGER, Electronic.AuthMethod.PATTERN, Electronic.AuthMethod.FACE}),
                new Electronic("0006", "", Electronic.CompanyName.APPLE, "200310", new Electronic.AuthMethod[]{Electronic.AuthMethod.FIN, Electronic.AuthMethod.FINGER})});

        Electronic findResult = electronics.findByProductNo("0003");
        System.out.println(findResult.toString());
    }
}
