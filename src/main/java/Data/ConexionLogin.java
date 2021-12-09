package Data;

import java.sql.*;

public class ConexionLogin {
    private static final String DB_URL = "jdbc:mysql://181.226.106.16:3306/LOGIN";
    private static final String USER = "billy";
    private static final String PASS = "0208";
    private String sql;
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    public ConexionLogin() throws SQLException {
        conectar();
    }


    private static void conectar() throws SQLException {

        connection = DriverManager.getConnection(DB_URL, USER, PASS);
        statement = connection.createStatement();
    }
    public ResultSet leerTabla() throws SQLException {

        sql = "SELECT * FROM LOGINDATA";
        return statement.executeQuery(sql);
    }
    public ResultSet buscarRegistroPorID(String id) throws SQLException {

        sql = "SELECT * FROM LOGINDATA" +
                " WHERE id = ?";
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
