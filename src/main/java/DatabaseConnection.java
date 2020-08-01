import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    private final String url;
    private Properties properties;

    DatabaseConnection(String host, String databaseName, String username, String password) {
        this.url = "jdbc:mysql://" + host + "/" + databaseName;
        this.properties = new Properties();
        this.properties.setProperty("user", username);
        this.properties.setProperty("password", password);
    }

    Connection getConnection() throws SQLException{
        return DriverManager.getConnection(this.url, this.properties);
    }
}
