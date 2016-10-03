package nl.avans.ivh5.physiotherapist.model;

import java.util.Date;

/**
 *
 * @author Dennis
 */
public class Therapist {
    
    private int therapistId;
    private int therapistSSN;
    private String therapistName;
    private int therapistAge;
    private Date dateStart;
    private String therapistAddress;
    private String therapistTelephoneNr;
    private Date therapistBirthdate;
    private String ZIPCode;
    private String therapistEmail;
    
    public Therapist() {}

    public Therapist(int therapistId, int therapistSSN, String therapistName, Date dateStart, String therapistAddress, String therapistTelephoneNr, Date therapistBirthdate, String ZIPCode, String therapistEmail) {
        this.therapistId = therapistId;
        this.therapistSSN = therapistSSN;
        this.therapistName = therapistName;
        this.dateStart = dateStart;
        this.therapistAddress = therapistAddress;
        this.therapistTelephoneNr = therapistTelephoneNr;
        this.therapistBirthdate = therapistBirthdate;
        this.ZIPCode = ZIPCode;
        this.therapistEmail = therapistEmail;
        
        therapistAge = new Date().getYear() - therapistBirthdate.getYear();
    }
    
    //Getters
    public int getTherapistId() {
        return therapistId;
    }

    public int getTherapistSSN() {
        return therapistSSN;
    }

    public String getTherapistName() {
        return therapistName;
    }

    public int getTherapistAge() {
        return therapistAge;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public String getTherapistAddress() {
        return therapistAddress;
    }

    public String getTherapistTelephoneNr() {
        return therapistTelephoneNr;
    }

    public Date getTherapistBirthdate() {
        return therapistBirthdate;
    }

    public String getZIPCode() {
        return ZIPCode;
    }

    public String getTherapistEmail() {
        return therapistEmail;
    }
    
    //Setters
    public void setTherapistId(int therapistId) {
        this.therapistId = therapistId;
    }

    public void setTherapistSSN(int therapistSSN) {
        this.therapistSSN = therapistSSN;
    }

    public void setTherapistName(String therapistName) {
        this.therapistName = therapistName;
    }

    public void setTherapistAge(int therapistAge) {
        this.therapistAge = therapistAge;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public void setTherapistAddress(String therapistAddress) {
        this.therapistAddress = therapistAddress;
    }

    public void setTherapistTelephoneNr(String therapistTelephoneNr) {
        this.therapistTelephoneNr = therapistTelephoneNr;
    }

    public void setTherapistBirthdate(Date therapistBirthdate) {
        this.therapistBirthdate = therapistBirthdate;
    }

    public void setZIPCode(String ZIPCode) {
        this.ZIPCode = ZIPCode;
    }

    public void setTherapistEmail(String therapistEmail) {
        this.therapistEmail = therapistEmail;
    }
    
}
