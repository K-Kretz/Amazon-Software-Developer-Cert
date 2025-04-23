package com.example;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection implements AutoCloseable {

    Connection con;
    Statement st;
    PreparedStatement pst;
    Boolean commit;

    public DatabaseConnection(String url,String user,String password) throws SQLException {
           con = DriverManager.getConnection(url, user, password);
           if(con != null)
           {
                System.out.println("Connected Successfully");
           }else{
                System.out.println("Failed Connection");
           }
           createProductTable();
    }

    public void setCommit() throws SQLException{
        Scanner sys = new Scanner(System.in);
        System.out.println("Commit set to true or false?");
        commit = sys.nextBoolean();
        if(!commit){
             con.setAutoCommit(false);
             System.out.println("Auto Commit set to: false");
        } else{
            con.setAutoCommit(true);
            System.out.println("Auto Commit set to: true");
        }
    }
   
    public boolean getCommitStatus(){
        return commit;
    }

    public void commit() throws SQLException{
        con.commit();
        System.out.println("Transaction committed successfully.");
    }
    public void rollback() throws SQLException{
        con.rollback();
        System.out.println("Transaction failed: Rolled back");
    }

    
    private void createProductTable() throws SQLException{
        String statement = "CREATE TABLE IF NOT EXISTS products (product_id INT PRIMARY KEY, quantity INT)";
        st = con.createStatement();
        st.execute(statement);
    }

    public int insertProduct(int id, int quantity) throws SQLException{

        pst = con.prepareStatement("INSERT INTO products VALUES(?,?);");
        pst.setInt(1, id);
        pst.setInt(2, quantity);

        switch(id){
            case 1: System.out.println("Product 1: Smartphones inserted with quantity: "+ quantity);
                break;
            case 2: System.out.println("Product 2: Laptops inserted with quantity: "+ quantity);
                break;
            default: System.out.println("Please insert a valid ID for product");
        }
        return pst.executeUpdate();
    }

    public int updateProduct(int id, int quantity) throws SQLException{

        pst = con.prepareStatement("UPDATE products SET quantity=? WHERE product_id=?;");
        pst.setInt(1, quantity);
        pst.setInt(2, id);
        
        switch(id){
            case 1: System.out.println("Product 1: Smartphones Updated with quantity: "+ quantity);
                break;
            case 2: System.out.println("Product 2: Laptops updated with quantity: "+ quantity);
                break;
            default: System.out.println("Please insert a valid ID for product");
        }
        return pst.executeUpdate();
    }

    @Override
    public void close() throws Exception {
        pst.close();
        st.close();
        con.close();
    }



}
