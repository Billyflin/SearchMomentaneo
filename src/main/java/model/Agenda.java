package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Agenda {

    public DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate date;
    private String pacienteBusqueda;
    private String especialistaBusqueda;
    private Paciente paciente;
    private Especialista especialista;
//    LocalTime time1 = LocalTime.of(11, 00, 00);


    public Agenda(String date, String pacienteBusqueda, String especialistaBusqueda) {
        this.date = LocalDate.parse(date,formato);
        this.pacienteBusqueda = pacienteBusqueda;
        this.especialistaBusqueda = especialistaBusqueda;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }
    public LocalDate getDate() {
        return date;
    }

    public String getPacienteBusqueda() {
        return pacienteBusqueda;
    }

    public String getEspecialistaBusqueda() {
        return especialistaBusqueda;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    @Override
    public String toString() {
        return  date.format(formato) + "," + paciente.getNombre()+" "+ paciente.getApellido() + "," + especialista.getNombre();
    }
}
