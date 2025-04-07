package com.example;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class App 
{
    public static void main( String[] args )
    {
       try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while (drivers.hasMoreElements()) {
            System.out.println(drivers.nextElement().getClass().getName());
        }
       } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        System.out.println("Driver class not found, can't load driver");
       } 
    }
}
