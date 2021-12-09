package Data;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PRUEBA {
    public static void main(String[] args) throws SQLException {
        var conexion=new ConexionLogin();
        leerResultados(conexion.buscarRegistroPorID("CG14O7MV"));
    }
    public static void leerResultados(ResultSet resultados) throws SQLException {

        System.out.println("""
                      
                """
        );

        resultados.close();
    }
}
