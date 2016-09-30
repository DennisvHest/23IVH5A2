package nl.avans.ivh5.treatments.controller;

import java.util.List;
import nl.avans.ivh5.treatments.dataaccess.TreatmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Dennis
 */

@RestController
@RequestMapping("/api")
public class TreatmentAPIController {
    
    private TreatmentRepository treatmentRepository;
    
    @Autowired
    public TreatmentAPIController(TreatmentRepository treatmentRepository) {
        this.treatmentRepository = treatmentRepository;
    }
    
    @RequestMapping(value = "/personen/{id}/behandelingen", method = RequestMethod.GET)
    public List<Integer> findTreatmentsByClientId(@PathVariable int id) {
        return treatmentRepository.findTreatmentsByClientId(id);
    }
}
