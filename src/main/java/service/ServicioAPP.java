package service;

import Data.ConexionAPP;
import model.Paciente;
import view.MuestraCliente;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServicioAPP {
    public static void iniciar() {

        try {
            var conexion = new ConexionAPP();
            var resultados = conexion.leerTablaPacientes();
            leerResultados(resultados);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void leerResultados(ResultSet resultados) throws SQLException {

        System.out.println("""
                      
                """
        );

        while (resultados.next()) {
            var paciente = crearCliente(resultados);
            MuestraCliente.mostrarResultados(paciente);
        }
        resultados.close();
    }

    public static Paciente crearCliente(ResultSet resultado) throws SQLException {

        var id = resultado.getString("id");
        var rut = resultado.getString("rut");
        var nombre = resultado.getString("nombre");
        var apellido = resultado.getString("apellido");
        var edad =resultado.getInt("edad");
        var fechaNacimiento = resultado.getString("fechaNacimiento");
        var correo = resultado.getString("correo");
        var numero = resultado.getString("numero");
        var fechaCreacion = resultado.getString("fechaCreacion");
        var isapre = resultado.getBoolean("isapre");
        var fonasa = resultado.getBoolean("fonasa");


        return new Paciente(id,rut, nombre, apellido,edad,fechaNacimiento,correo,numero,fechaCreacion,isapre,fonasa);
    }
}
