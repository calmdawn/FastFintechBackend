package toyproject1.utils;

public class ExceptionStore {
    public static boolean checkInput(String input, int rangeMin, int rangeMax) {

        //숫자로만 이루어 져있는지 체크
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) < '0' || input.charAt(i) > '9') {
                System.out.println("Invalid Type for Input. Please try again.\n");
                return false;
            }
        }
        //선택할 수 있는 메뉴의 범위인지 확인
        int num = Integer.parseInt(input);
        if (num < rangeMin || num > rangeMax) {
            System.out.println("Invalid Input. Please try again.\n");
            return false;
        }
        return true;
    }

    //입력받은 문자열이 숫자라면 true, 반대인 경우 false
    public static boolean checkStringType(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) < '0' || input.charAt(i) > '9')
                return false;
        }
        return true;
    }

    public static int checkGroupType(String type) {
        if (type.equals("GENERAL")) {
            return 1;
        } else if (type.equals("VIP")) {
            return 2;
        } else if (type.equals("VVIP")) {
            return 3;
        } else if (type.equals("end")) {
            return 4;
        } else {
            System.out.println("Invalid Input. Please try again.");
            return 0;
        }
    }
}
