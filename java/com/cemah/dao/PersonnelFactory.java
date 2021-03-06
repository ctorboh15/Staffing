package com.cemah.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.entities.contractor;
import com.entities.employee;
import com.entities.personnel;
import com.utilities.ContractorMapper;
import com.utilities.EmployeeMapper;
import com.utilities.SqlUtility;

/**
 * 
 * @author cemah.tudae-torboh I wrote this class to give the flexibility of
 *         adding more types of employees and not having too many concrete
 *         implementations o of personnel Interface. All method have a @Param
 *         type which is used to decide what type of personnel to create. I
 *         abstracted Spring JDBC to this class as well to what I believe is
 *         cleaner code;
 */
public class PersonnelFactory {

	public String createWorker(String type) {

		switch (type) {
		case "Employee":
			return SqlUtility.getSQL("Create_Emp");
		case "Contractor":
			return SqlUtility.getSQL("Create_Con");
		}
		return null;

	}

	public personnel getWorker(String type, Long id, JdbcTemplate jdbcTemplate)
			throws ClassNotFoundException {

		switch (type) {
		case "Employee":
			employee employee = (employee) jdbcTemplate.queryForObject(
					SqlUtility.getSQL("Get_Emp"), new Object[] { id },
					new PersonnelMapper(new employee()));
			return employee;
		case "Contractor":
			contractor contractor = (contractor) jdbcTemplate.queryForObject(
					SqlUtility.getSQL("Get_Con"), new Object[] { id },
					new PersonnelMapper(new contractor()));
			return contractor;
		default:
			throw new ClassNotFoundException();
		}

	}

	public List<personnel> listWorkers(String type, JdbcTemplate jdbcTemplate)
			throws ClassNotFoundException {

		switch (type) {
		case "Employee":
			return jdbcTemplate.query(SqlUtility.getSQL("List_Emp"),
					new EmployeeMapper());
		case "Contractor":
			return jdbcTemplate.query(SqlUtility.getSQL("List_Con"),
					new ContractorMapper());
		default:
			throw new ClassNotFoundException();

		}
	}

	public String deleteWorker(String type) {
		switch (type) {
		case "Employee":
			return SqlUtility.getSQL("Delete_Emp");
		case "Contractor":
			return SqlUtility.getSQL("Delete_Con");

		}
		return null;
	}

}
