package com.example.oopproj;


import java.sql.SQLException;

public class DictionaryDatabaseManagementTestDrive {
    public static void main(String[] args) throws SQLException {
        Dictionary dictionary = new Dictionary();
        DictionaryDatabaseManagement dictionaryDatabaseManagement = new DictionaryDatabaseManagement(dictionary);
        dictionaryDatabaseManagement.importFromDatabase();
    }
}
