package date_22_09_29;

public class Electronic {
    String productNo;
    String modelName;
    private CompanyName companyName;
    String dateOfMade;
    AuthMethod[] authMethod;

    public enum CompanyName {
        SAMSUNG, LG, APPLE
    }

    public enum AuthMethod {
        FINGER,
        PATTERN,
        FIN,
        FACE
    }

    public Electronic(String productNo, String modelName, CompanyName companyName, String dateOfMade, AuthMethod[] authMethod) {
        this.productNo = productNo;
        this.modelName = modelName;
        this.companyName = companyName;
        this.dateOfMade = dateOfMade;
        this.authMethod = authMethod;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }

    public String getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(String dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public AuthMethod[] getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(AuthMethod[] authMethod) {
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
