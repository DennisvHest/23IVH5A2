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
    public void testGetTherapistName() {
        System.out.println("getTherapistName");
        Therapist instance = new Therapist();
        instance.setTherapistName("Jannie de Bruijn");
        String expResult = "Jannie de Bruijn";
        String result = instance.getTherapistName();
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
     * Test of getTherapistAddress method, of class Therapist.
     */
    @Test
    public void testGetTherapistAddress() {
        System.out.println("getTherapistAddress");
        Therapist instance = new Therapist();
        instance.setTherapistAddress("eenstraat 12");
        String expResult = "eenstraat 12";
        String result = instance.getTherapistAddress();
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
    
}
