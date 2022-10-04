package date_22_09_29;

public class SmartTV extends NoneMobileElectronic {
    int inch;

    public SmartTV(int productNo, String modelName, String companyName, String dateOfMade, Auth authMethod, String address, int inch) {
        super(productNo, modelName, companyName, dateOfMade, authMethod, address);
        this.inch = inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
}
