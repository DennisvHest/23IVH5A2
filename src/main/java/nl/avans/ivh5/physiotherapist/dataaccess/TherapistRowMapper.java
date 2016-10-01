package nl.avans.ivh5.physiotherapist.dataaccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import nl.avans.ivh5.physiotherapist.model.Therapist;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Dennis
 */
class TherapistRowMapper implements RowMapper<Therapist> {

    /**
     * Maps the database attributes of a Therapist
     * to a new Therapist object
     * @param rs resultset from the database
     * @param i rownumber
     * @return the new Therapist-object
     * @throws SQLException 
     */
    @Override
    public Therapist mapRow(ResultSet rs, int i) throws SQLException {
        int therapistId = rs.getInt("id");
        String therapistName = rs.getString("firstname") + " " + rs.getString("lastname");
        Date dateStart = new Date();//rs.getDate("datestart");
        int therapistSSN = 1234567;//rs.getInt("bsn");
        Date therapistBirthDate = rs.getDate("dateofbirth");
        String therapistAddress = rs.getString("street") + " " + rs.getInt("number");
        String therapistTelephoneNr = rs.getString("phone");
        String therapistZIPCode = rs.getString("postalcode");
        String therapistEmail = rs.getString("email");
        
        return new Therapist(therapistId, therapistSSN, therapistName, dateStart, therapistAddress, therapistTelephoneNr, therapistBirthDate, therapistZIPCode, therapistEmail);
    }
    
}
