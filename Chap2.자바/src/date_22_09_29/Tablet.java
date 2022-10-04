package date_22_09_29;

public class Tablet extends NoneMobileElectronic{
    boolean hasPencil;

    public Tablet(String productNo, String modelName, CompanyName companyName, String dateOfMade, AuthMethod[] authMethod, String address, boolean hasPencil) {
        super(productNo, modelName, companyName, dateOfMade, authMethod, address);
        this.hasPencil = hasPencil;
    }

    public boolean isHasPencil() {
        return hasPencil;
    }

    public void setHasPencil(boolean hasPencil) {
        this.hasPencil = hasPencil;
    }
}
