import java.sql.Connection;
public class TypeOneODBC {
    public static Connection getConnection(String url, String user, String password) throws ClassNotFoundException{
        Connection studentDatabaseConnection = null;
        // Load JDBC-ODBC Bridge driver (Type 1)
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        // rest of the code, for getting connection
        return studentDatabaseConnection;
    }

}
