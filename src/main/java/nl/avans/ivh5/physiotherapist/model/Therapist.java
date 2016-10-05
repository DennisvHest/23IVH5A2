package nl.avans.ivh5.physiotherapist.model;

import java.util.Date;

/**
 *
 * @author Dennis
 */
public class Therapist {
    
    private int therapistId;
    private int therapistSSN;
    private String therapistFirstName;
    private String therapistLastName;
    private int therapistAge;
    private Date dateStart;
    private String therapistStreet;
    private int therapistHouseNr;
    private String therapistTelephoneNr;
    private String therapistMobileNr;
    private Date therapistBirthdate;
    private String ZIPCode;
    private String therapistEmail;
    private String therapistNote;
    
    public Therapist() {}

    public Therapist(int therapistId, int therapistSSN, String therapistFirstName, String therapistLastName, int therapistAge, Date dateStart, String therapistStreet, int therapistHouseNr, String therapistTelephoneNr, String therapistMobileNr, Date therapistBirthdate, String ZIPCode, String therapistEmail, String therapistNote) {
        this.therapistId = therapistId;
        this.therapistSSN = therapistSSN;
        this.therapistFirstName = therapistFirstName;
        this.therapistLastName = therapistLastName;
        this.therapistAge = therapistAge;
        this.dateStart = dateStart;
        this.therapistStreet = therapistStreet;
        this.therapistHouseNr = therapistHouseNr;
        this.therapistTelephoneNr = therapistTelephoneNr;
        this.therapistMobileNr = therapistMobileNr;
        this.therapistBirthdate = therapistBirthdate;
        this.ZIPCode = ZIPCode;
        this.therapistEmail = therapistEmail;
        this.therapistNote = therapistNote;
    }

    //Getters
    public int getTherapistId() {
        return therapistId;
    }

    public int getTherapistSSN() {
        return therapistSSN;
    }

    public String getTherapistFirstName() {
        return therapistFirstName;
    }

    public String getTherapistLastName() {
        return therapistLastName;
    }

    public int getTherapistAge() {
        return therapistAge;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public String getTherapistStreet() {
        return therapistStreet;
    }

    public int getTherapistHouseNr() {
        return therapistHouseNr;
    }

    public String getTherapistTelephoneNr() {
        return therapistTelephoneNr;
    }

    public String getTherapistMobileNr() {
        return therapistMobileNr;
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

    public String getTherapistNote() {
        return therapistNote;
    }
    
}
