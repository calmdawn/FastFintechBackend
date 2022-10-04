package date_22_09_29;

import java.util.Arrays;

public class Practice03 {
    public static void main(String[] args) {
        /**
         * 실습2
         * - 현재 제품들을 `companyName`으로 분류하는 함수를 작성하시오.
         * - `companyName`은 SUMSUNG, LG, APPLE만 Enum형으로 들어올 수 있다고 가정
         * - `Electronics[] groupByCompanyName()`
         * */
        Electronics electronics = new Electronics(new Electronic[]{
                new Electronic("0001", "", Electronic.CompanyName.SAMSUNG, "220110", new Electronic.AuthMethod[]{Electronic.AuthMethod.FIN, Electronic.AuthMethod.FACE}),
                new Electronic("0002", "", Electronic.CompanyName.LG, "211010", new Electronic.AuthMethod[]{Electronic.AuthMethod.FIN, Electronic.AuthMethod.PATTERN}),
                new Electronic("0003", "", Electronic.CompanyName.APPLE, "220722", new Electronic.AuthMethod[]{Electronic.AuthMethod.FIN}),
                new Electronic("0004", "", Electronic.CompanyName.SAMSUNG, "220310", new Electronic.AuthMethod[]{Electronic.AuthMethod.FIN, Electronic.AuthMethod.FINGER}),
                new Electronic("0005", "", Electronic.CompanyName.LG, "210722", new Electronic.AuthMethod[]{Electronic.AuthMethod.FIN, Electronic.AuthMethod.FINGER, Electronic.AuthMethod.PATTERN, Electronic.AuthMethod.FACE}),
                new Electronic("0006", "", Electronic.CompanyName.APPLE, "200310", new Electronic.AuthMethod[]{Electronic.AuthMethod.FIN, Electronic.AuthMethod.FINGER})});

        Electronics[] groupByResults = electronics.groupByCompanyName();
        // groupByResults[0]: SAMSUNG
        // groupByResults[1]: LG
        // groupByResults[2]: APPLE
        System.out.println(Arrays.toString(groupByResults[0].electronics));
        System.out.println(Arrays.toString(groupByResults[1].electronics));
        System.out.println(Arrays.toString(groupByResults[2].electronics));
    }
}
