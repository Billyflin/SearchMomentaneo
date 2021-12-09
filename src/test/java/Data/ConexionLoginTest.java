package Data;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class ConexionLoginTest {

    @Test
    void leerTabla() throws SQLException {
        var conexion=new ConexionLogin();
        System.out.println(conexion.leerTabla());
    }

    @Test
    void buscarRegistroPorID() {
    }

    @Test
    void cerrarConexion() {
    }
}