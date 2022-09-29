package date_22_09_26;

/**
 * - 100개의 정수를 저장하는 배열 `int[] nums`를 만들고 1 ≤ 정수 ≤ 100 사이의 랜덤값으로 초기화하자.
 * - 랜덤값 생성 방법 - `Math.random()` 함수 이용
 * - 배열의 원소 중 `최댓값`과 `최솟값`을 구하는 프로그램을 작성해보자.  `원소중복 가능`
 */

public class Practice02 {
    public static void main(String[] args) {
        int[] nums = new int[100];  // 100개의 정수를 저장하는 배열. 배열의 0~99까지의 공간에 할당된다.
        int max = Integer.MIN_VALUE; // 1 <= 정수값의 범위 <=100 이므로 Integer.MIN_VALUE 대신 0을 넣어도 된다.
        int min = Integer.MAX_VALUE; // 1 <= 정수값의 범위 <=100 이므로 Integer.MAX_VALUE 대신 101을 넣어도 된다.
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100 + 1);  // Math.random -> 기본적으로 0부터 ~ 1미만 사이의 랜덤한 실수를 반환한다
                                                        // (Math.random * 100) -> 0부터 ~ 100미만 사이의 랜덤한 실수를 반환
                                                        // (int)(Math.random * 100 + 1) -> 1부터 ~ 101미만 사이의 랜덤한 실수를 반환하지만
                                                        // 앞에 (int)를 붙여서 실수를 정수형으로 바꿔버림.(형변환 또는 타입캐스팅이라 함) 즉 소수점 이하값을 전부 버림.
            max = Math.max(max, nums[i]);   //max 변수에 최대값 저장
            min = Math.min(min, nums[i]);   //min 변수에 최소값 저장
        }

        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);
    }
}
