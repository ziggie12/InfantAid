package muzinda.sharon.testresources.model;
//This class describes the type of data objects required

public class AidPage {
private String emergencyAlert;
    private String emergencyDiagnosis[];
    private String emergencyResponse[];

    private int alertID;

    public AidPage(String emergencyAlert, String[] emergencyDiagnosis, String[] emergencyResponse) {
        this.emergencyAlert = emergencyAlert;
        this.emergencyDiagnosis = emergencyDiagnosis;
        this.emergencyResponse = emergencyResponse;
    }

    public String getEmergencyAlert() {
        return emergencyAlert;
    }

    public void setEmergencyAlert(String emergencyAlert) {
        this.emergencyAlert = emergencyAlert;
    }

 public String[] getEmergencyDiagnosis() {
        return emergencyDiagnosis;
    }

    public void setEmergencyDiagnosis(String[] emergencyDiagnosis) {
        this.emergencyDiagnosis = emergencyDiagnosis;
    }

    public String[] getEmergencyResponse() {
        return emergencyResponse;
    }

    public void setEmergencyResponse(String[] emergencyResponse) {
        this.emergencyResponse = emergencyResponse;
    }

}
