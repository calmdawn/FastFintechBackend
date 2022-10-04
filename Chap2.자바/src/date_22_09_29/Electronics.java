package date_22_09_29;

import java.util.ArrayList;
import java.util.List;

public class Electronics {
    Electronic[] electronics;

    public Electronics(Electronic[] electronics) {
        this.electronics = electronics;
    }


    /**
     * 실습 2 - 전자제품 일련번호 `productNo`가 주어졌을 때 해당 일련번호에 해당하는 전자제품을 반환하는 함수를 작성하시오.
     * */

    public Electronic findByProductNo(String productNo) {
        for (int i = 0; i < electronics.length; i++) {
            if(electronics[i].getProductNo().equals(productNo)){    //전자제품 일련번호가 같은경우
                return electronics[i];  //해당하는 전자제품을 반환한다
            }
        }
        return null;    //해당 일련번호가 존재하지않는 경우 null값(존재하지않음)을 반환한다.
    }

    /**
     * 실습 3 - 현재 제품들을 companyName으로 분류하는 함수를 작성하시오.
     * */
    public Electronics[] groupByCompanyName() {
        Electronics[] groupByResults = new Electronics[3];
        for (int i = 0; i < 3; i++) {
            groupByResults[i] = new Electronics(null);
        }
        List<Electronic> samsungList = new ArrayList<>();
        List<Electronic> lgList = new ArrayList<>();
        List<Electronic> appleList = new ArrayList<>();
        for (int i = 0; i <electronics.length; i++) {
            if(electronics[i].getCompanyName().equals(Electronic.CompanyName.SAMSUNG)){
                samsungList.add(electronics[i]);
            }else if(electronics[i].getCompanyName().equals(Electronic.CompanyName.LG)){
                lgList.add(electronics[i]);
            }else if(electronics[i].getCompanyName().equals(Electronic.CompanyName.APPLE)){
                appleList.add(electronics[i]);
            }
        }
        groupByResults[0].electronics = samsungList.toArray(new Electronic[0]);
        groupByResults[1].electronics = lgList.toArray(new Electronic[0]);
        groupByResults[2].electronics = appleList.toArray(new Electronic[0]);
        return groupByResults;
    }
}
