package nl.avans.ivh5.physiotherapist.model;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

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

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateStart;

    private String therapistStreet;
    private int therapistHouseNr;
    private String therapistTelephoneNr;
    private String therapistMobileNr;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date therapistBirthdate;

    private String ZIPCode;
    private String therapistEmail;
    private String therapistNote;
    private String password;

    public Therapist() {
    }

    public Therapist(int therapistId, int therapistSSN, String therapistFirstName, String therapistLastName, int therapistAge, Date dateStart, String therapistStreet, int therapistHouseNr, String therapistTelephoneNr, String therapistMobileNr, Date therapistBirthdate, String ZIPCode, String therapistEmail, String therapistNote, String password) {
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
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    //Setters
    public void setTherapistId(int therapistId) {
        this.therapistId = therapistId;
    }

    public void setTherapistSSN(int therapistSSN) {
        this.therapistSSN = therapistSSN;
    }

    public void setTherapistFirstName(String therapistFirstName) {
        this.therapistFirstName = therapistFirstName;
    }

    public void setTherapistLastName(String therapistLastName) {
        this.therapistLastName = therapistLastName;
    }

    public void setTherapistAge(int therapistAge) {
        this.therapistAge = therapistAge;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public void setTherapistStreet(String therapistStreet) {
        this.therapistStreet = therapistStreet;
    }

    public void setTherapistHouseNr(int therapistHouseNr) {
        this.therapistHouseNr = therapistHouseNr;
    }

    public void setTherapistTelephoneNr(String therapistTelephoneNr) {
        this.therapistTelephoneNr = therapistTelephoneNr;
    }

    public void setTherapistMobileNr(String therapistMobileNr) {
        this.therapistMobileNr = therapistMobileNr;
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

    public void setTherapistNote(String therapistNote) {
        this.therapistNote = therapistNote;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
