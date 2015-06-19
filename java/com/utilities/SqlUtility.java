package com.utilities;

import java.util.HashMap;

public class SqlUtility {

    private static HashMap<String, String> SqlStatements = null;

    public SqlUtility() {

        populateMap();
    }

    private void populateMap() {

        // Employee Sql Statements
        SqlStatements
            .put("Create_Emp",
                "Insert into employees (firstName, lastName, login,password) values (?,?,?,?)");
        SqlStatements.put("Get_Emp", "Select * from employees where ID = ?");
        SqlStatements.put("List_Emp", "Select * from employees");
        SqlStatements.put("Delete_Emp", "Delete from employees where ID = ?");
        SqlStatements.put("Update_Emp", "Update from employees where ID = ?");

        // Contractor Sql Statements
        SqlStatements
            .put(
                "Create_Con",
                "Insert into Contractors (firstName, lastName, login,password) values (?,?,?,?)");
        SqlStatements.put("Get_Con", "Select * from Contractors where ID = ?");
        SqlStatements.put("List_Con", "Select * from Contractors");
        SqlStatements.put("Delete_Con", "Delete from Contractors where ID = ?");
        SqlStatements.put("Update_Con", "Update from Contractors where ID = ?");

    }

    public static String getSQL(String statementName)
        throws NullPointerException {

        return SqlStatements.get(statementName);
    }
}
