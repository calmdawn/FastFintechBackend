package date_22_09_26;

public class Practice06 {
    //예시를 돌려보기위해 만든 main 함수 제출시엔 필요없다
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 6;
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};
        solution.solution(n, arr1, arr2);
    }

    static class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];

            for (int i = 0; i < n; i++) {
                String binaryNum1 = Integer.toBinaryString(arr1[i]);
                String binaryNum2 = Integer.toBinaryString(arr2[i]);    //Integer클래스에 포함된 toBinaryString 함수를 사용
                //인자값으로 전달받은 정수를 이진수 문자열로 변환해서 반환해주는 함수
                String line = "";

                while (binaryNum1.length() < n) {   //이진수길이가 지도의 길이(n)보다 작을경우 지도의 길이만큼 앞에 0을 추가한다
                    binaryNum1 = "0" + binaryNum1;
                }

                while (binaryNum2.length() < n) {
                    binaryNum2 = "0" + binaryNum2;
                }

                for (int j = 0; j < binaryNum1.length(); j++) {
                    if (binaryNum1.charAt(j) == '1' || binaryNum2.charAt(j) == '1') //지도1과 지도2의 j번째의 값이 하나라도 1(벽)인 경우 "#"
                        line = line + "#";
                    else                                                    //모두 공백인경우 " "을 line 변수에 더한다
                        line = line + " ";
                }
                answer[i] = line;   //지도의 i번째줄에 해독한 line변수값을 저장한다
            }
            return answer;  //반환형이 String[] 이므로 문자열배열 answer 반환함
        }
    }
}
