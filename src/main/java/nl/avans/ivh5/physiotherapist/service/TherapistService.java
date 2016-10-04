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
    
    public List<Therapist> findAllTherapists() {
        return therapistRepository.findAll();
    }
}
