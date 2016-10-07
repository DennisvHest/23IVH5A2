package nl.avans.ivh5.exceptions;

/**
 *
 * @author Dennis
 */
public class PasswordRepeatNotIdenticalException extends Exception{
    
    public PasswordRepeatNotIdenticalException (String message) {
        super (message);
        System.out.println("PasswordRepeatNotIdenticalException: Het ingevulde wachtwoord is niet gelijk met het herhaalde wachtwoord.");
    }
    
}
