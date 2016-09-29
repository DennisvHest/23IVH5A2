package nl.avans.ivh5.physiotherapist.model;

import java.util.Date;

/**
 *
 * @author Dennis
 */
public class Therapist {
    
    private int therapistId;
    private int therapistSSN;
    private String therapistAddress;
    private String therapistTelephoneNr;
    private Date therapistBirthdate;
    private String ZIPCode;
    private String therapistEmail;

    public Therapist(int therapistId, int therapistSSN, String therapistAddress, String therapistTelephoneNr, Date therapistBirthdate, String ZIPCode, String therapistEmail) {
        this.therapistId = therapistId;
        this.therapistSSN = therapistSSN;
        this.therapistAddress = therapistAddress;
        this.therapistTelephoneNr = therapistTelephoneNr;
        this.therapistBirthdate = therapistBirthdate;
        this.ZIPCode = ZIPCode;
        this.therapistEmail = therapistEmail;
    }
}
