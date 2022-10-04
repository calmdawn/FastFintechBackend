package date_22_09_29;

public class MobileElectronic extends Electronic{
    private Communication communicationMethod;
    private int weight;

    public MobileElectronic(String productNo, String modelName, CompanyName companyName, String dateOfMade, AuthMethod[] authMethod, Communication communicationMethod, int weight) {
        super(productNo, modelName, companyName, dateOfMade, authMethod);
        this.communicationMethod = communicationMethod;
        this.weight = weight;
    }

    public Communication getCommunicationMethod() {
        return communicationMethod;
    }

    public void setCommunicationMethod(Communication communicationMethod) {
        this.communicationMethod = communicationMethod;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
