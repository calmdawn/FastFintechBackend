package date_22_09_29;

public class SmartPhone extends MobileElectronic{
    int numOfCameras;
    int numOfSensors;

    public SmartPhone(String productNo, String modelName, CompanyName companyName, String dateOfMade, AuthMethod[] authMethod, Communication communicationMethod, int weight, int numOfCameras, int numOfSensors) {
        super(productNo, modelName, companyName, dateOfMade, authMethod, communicationMethod, weight);
        this.numOfCameras = numOfCameras;
        this.numOfSensors = numOfSensors;
    }

    public int getNumOfCameras() {
        return numOfCameras;
    }

    public void setNumOfCameras(int numOfCameras) {
        this.numOfCameras = numOfCameras;
    }

    public int getNumOfSensors() {
        return numOfSensors;
    }

    public void setNumOfSensors(int numOfSensors) {
        this.numOfSensors = numOfSensors;
    }
}
