package nl.avans.ivh5.physiotherapist.service;

import java.util.List;
import nl.avans.ivh5.exceptions.PasswordRepeatNotIdenticalException;
import nl.avans.ivh5.physiotherapist.dataaccess.TherapistRepository;
import nl.avans.ivh5.physiotherapist.model.Therapist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dennis
 */
@Service
public class TherapistService {

    private TherapistRepository therapistRepository;

    @Autowired
    public TherapistService(TherapistRepository therapistRepository) {
        this.therapistRepository = therapistRepository;
    }

    /**
     * Returns the list of Therapist-objects found by the TherapistRepository
     *
     * @return the list of Therapist-objects
     */
    public List<Therapist> findAllTherapists() {
        return therapistRepository.findAll();
    }

    /**
     * Returns the Therapist-object with the given id found by the
     * TherapistRepository
     *
     * @param id of the Therapist
     * @return the found Therapist
     */
    public Therapist findTherapist(int id) {
        return therapistRepository.findTherapistById(id);
    }

    /**
     * Asks the TherapistRepository to change the Therapists data in the
     * database
     *
     * @param therapist to be changed
     * @param passwordRepeat for checking if the passwordRepeat is identical to
     * the new password
     * @throws nl.avans.ivh5.exceptions.PasswordRepeatNotIdenticalException if
     * the new password is not identical to the passwordRepeat
     */
    public void changeTherapist(Therapist therapist, String passwordRepeat) throws PasswordRepeatNotIdenticalException {
        if (checkPasswordRepeat(therapist.getPassword(), passwordRepeat)) {
            therapistRepository.saveTherapist(therapist);
        } else {
            throw new PasswordRepeatNotIdenticalException("The new password is not identical to the password repeat");
        }
    }

    /**
     * Checks if the new password is identical to the passwordRepeat
     *
     * @param password new password
     * @param passwordRepeat repeat of the new password
     * @return boolean (true = identical, false = not identical)
     */
    public boolean checkPasswordRepeat(String password, String passwordRepeat) {
        return password.equals(passwordRepeat);
    }

//    public List<Therapist> findTherapistsByTerm(String term) {
//        
//    }
}
