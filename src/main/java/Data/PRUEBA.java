package Data;

import service.ServicioAPP;

import java.sql.SQLException;

public class PRUEBA {
    public static void main(String[] args) throws SQLException {
        ServicioAPP.iniciar();
        var conexion = new ConexionAPP();
        var result = conexion.buscarPacientePorID("60OFBQ4T");
        ServicioAPP.leerResultados(result);
        System.out.println();
    }
}

