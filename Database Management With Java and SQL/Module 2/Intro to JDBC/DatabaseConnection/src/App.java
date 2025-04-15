import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
       // Connection details for the Chinook MySQL database
       String url = "jdbc:mysql://localhost:3306/world";
       String user = "root"; // Replace with your MySQL username
       String password = "Thegeneral-1"; // Replace with your MySQL password
       try (Connection connection = DriverManager.getConnection(url, user, password)) {
           // Check if the connection was successful
           if (connection != null) {
               System.out.println("Connected to the database!");


               //Statements for static Queries
               Statement st = connection.createStatement();

               ResultSet rs = st.executeQuery("SELECT * FROM city;");

                while(rs.next())
                {
                    System.out.println("cities are: "+rs.getString("Name"));
                }
                rs.close();
                st.close();
                ////////////////////////
                /// 
                /// 
                //Prepared Statements
                String cityName ="Kabul";

                PreparedStatement pst = connection.prepareStatement("SELECT population FROM city WHERE name = ?");
                pst.setString(1, cityName);
                ResultSet prs = pst.executeQuery();

                while(prs.next())
                {
                    String population = prs.getString("population");
                    System.out.println("The population of \""+ cityName+"\" is: "+ population);
                }
                prs.close();
                pst.close();
                ///////////////////////
                /// 
                /// 
                //Callable Statments
                CallableStatement cs = connection.prepareCall("{call GetPopulationTotal()}");
                ResultSet crs = cs.executeQuery();

                while (crs.next()) {
                    System.out.println("District: "+ crs.getString("District")+" totalPopulation: "+crs.getInt("totalPopulation"));  
                }
            }
       } catch (SQLException e) {
           // Handle SQL errors during connection
           System.out.println("Connection failed: " + e.getMessage());
       }
    }
}
