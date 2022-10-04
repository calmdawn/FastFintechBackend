package date_22_09_29;

public class NoneMobileElectronic extends Electronic{
    private String address;

    public NoneMobileElectronic(String productNo, String modelName, CompanyName companyName, String dateOfMade, AuthMethod[] authMethod, String address) {
        super(productNo, modelName, companyName, dateOfMade, authMethod);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
