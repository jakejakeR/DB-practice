package com.database;

import com.database.privateData.Directory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        try {
            Connection dbConnection = DriverManager.getConnection(Directory.DB_DIRECTORY);

        } catch(SQLException ex) {
            System.out.println("Something went wrong: " + ex.getMessage());
        }

    }
}
