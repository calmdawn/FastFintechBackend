package toyproject1.customer;

public class Customer {
    static int uniqueNum = 1000;
    int serialNO;
    String name;
    String userID;
    int spentTime;
    int totalPay;

    public Customer() {
        serialNO = uniqueNum;
        uniqueNum++;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "serialNO='" + serialNO + '\'' +
                ", name='" + name + '\'' +
                ", userID='" + userID + '\'' +
                ", spentTime=" + spentTime +
                ", totalPay=" + totalPay +
                '}';
    }
}
