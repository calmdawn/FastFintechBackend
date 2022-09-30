package date_22_09_26;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();  //문자열 입력받기
        int[] useCounts = new int[26];  //알파벳 A ~ Z 까지 사용된 횟수를 저장할 배열
        int maxCount = 0;   // 특정 알파벳이 가장 많이나온 빈도수를 저장한 값
        int moreMax = 0;    // 최대빈도수를 가진 값이 몇개가 있는지
        char result = '\0'; // 정답을 출력할 문자를 저장할 변수

        word = word.toUpperCase();  //먼저 입력받은 문자열을 전부다 대문자로 바꾸어준다
        for (int i = 0; i < word.length(); i++) {
            useCounts[word.charAt(i) - 'A']++;  //문자열의 i번째 위치의 문자가 사용된 횟수를 1증가시켜 저장한다
                                                //word.charAt(i)가 'A'라면, 'A'-'A' 연산 -> 아스키코드 65-65가되어 0이됨
                                                //결국 useCounts[0]++ 이 된다.
        }

        for (int i = 0; i < useCounts.length; i++) {    //최대빈도수를 구해서 maxCount 변수에 저장함
            maxCount = Math.max(maxCount, useCounts[i]);
        }

        for (int i = 0; i < 26; i++) {
            if ((maxCount == useCounts[i]) && moreMax == 0) {   //최대빈도수에 해당하는 알파벳 && 가장많이 사용된 알파벳이 1개인경우
               result = (char) (i + 'A');
                moreMax++;
            } else if ((maxCount == useCounts[i]) && moreMax > 0) {  //최대빈도수에 해당하는 알파벳 && 가장많이 사용된 알파벳이 2개 이상인경우
                result = '?';
                break;
            }
        }
        System.out.println(result); //결과값 출력
    }
}
