package nl.avans.ivh5.physiotherapist.controller;

import nl.avans.ivh5.physiotherapist.dataaccess.TherapistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Dennis
 */

@Controller
public class TherapistController {
    
    private final TherapistRepository therapistRepository;
    
    @Autowired
    public TherapistController(TherapistRepository therapistRepository) {
        this.therapistRepository = therapistRepository;
    }
    
    @RequestMapping(value = "/therapist", method = RequestMethod.GET)
    public String listTherapists(Model model) {
        return "view/therapist/list";
    }
}
