package nl.avans.ivh5.treatments.model;

/**
 *
 * @author Dennis
 */
public class Treatment {
    
    private int treatmentCode;
    private String treatmentName;
    private int sessionAmount;
    private double sessionTime;
    private double treatmentRate;

    public Treatment() {
    }

    public Treatment(int treatmentCode, String treatmentName, int sessionAmount, double sessionTime, double treatmentRate) {
        this.treatmentCode = treatmentCode;
        this.treatmentName = treatmentName;
        this.sessionAmount = sessionAmount;
        this.sessionTime = sessionTime;
        this.treatmentRate = treatmentRate;
    }

    public int getTreatmentCode() {
        return treatmentCode;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public int getSessionAmount() {
        return sessionAmount;
    }

    public double getSessionTime() {
        return sessionTime;
    }

    public double getTreatmentRate() {
        return treatmentRate;
    }
    
    
}
