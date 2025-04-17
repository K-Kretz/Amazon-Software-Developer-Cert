package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
     DataSourceConnectionHelper con = new DataSourceConnectionHelper();
     con.dataSourceConnect("jdbc:mysql://localhost:3306/world", "root", "Thegeneral-1");
    }

}
