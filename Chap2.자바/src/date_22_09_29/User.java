package date_22_09_29;

public class User {
    Member member;
    Electronic electronicDevice;
    String paymentPolicy;

    public User(Member member, Electronic electronicDevice, String paymentPolicy) {
        this.member = member;
        this.electronicDevice = electronicDevice;
        this.paymentPolicy = paymentPolicy;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Electronic getElectronicDevice() {
        return electronicDevice;
    }

    public void setElectronicDevice(Electronic electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    public String getPaymentPolicy() {
        return paymentPolicy;
    }

    public void setPaymentPolicy(String paymentPolicy) {
        this.paymentPolicy = paymentPolicy;
    }
}
