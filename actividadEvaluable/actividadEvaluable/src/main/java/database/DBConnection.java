package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    //permite llegar a la conexion

    private static Connection connection;

    private static void createConnection() throws SQLException {


        String url = String.format("jdbc:mysql://%s:%s/%s",SchemaDB.Host, SchemaDB.PORT, SchemaDB.DB_NAME);
        connection = DriverManager.getConnection(url, "root", "");
    }
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            createConnection();
        }
        return connection;
    }

    public void closeConnection(){
        try {
            connection.close();
            connection = null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
