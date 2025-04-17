package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DataSourceConnectionHelper {

    public void dataSourceConnect(String url, String username, String password) {
        MysqlDataSource mySQLDataSource = new MysqlDataSource();
        mySQLDataSource.setURL(url);
        mySQLDataSource.setUser(username);
        mySQLDataSource.setPassword(password);

        try(Connection con = mySQLDataSource.getConnection();
        PreparedStatement st = con.prepareStatement("SELECt * FROM city WHERE population < ?"))
        {
            st.setInt(1, 100000);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                System.out.println("Name: "+rs.getString("name")+" | "+ "Population: "+ rs.getInt("population"));
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

}
