/**
 * 
 */
package com.tcs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.tcs.model.Professor;

/**
 * @author springuser21
 *
 */
public class ProfessorMapper implements  RowMapper<Professor>{
	
	public Professor mapRow (ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Professor professor = new Professor();
		professor.setPid(rs.getInt("pid"));
		professor.setPname(rs.getString("pname"));
		professor.setPphone(rs.getInt("pphone"));
		professor.setPemail(rs.getString("pemail"));
		
		return professor;
		

	}


}
