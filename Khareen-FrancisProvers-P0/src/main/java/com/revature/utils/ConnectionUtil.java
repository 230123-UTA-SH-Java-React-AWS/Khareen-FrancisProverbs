package com.revature.utils;


import java.sql.Connection;
import java.sql.SQLException;

//This class is responsible for connecting to our database
public class ConnectionUtil {

    //We want only one connection to the database the entire time
    private static Connection con;

    //Private constructor to prevent anyone from
    private ConnectionUtil() {
        con = null;
    }

    //method that will give us a connection to the DB
    //Or it will give the existing connection

    public static Connection getConnection() {
        try {
            if (con != null && !con.isClosed()) {
                return con;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String url, user, pass;

        //Bad idea it will be exposed once we push this to the remote repo
        //url = "localhost";
        //user = "postgressql";
        //pass = "password";
        return null;
    }
}
