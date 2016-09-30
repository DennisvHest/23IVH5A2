package nl.avans.ivh5.physiotherapist.dataaccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import nl.avans.ivh5.physiotherapist.model.Therapist;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Dennis
 */
class TherapistRowMapper implements RowMapper<Therapist> {

    @Override
    public Therapist mapRow(ResultSet rs, int i) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
