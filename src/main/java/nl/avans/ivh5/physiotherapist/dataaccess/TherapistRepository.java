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

    public List<Therapist> findAll() {
        return jdbcTemplate.query("SELECT * FROM physiotherapist", new TherapistRowMapper());
    }
    
}
