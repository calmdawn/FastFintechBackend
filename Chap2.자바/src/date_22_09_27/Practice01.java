package date_22_09_27;

/***
 * 아래 코드에서 Car 디폴트 생성자를 없애면 SportCar 클래스에서 오류나는 이유를 설명하시오.
 */
public class Practice01 {
    //방법 1 부모클래스인 Car 클래스에 기본생성자를 추가한다.
    //방법 2 자식클래스인 SportCar 클래스에서 Car의 다른 생성자를 호출한다.

    //모든 클래스들은 생성자를 가지고 있다. 별도로 생성자를 만들어 주지 않은 경우 보이지만 않을뿐 기본적으로 디폴트 생성자를 가지고 있다.
    //자식클래스의 생성자는 무조건 부모클래스의 생성자중 1개를 호출해야한다.
    //자식클래스에서 super(인자값)을 통해 부모클래스의 생성자를 호출한다.
    //자식클래스의 생성자에서 직접 super(인자값)을 사용하지 않았다면, 이것도 기본적으로 super()을 호출하게된다. 규칙이다.
}

class Car {
    String ID;
    String modelName;
    String company;
    int speed;

    public Car() {}   //Car의 생성자1 = 기본생성자(디폴트생성자) 구조를 가지고 있다.

    public Car(String ID, String modelName, String company, int speed) {    //Car의 생성자2
        this.ID = ID;
        this.modelName = modelName;
        this.company = company;
        this.speed = speed;
    }
}

class SportCar extends Car {
    int turbo;

    public SportCar() { //2개의 생성자중 한개를 선택해서 호출하면 된다.
        //super() 보이지만 않을뿐 기본적으로 호출되고 있다.
        //super("아이디","이름","회사", 7);  //부모클래스의 생성자중 1개만 호출하면 되기 때문에 2번 생성자로 지정해도 된다. 주석을 없애도 오류가 발생하지 않는다.
    }

    public SportCar(int turbo) {
        //super() 보이지만 않을뿐 기본적으로 호출되고 있다.
        //super("아이디","이름","회사", 7);  //부모클래스의 생성자중 1개만 호출하면 되기 때문에 2번 생성자로 지정해도 된다. 주석을 없애도 오류가 발생하지 않는다.
        this.turbo = turbo;
    }

    public SportCar(String ID, String modelName, String company, int speed, int turbo) {
        super(ID, modelName, company, speed);   //car의 생성자들중 2번 생성자를 호출하고있다.
        this.turbo = turbo;
    }
}