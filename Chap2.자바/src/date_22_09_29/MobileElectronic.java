package date_22_09_29;

public class MobileElectronic extends Electronic{
    private Communication communicationMethod;
    private int weight;

    public MobileElectronic(int productNo, String modelName, String companyName, String dateOfMade, Auth authMethod, Communication communicationMethod, int weight) {
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
