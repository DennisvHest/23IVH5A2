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
     * Maps the database attributes of a Therapist to a new Therapist object
     *
     * @param rs resultset from the database
     * @param i rownumber
     * @return the new Therapist-object
     * @throws SQLException
     */
    @Override
    public Therapist mapRow(ResultSet rs, int i) throws SQLException {
        int therapistId = rs.getInt("id");
        String therapistFirstName = rs.getString("firstname");
        String therapistLastName = rs.getString("lastname");
        Date dateStart = rs.getDate("datestart");
        int therapistSSN = rs.getInt("ssn");
        Date therapistBirthDate = rs.getDate("dateofbirth");
        String therapistStreet = rs.getString("street");
        int therapistHouseNr = rs.getInt("number");
        String therapistTelephoneNr = rs.getString("phone");
        String therapistMobileNr = rs.getString("mobile");
        String therapistZIPCode = rs.getString("postalcode");
        String therapistEmail = rs.getString("email");
        String therapistNote = rs.getString("note");
        String password = rs.getString("password");

        return new Therapist(therapistId, therapistSSN, therapistFirstName, therapistLastName, therapistSSN, dateStart, therapistStreet, therapistHouseNr, therapistTelephoneNr, therapistMobileNr, therapistBirthDate, therapistZIPCode, therapistEmail, therapistNote, password);

    }

}
