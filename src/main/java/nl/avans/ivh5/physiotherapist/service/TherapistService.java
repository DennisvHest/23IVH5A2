package nl.avans.ivh5.physiotherapist.service;

import java.util.List;
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
     * @return the list of Therapist-objects
     */
    public List<Therapist> findAllTherapists() {
        return therapistRepository.findAll();
    }

    /**
     * Returns the Therapist-object with the given id found by the TherapistRepository
     * @param id of the Therapist
     * @return the found Therapist
     */
    public Therapist findTherapist(int id) {
        return therapistRepository.findTherapistById(id);
    }
    
}
