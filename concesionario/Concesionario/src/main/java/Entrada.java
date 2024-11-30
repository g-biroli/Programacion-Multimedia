import database.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Entrada {
    public static void main(String[] args) {
        //agregarCoche("mercedes", "e63 amg", 290000);
        //agregarCoche("mercedes", "r63 amg", 580000);
        borrarCoche("e63 amg");
    }

    public static void agregarCoche(String marca, String modelo, int precio) {
        Connection connection1 = new DBConnection().getConnection();
        // Crud -> Create, Select, Update, Delete
        // Statatement -> ejecuta una query directa
        // PrepareStatement -> ejecuta una query parametrizada -> INSERT / UPDATE / DELETE
        // Resultset -> ejecuta una query de SELECT
        String query = String.format("INSERT INTO %s (%s,%s,%s) VALUE (?,?,?)", "coches", "marca", "modelo", "precio");
        // metodo que se anade dentro de la base de datos
        try {
            PreparedStatement preparedStatement = connection1.prepareStatement(query);
            preparedStatement.setString(1, marca);
            preparedStatement.setString(2, modelo);
            preparedStatement.setInt(3, precio);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("La query esta mal ejecutada");
            System.out.println(e.getMessage());
        }

    }

    public static void borrarCoche(String modelo) {
        Connection connection1 = new DBConnection().getConnection();

        String query = String.format("DELETE FROM %s WHERE %s=?", "coches", "modelo");
        // metodo que se borra dentro de la base de datos
        try {
            PreparedStatement preparedStatement = connection1.prepareStatement(query);
            preparedStatement.setString(1, modelo);
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("La query esta mal ejecutada");
            System.out.println(e.getMessage());
        }
    }
}
