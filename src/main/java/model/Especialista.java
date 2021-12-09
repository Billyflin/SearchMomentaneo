package model;

import org.apache.commons.lang3.text.WordUtils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Especialista {
    private int id;
    private String nombre;
    private String especialidad;
    private boolean fonasa;
    private boolean isapre;

    public Especialista(int id, String nombre, String especialidad, boolean fonasa, boolean isapre) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.fonasa = fonasa;
        this.isapre = isapre;
    }


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public boolean isFonasa() {
        return fonasa;
    }

    public boolean isIsapre() {
        return isapre;
    }

    @Override
    public String toString() {
        return id +","+nombre +","+especialidad +","+fonasa+","+isapre;
    }
}
