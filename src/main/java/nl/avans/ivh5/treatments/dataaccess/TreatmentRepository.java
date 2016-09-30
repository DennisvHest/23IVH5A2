package nl.avans.ivh5.treatments.dataaccess;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dennis
 */

@Repository
public class TreatmentRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Transactional(readOnly=true)
    public List<Integer> findTreatmentsByClientId(int clientbsn) {
        return jdbcTemplate.query(
                "SELECT treatmentcode FROM `treatment` WHERE clientbsn = ?",
                new Object[]{clientbsn}, new TreatmentCodeRowMapper());
    }
}
