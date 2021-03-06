package com.cemah.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.entities.personnel;

public class PersonnelMapper implements RowMapper<personnel> {
	private personnel person;
	
	public PersonnelMapper(personnel Per ){
		this.person = Per;
	}

	@Override
	public personnel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
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
