package Data;

import java.sql.*;

public class ConexionAPP {
    private static final String DB_URL = "jdbc:mysql://181.226.107.26:3306/DrSearch";
    private static final String USER = "billy";
    private static final String PASS = "0208";
    private String sql;
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    public ConexionAPP() throws SQLException {
        conectar();
    }


    private static void conectar() throws SQLException {

        connection = DriverManager.getConnection(DB_URL, USER, PASS);
        statement = connection.createStatement();
    }
    public ResultSet leerTablaPacientes() throws SQLException {

        sql = "SELECT * FROM PACIENTES";
        return statement.executeQuery(sql);
    }

    public ResultSet buscarPacientePorID(String id) throws SQLException {

        sql = "SELECT * FROM PACIENTES WHERE id = ?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, id);
        return preparedStatement.executeQuery();
    }
    public void cerrarConexion() throws SQLException {

        if (statement != null) {
            statement.close();
        }

        if (preparedStatement != null) {
            preparedStatement.close();
        }

        if (connection != null) {
            connection.close();
        }
    }
}
