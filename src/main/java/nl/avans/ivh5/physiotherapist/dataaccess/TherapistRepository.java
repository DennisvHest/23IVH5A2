package nl.avans.ivh5.physiotherapist.dataaccess;

import java.util.List;
import nl.avans.ivh5.physiotherapist.model.Therapist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Dennis
 */

@Repository
public class TherapistRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Find all Therapists in the database
     * @return the list of Therapists
     */
    public List<Therapist> findAll() {
        return jdbcTemplate.query(
                "SELECT id, firstname, lastname, datestart, dateofbirth, street, number, postalcode, bsn, phone, email "
                        + "FROM physiotherapist", 
                new TherapistRowMapper());
    }

    /**
     * Find the Therapist with the given id
     * @param id of the Therapist
     * @return the found Therapist
     */
    public Therapist findTherapistById(int id) {
        return jdbcTemplate.queryForObject("SELECT id, firstname, lastname, datestart, dateofbirth, street, number, postalcode, bsn, phone, email FROM physiotherapist WHERE id = ?", new Object[]{id}, new TherapistRowMapper());
    }
    
}
