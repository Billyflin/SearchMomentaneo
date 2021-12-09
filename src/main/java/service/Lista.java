package service;

import model.Especialista;

import java.util.ArrayList;

public class Lista {

    public static ArrayList<Especialista> EspecialistaIsapre(){
        ArrayList<Especialista> especialistas =new Gestor().getEspecilistas();
        ArrayList<Especialista> list =new ArrayList<>();
        for (Especialista e : especialistas) {
            if (e.isIsapre()){
                list.add(e);
            }
        }
        return list;
    }
    public static ArrayList<Especialista> EspecialistaFonasa(){
        ArrayList<Especialista> especialistas =new Gestor().getEspecilistas();
        ArrayList<Especialista> list =new ArrayList<>();
        for (Especialista e : especialistas) {
            if (e.isFonasa()){
                list.add(e);
            }
        }
        return list;
    }
}
