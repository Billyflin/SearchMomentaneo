package view;

import model.Paciente;

import java.sql.SQLException;

public class MuestraCliente {



    public static void mostrarResultados(Paciente paciente) throws SQLException {

        System.out.println(paciente);
    }

}
