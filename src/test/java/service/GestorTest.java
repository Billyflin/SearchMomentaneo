package service;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class GestorTest {
    @Test
    void csvReadAgendas() {
        Gestor.setAccessGranted(true);
        System.out.println(Gestor.getAgendas());
    }
    @Test
    void csvReadPacientes() {
        Gestor.setAccessGranted(true);
        try {
            System.out.println(Gestor.csvReadPacientes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Test
    void csvReadEspecialistas() {
        Gestor.setAccessGranted(true);
        try {
            System.out.println(Gestor.csvReadEspecialistas());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    void getEspecialidades() {
        Gestor.setAccessGranted(true);
        System.out.println(Gestor.getEspecialidades());

    }
}