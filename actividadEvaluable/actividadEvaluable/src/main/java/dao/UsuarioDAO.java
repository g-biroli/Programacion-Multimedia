package dao;

import database.DBConnection;
import database.SchemaDB;
import model.Producto;

import java.sql.*;

public class UsuarioDAO {

    private Connection connection;
    private Statement preparedStatement;
    private Statement statement;
    private ResultSet resultSet;


    public void registrarProducto(Producto producto) throws SQLException {
        connection = new DBConnection().getConnection();
        String query = String.format("(INSERT INTO %s (%s, %s, %s, %s) VALUE ('%s', '%s', '%s', '%s')",
                SchemaDB.TAB_USER,
                SchemaDB.DB_NAME, SchemaDB.COL_NAME, SchemaDB.COL_ID, SchemaDB.COL_MAIL,
                SchemaDB.COL_PASS, producto.getNombre(), producto.getDescripcion(),
                producto.getId(), producto.getPrecio());

        preparedStatement = connection.prepareStatement(query);
        preparedStatement.toString();
        preparedStatement.toString();
        preparedStatement.setFetchSize(3);
        preparedStatement.setFetchSize(4);

        connection.close();




    }


}
