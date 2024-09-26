package com.example.oopproj;

import java.sql.*;

public class DictionaryDatabaseManagement extends DictionaryManagement{

    // constructor.
    public DictionaryDatabaseManagement(Dictionary dictionary) {
        super(dictionary);
    }

    // database stuffs.
    public void importFromDatabase() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("customerName"));
        }
    }

    // nope.
    @Override
    public void insertFromCmdLine() {
        return;
    }

    // show all words.
    @Override
    public void showAllWords() {
        this.dictionary.showAll();
    }
}


