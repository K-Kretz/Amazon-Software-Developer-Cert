package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MysqlDataSource ds = new MysqlDataSource();
        ds.setURL("jdbc:mysql://localhost:3306/world");
        ds.setUser("root");
        ds.setPassword("Thegeneral-1");
        ///////////
        /// Other Data Source Properties that can set
        try {
            ds.setLoginTimeout(15);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ds.setServerName("localhost");
        //Example of a remote Server
        //ds.setServerName("192.168.1.100"); 
        ds.setPortNumber(3306);
        ds.setDatabaseName("world");

        //Set Pool size of how many connections can go out depending on expected traffic and database resources
        //ds.setMaxPoolSize();


        try (Connection con = ds.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM city INNER JOIN country ON city.CountryCode = country.Code Where code = ?");) 
             {
                ps.setString(1, "USA");

                ResultSet rs = ps.executeQuery();

                while(rs.next())
                {
                    for(int i=1; i<=rs.getMetaData().getColumnCount(); i++)
                    {
                        System.out.println(rs.getString(i)+": "+rs.getMetaData().getColumnName(i));
                    }
                }

                rs.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
