package nl.avans.ivh5.physiotherapist.controller;

import java.util.List;
import nl.avans.ivh5.physiotherapist.model.Therapist;
import nl.avans.ivh5.physiotherapist.service.TherapistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Dennis
 */

@Controller
public class TherapistController {
    
    private final TherapistService therapistService;
    
    @Autowired
    public TherapistController(TherapistService therapistService) {
        this.therapistService = therapistService;
    }
    
    /**
     * Generates a list of all Therapists in the database
     * @param model for inserting therapists into the HTML-page
     * @return the HTML-page with the therapist-list
     */
    @RequestMapping(value = "/therapeut", method = RequestMethod.GET)
    public String listTherapists(Model model) {
        List<Therapist> therapists = therapistService.findAllTherapists();
        
        model.addAttribute("therapists", therapists);
        
        return "views/therapist/list";
    }
    
    /**
     * Returns the HTML-page of the Therapist with the given id
     * @param model for inserting therapists into the HTML-page
     * @param id of the Therapist
     * @return the HTML-page
     */
    @RequestMapping(value = "/therapeut/{id}", method = RequestMethod.GET)
    public String listTherapist(Model model, @PathVariable int id) {
        Therapist therapist = therapistService.findTherapist(id);
        
        model.addAttribute("therapist", therapist);
        
        return "views/therapist/read";
    }
}
