package com.amazondatabase;

import java.sql.DriverManager;
import java.util.Enumeration;

import java.sql.Driver;

public class App 
{
    public static void main( String[] args )
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Enumeration<Driver> drivers = DriverManager.getDrivers();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver class not found, can't load driver");
        }
    }
}
