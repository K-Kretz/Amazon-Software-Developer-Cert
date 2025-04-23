package com.example;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        DatabaseConnection dbc = null;
        try  {
            dbc = new DatabaseConnection("jdbc:mysql://localhost:3306/world","root","Thegeneral-1");
            dbc.setCommit();
            dbc.insertProduct(1,50);
            dbc.insertProduct(2,100);

            dbc.updateProduct(3,50);

            System.out.println(dbc.getCommitStatus());
            if(!dbc.getCommitStatus())
            {
                dbc.commit();
                
                throw new SQLException(" No row was updated");
            }

        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            dbc.rollback();
        } catch (Exception e) {
            // TODO Auto-generated catch block
           System.out.println(e.getMessage());
        }
        finally{
            try {
                dbc.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
}
