/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.avans.ivh5.treatments.dataaccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Dennis
 */
public class TreatmentCodeRowMapper implements RowMapper<Integer>{

    @Override
    public Integer mapRow(ResultSet rs, int i) throws SQLException {
        return rs.getInt("treatmentcode");
    }
}
