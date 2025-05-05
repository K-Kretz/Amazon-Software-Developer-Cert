package com.example;

import java.sql.Statement;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandler {

    private final String url = "jdbc:mysql://localhost:3306/world";
    private final String user = "root";
    private final String password = "Thegeneral-1";

    @SuppressWarnings("exports")
    private Connection getConnection() throws SQLException{

        return DriverManager.getConnection(url,user,password);
    }

    public String getAllUsers() throws SQLException{

        String userData ="";
        String queryUsers = "SELECT * FROM city";

        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(queryUsers);

        while (rs.next()) {
            userData += rs.getInt("ID")+" "+
                        rs.getString("Name")+" "+
                        rs.getString("CountryCode")+" "+
                        rs.getString("District")+" "+
                        rs.getString("Population") + "\n";

        }
        
        rs.close();
        st.close();
        con.close();
        return userData;
    }

    public ObservableList<City> getCityAsObserableList() throws SQLException{

        ObservableList<City> cities = FXCollections.observableArrayList();
        String query = "SELECT * FROM city";

        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()){
            int cityId = rs.getInt("ID");
            String name = rs.getString("Name");
            String countryCode = rs.getString("CountryCode");
            String district = rs.getString("District");
            int population = rs.getInt("Population");
            City city = new City(cityId, name, countryCode, district, population);

            cities.add(city);
        }
        rs.close();
        st.close();
        con.close();
        
        return cities;
        

    }

}
