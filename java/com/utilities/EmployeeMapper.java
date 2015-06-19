package com.utilities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.entities.employee;
import com.entities.personnel;

public class EmployeeMapper implements RowMapper<personnel> {

	@Override
	public personnel mapRow(ResultSet rs, int rowNum) throws SQLException {
		employee person = new employee(); 
		person.setId((long) rs.getInt("ID"));
	       person.setFirstName(rs.getString("firstName"));
	       person.setLastName(rs.getString("lastName"));
	       person.setStartDate(rs.getDate("startDate"));
	       person.setEndDate(rs.getDate("endDate"));
	       person.setEmail(rs.getString("email"));
	       person.setLogin(rs.getString("login"));
	       person.setPassword(rs.getString("password"));
	       
	       return person;
			}

}
