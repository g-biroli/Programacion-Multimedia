package dao;

import database.DBConnection;
import database.SchemaDB;
import model.Producto;

import java.sql.*;

public class UsuarioDAO {

    private Connection connection;
    private PreparedStatement preparedStatement;

    public void registrarProducto(Producto producto) throws SQLException {
        connection = DBConnection.getConnection();
        String query = String.format("INSERT INTO %s (%s, %s, %s, %s) VALUES ('%s', '%s', '%d', '%.2f')",
                SchemaDB.TAB_USER,
                SchemaDB.COL_NAME, SchemaDB.COL_DESC, SchemaDB.COL_ID, SchemaDB.COL_PRICE,
                producto.getNombre(), producto.getDescripcion(),
                producto.getId(), producto.getPrecio());

        preparedStatement = connection.prepareStatement(query);
        preparedStatement.executeUpdate();
        connection.close();
    }

    public static void mostrarDatos(String tabla) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DBConnection.getConnection();
            statement = connection.createStatement();
            String query = "SELECT * FROM " + tabla;
            resultSet = statement.executeQuery(query);

            System.out.println("Resultados de la tabla: " + tabla);
            while (resultSet.next()) {
                int columnCount = resultSet.getMetaData().getColumnCount();
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getMetaData().getColumnName(i) + ": " + resultSet.getString(i) + "  ");
                }
                System.out.println();
            }
            System.out.println("---------------------------------------------");

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar los recursos: " + ex.getMessage());
            }
        }
    }
}

