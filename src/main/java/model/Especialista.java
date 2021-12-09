package model;

import org.apache.commons.lang3.text.WordUtils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Especialista {
    private final int id;
    private final String rut;
    private final String nombre;
    private final String apellido;
    private final String area;
    private final String especialidad;
    private final boolean isapre;
    private final boolean fonasa;
    private final String direccion;

    public Especialista(int id, String rut, String nombre, String apellido, String area, String especialidad, boolean isapre, boolean fonasa, String direccion) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
        this.especialidad = especialidad;
        this.isapre = isapre;
        this.fonasa = fonasa;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getArea() {
        return area;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public boolean isIsapre() {
        return isapre;
    }

    public boolean isFonasa() {
        return fonasa;
    }

    public String getDireccion() {
        return direccion;
    }
}