package com.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;

import com.cemah.services.SpringJDBCPersonnelService;
import com.entities.contractor;
import com.entities.employee;
import com.entities.personnel;

public class EmployeeDAOMockTest {

    private static SpringJDBCPersonnelService mockedEmpDao;

    personnel testEmployee, testEmployee2, testEmployee3;

    @BeforeClass
    public void setUp() {

        mockedEmpDao = mock(SpringJDBCPersonnelService.class);

        testEmployee =
            new employee("CEMAH", "TORBOH", "ctorboh15", "cemah1234");
        testEmployee2 =
            new employee("CEMAH", "TORBOH", "ctorboh16", "cemah1234");
            
        testEmployee3 =
            new contractor("JOYCE", "TUDAE", "jtorboh531", "cemah1234");

        when(mockedEmpDao.getPersonnel(00011L, "Employee")).thenReturn(
            testEmployee);
        when(mockedEmpDao.listAllPersonnel("Employee")).thenReturn(
            Arrays.asList(testEmployee, testEmployee2, testEmployee3));

    }

    public void testGetAllEmployees() throws Exception {

        List<personnel> empList = mockedEmpDao.listAllPersonnel("Employee");
        assertEquals(3, empList.size());
    }
}
