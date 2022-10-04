package date_22_09_29;

public class Electronic {
    private int productNo;
    private String modelName;
    private Company companyName;
    private String dateOfMade;
    private Auth authMethod;

    public Electronic(int productNo, String modelName, Company companyName, String dateOfMade, Auth authMethod) {
        this.productNo = productNo;
        this.modelName = modelName;
        this.companyName = companyName;
        this.dateOfMade = dateOfMade;
        this.authMethod = authMethod;
    }

    public int getProductNo() {
        return productNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Company getCompanyName() {
        return companyName;
    }

    public void setCompanyName(Company companyName) {
        this.companyName = companyName;
    }

    public String getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(String dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public Auth getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(Auth authMethod) {
        this.authMethod = authMethod;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "productNo=" + productNo +
                ", modelName='" + modelName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", dateOfMade='" + dateOfMade + '\'' +
                ", authMethod=" + authMethod +
                '}';
    }
}
