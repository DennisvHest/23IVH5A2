package nl.avans.ivh5.physiotherapist.model;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dennis
 */
public class TherapistTest {
    
    public TherapistTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTherapistId method, of class Therapist.
     */
    @Test
    public void testGetTherapistId() {
        System.out.println("getTherapistId");
        Therapist instance = new Therapist();
        instance.setTherapistId(1);
        int expResult = 1;
        int result = instance.getTherapistId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTherapistSSN method, of class Therapist.
     */
    @Test
    public void testGetTherapistSSN() {
        System.out.println("getTherapistSSN");
        Therapist instance = new Therapist();
        instance.setTherapistSSN(123456789);
        int expResult = 123456789;
        int result = instance.getTherapistSSN();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTherapistName method, of class Therapist.
     */
    @Test
    public void testGetTherapistFirstName() {
        System.out.println("getTherapistName");
        Therapist instance = new Therapist();
        instance.setTherapistFirstName("Jannie");
        String expResult = "Jannie";
        String result = instance.getTherapistFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTherapistAge method, of class Therapist.
     */
    @Test
    public void testGetTherapistAge() {
        System.out.println("getTherapistAge");
        Therapist instance = new Therapist();
        instance.setTherapistAge(48);
        int expResult = 48;
        int result = instance.getTherapistAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateStart method, of class Therapist.
     */
    @Test
    public void testGetDateStart() {
        System.out.println("getDateStart");
        Therapist instance = new Therapist();
        instance.setDateStart(new Date(2015, 8, 12));
        Date expResult = new Date(2015, 8, 12);
        Date result = instance.getDateStart();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTherapistTelephoneNr method, of class Therapist.
     */
    @Test
    public void testGetTherapistTelephoneNr() {
        System.out.println("getTherapistTelephoneNr");
        Therapist instance = new Therapist();
        instance.setTherapistTelephoneNr("0123456789");
        String expResult = "0123456789";
        String result = instance.getTherapistTelephoneNr();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTherapistBirthdate method, of class Therapist.
     */
    @Test
    public void testGetTherapistBirthdate() {
        System.out.println("getTherapistBirthdate");
        Therapist instance = new Therapist();
        instance.setTherapistBirthdate(new Date(1968, 3, 18));
        Date expResult = new Date(1968, 3, 18);
        Date result = instance.getTherapistBirthdate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getZIPCode method, of class Therapist.
     */
    @Test
    public void testGetZIPCode() {
        System.out.println("getZIPCode");
        Therapist instance = new Therapist();
        instance.setZIPCode("1234AB");
        String expResult = "1234AB";
        String result = instance.getZIPCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTherapistEmail method, of class Therapist.
     */
    @Test
    public void testGetTherapistEmail() {
        System.out.println("getTherapistEmail");
        Therapist instance = new Therapist();
        instance.setTherapistEmail("janniedebruijn@gmail.com");
        String expResult = "janniedebruijn@gmail.com";
        String result = instance.getTherapistEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTherapistLastName method, of class Therapist.
     */
    @Test
    public void testGetTherapistLastName() {
        System.out.println("getTherapistLastName");
        Therapist instance = new Therapist();
        instance.setTherapistLastName("de Bruijn");
        String expResult = "de Bruijn";
        String result = instance.getTherapistLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTherapistStreet method, of class Therapist.
     */
    @Test
    public void testGetTherapistStreet() {
        System.out.println("getTherapistStreet");
        Therapist instance = new Therapist();
        instance.setTherapistStreet("eenstraat");
        String expResult = "eenstraat";
        String result = instance.getTherapistStreet();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTherapistHouseNr method, of class Therapist.
     */
    @Test
    public void testGetTherapistHouseNr() {
        System.out.println("getTherapistHouseNr");
        Therapist instance = new Therapist();
        instance.setTherapistHouseNr(12);
        int expResult = 12;
        int result = instance.getTherapistHouseNr();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTherapistMobileNr method, of class Therapist.
     */
    @Test
    public void testGetTherapistMobileNr() {
        System.out.println("getTherapistMobileNr");
        Therapist instance = new Therapist();
        instance.setTherapistMobileNr("0612345678");
        String expResult = "0612345678";
        String result = instance.getTherapistMobileNr();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTherapistNote method, of class Therapist.
     */
    @Test
    public void testGetTherapistNote() {
        System.out.println("getTherapistNote");
        Therapist instance = new Therapist();
        instance.setTherapistNote("Ik weet het niet");
        String expResult = "Ik weet het niet";
        String result = instance.getTherapistNote();
        assertEquals(expResult, result);
    }
    
}
