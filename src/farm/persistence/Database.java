package farm.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.*;

/**
 * Created by scheffs on 5/7/2016.
 */

public class Database {

    // create an object of the class Database
    private static final Database instance = new Database();

    private Connection connection;

    private final Logger log = Logger.getLogger(this.getClass());

    // private constructor prevents instantiating this class anywhere else
    private Database() {

    }

    // get the only Database object available
    public static Database getInstance() {
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void connect() throws Exception {
        if (connection != null)
            return;

        // Note following values should not be hard-coded in a real
        // application.
        // This is for demonstration only!!
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Error: MySQL Driver not found");
        }
        String url = "jdbc:mysql://localhost:3306/sheps_db";

        connection = DriverManager.getConnection(url, "admi123", "admin");
    }

    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                log.error("Cannot close connection",e);
            }
        }

        connection = null;
    }

}
