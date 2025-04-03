import java.sql.Connection;
public class TypeFourPureJava {
    public static Connection getConnection(String url, String user, String password) throws ClassNotFoundException{
        Connection studentDatabaseConnection = null;
        // Load MySQL's Type 4 JDBC driver (Pure Java driver)
        // "com.mysql.cj.jdbc.Driver" is the Driver class provided by MySQL for the latest version of MySQL JConnector
        Class.forName("com.mysql.cj.jdbc.Driver");
        // rest of the code, for getting connection using DriverManager
        return studentDatabaseConnection;
    }
}
