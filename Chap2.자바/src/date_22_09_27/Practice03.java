package date_22_09_27;

/**
 * - 주민등록번호는 특수한 경우가 아닌 이상 수정할 수 없다.
 * - 다음의 코드를 주민등록번호를 수정할 수 없도록 하는 방법에 대해 생각해보자.
 */

public class Practice03 {
    public static void main(String[] args) {
        //이미 주민등록번호를 저장하는 변수 registrationNumber의 접근제어자가 private임
        //즉 직접접근이아닌 간접접근(getter함수, setter함수)으로만 값을 가져오거나 수정할 수 있음
        //값을 수정하는 setter함수 여기서는 public void setRegistrationNumber(String registrationNumber)에서 조건에따라 값을 처리해야함
        //정규식을 통해 올바른 주민등록번호 형식인지를 setter함수에서 확인하고 처리하자. 정규식 전부를 해석해도 좋지만 그렇구나~ 하고 넘어가자

        EncapsulationExample encapsulationExample = new EncapsulationExample("bab", 30, "910308-1234567");
        System.out.println(encapsulationExample);
        encapsulationExample.setAge(-10000);
        encapsulationExample.setName(null);
        encapsulationExample.setRegistrationNumber("121234-9234567");
        System.out.println(encapsulationExample);

    }
}

class EncapsulationExample {
    private String name;
    private int age;
    private String registrationNumber;

    public EncapsulationExample() {
    }

    public EncapsulationExample(String name, int age, String registrationNumber) {
        this.name = name;
        this.age = age;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) return;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) return;
        this.age = age;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {//주민등록번호가 null 이거나 공백"" 인경우에만 값을 저장한다
        if (this.registrationNumber == null || this.registrationNumber.equals("")) {//저장된 주민등록번호가 null 이거나 공백"" 인경우에만 값을 저장한다
            final String REGSTRATION_REGEX = "^\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|[3][01])\\-[1-4][0-9]{6}$";
            if (!registrationNumber.matches(REGSTRATION_REGEX)) //만약 입력받은 번호가 올바른 주민등록번호의 형식이 아닌경우 함수를 탈출(반환)한다;
                return;
            this.registrationNumber = registrationNumber;   //입력받은 주민등록번호를 저장한다
        }
    }


    @Override
    public String toString() {
        return "NoEncapsulationExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}