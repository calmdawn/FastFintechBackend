package date_22_09_29;

public class Tablet extends NoneMobileElectronic{
    boolean hasPencil;

    public Tablet(int productNo, String modelName, String companyName, String dateOfMade, Auth authMethod, String address, boolean hasPencil) {
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
