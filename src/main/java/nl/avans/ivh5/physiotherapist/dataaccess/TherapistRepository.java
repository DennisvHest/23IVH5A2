package nl.avans.ivh5.physiotherapist.dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
     *
     * @return the list of Therapists
     */
    public List<Therapist> findAll() {
        return jdbcTemplate.query("SELECT * FROM physiotherapist", new TherapistRowMapper());
    }

    /**
     * Find the Therapist with the given id
     *
     * @param id of the Therapist
     * @return the found Therapist
     */
    public Therapist findTherapistById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM physiotherapist WHERE id = ?", new Object[]{id}, new TherapistRowMapper());
    }

    /**
     * Updates the database with the changed Therapist
     * @param therapist to be changed
     */
    public void saveTherapist(Therapist therapist) {
        String sql = "UPDATE physiotherapist "
                + "SET firstname=?, lastname=?, datestart=?, dateofbirth=?, street=?, "
                + "number=?, postalcode=?, ssn=?, phone=?, mobile=?, email=?, note=? "
                + "WHERE id = ?";

        jdbcTemplate.update((Connection connection) -> {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, therapist.getTherapistFirstName());
            ps.setString(2, therapist.getTherapistLastName());
            
            //Changing java.util.Date to java.sql.Date for the database
            ps.setDate(3, new java.sql.Date(therapist.getDateStart().getTime()));
            ps.setDate(4, new java.sql.Date(therapist.getTherapistBirthdate().getTime()));
            
            ps.setString(5, therapist.getTherapistStreet());
            ps.setInt(6, therapist.getTherapistHouseNr());
            ps.setString(7, therapist.getZIPCode());
            ps.setInt(8, therapist.getTherapistSSN());
            ps.setString(9, therapist.getTherapistTelephoneNr());
            ps.setString(10, therapist.getTherapistMobileNr());
            ps.setString(11, therapist.getTherapistEmail());
            ps.setString(12, therapist.getTherapistNote());
            ps.setInt(13, therapist.getTherapistId());
            return ps;
        });
    }

}
