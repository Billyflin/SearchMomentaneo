package service;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.privatejgoodies.common.base.Strings;
import inteface.CRUD;
import model.Agenda;
import model.Especialista;
import model.Paciente;
import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Gestor implements CRUD {
    private static final String RUTA_LOGIN = "src/main/Server/Login.csv";
    private static final String RUTA_ESPECIALISTAS = "src/main/Server/Especialistas.csv";
    private static final String RUTA_PACIENTES = "src/main/Server/Pacientes.csv";
    private static final String RUTA_AGENDA = "src/main/Server/FechaAgendadas.csv";
    private static final String RUTA_ESPECIALIDADES = "src/main/Server/Especialidades.csv";
    public static boolean accessGranted = false;


    public Gestor() {
    }

    @Override
    public boolean create() {
        return false;
    }

    @Override
    public ArrayList<Especialista> read(String ruta) {
        return null;
    }
    public static ArrayList<Agenda> getAgendas(){
        ArrayList<Agenda> list= null;
        try {
            list = csvReadAgenda();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (list != null && !list.isEmpty()) {
        for (Agenda a:list) {
            a.setEspecialista(compararEspecialista(a.getEspecialistaBusqueda(),getEspecilistas()));
            a.setPaciente(comapararPaciente(a.getPacienteBusqueda(),getPacientes()));
            }
            return list;
        }
        return null;
    }
    static Especialista compararEspecialista(String especialista,ArrayList<Especialista> especialistas) {
        for (Especialista e: especialistas) {
            String nombrecompleto=(e.getNombre());
            if (nombrecompleto.equals(especialista)){
                return e;
            }
        }
        return null;
    }

    private static Paciente comapararPaciente(String paciente, ArrayList<Paciente> pacientes) {
        for (Paciente p: pacientes) {
            String nombrecompleto=(p.getNombre()+" "+p.getApellido());
            if (nombrecompleto.equals(paciente)){
                return p;
            }
        }
        return null;
    }
    public static ArrayList<Paciente> getPacientes(){
        ArrayList<Paciente> list= null;
        try {
            list = csvReadPacientes();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (list != null && !list.isEmpty()) {
            return list;
        }
        return null;
    }
    public static ArrayList<String> getEspecialidades(){
        ArrayList<String> list= null;
        try {
            list = csvReadEspecialidades();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        return list;
    }

    public static ArrayList<Especialista> getEspecilistas(){
        ArrayList<Especialista> list= null;
        try {
            list = csvReadEspecialistas();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        return list;
    }


    public static @NotNull ArrayList<Especialista> csvReadEspecialistas() throws FileNotFoundException {
        ArrayList<Especialista> especialistas=new ArrayList<>();
        if (isAccessGranted()){
        CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
        var builder = new CSVReaderBuilder(new FileReader(RUTA_ESPECIALISTAS));
        try (CSVReader reader = builder.withCSVParser(parser).withSkipLines(1).build()) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                int id = Integer.parseInt(nextLine[0]);
                String nombre = nextLine[1];
                String especialidad = nextLine[2];
                boolean fonasa = Boolean.parseBoolean(nextLine[3]);
                boolean isapre = Boolean.parseBoolean(nextLine[4]);

                especialistas.add(new Especialista(id,nombre,especialidad,fonasa,isapre));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
            }
        }
        return especialistas;
    }
    public static @NotNull ArrayList<Paciente> csvReadPacientes() throws FileNotFoundException {
        ArrayList<Paciente> pacientes=new ArrayList<>();
        if (isAccessGranted()){
            CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
            var builder = new CSVReaderBuilder(new FileReader(RUTA_PACIENTES));
            try (CSVReader reader = builder.withCSVParser(parser).withSkipLines(1).build()) {
                String[] nextLine;
                while ((nextLine = reader.readNext()) != null) {
                    String id = nextLine[0];
                    String nombre = nextLine[1];
                    String apellido = nextLine[1];
                    String rut =nextLine[2];
                    String rutValido =nextLine[3];
                    String fechaDeCreacionUsuario =nextLine[4];
                    String isapre =nextLine[5];
                    String fonasa =nextLine[6];
                    pacientes.add(new Paciente(id,nombre,apellido,rut,rutValido,fechaDeCreacionUsuario,isapre,fonasa));
                }
            } catch (Exception e) {
                System.out.println("Error" + e);
            }
        }
        return pacientes;
    }

    public static @NotNull ArrayList<Agenda> csvReadAgenda() throws FileNotFoundException {
        ArrayList<Agenda> agendas=new ArrayList<>();
        if (isAccessGranted()){
            CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
            var builder = new CSVReaderBuilder(new FileReader(RUTA_AGENDA));
            try (CSVReader reader = builder.withCSVParser(parser).withSkipLines(1).build()) {
                String[] nextLine;
                while ((nextLine = reader.readNext()) != null) {
                    String id = nextLine[0];
                    String nombre = nextLine[1];
                    String apellido = nextLine[2];
                    agendas.add(new Agenda(id,nombre,apellido));
                }
            } catch (Exception e) {
                System.out.println("Error" + e);
            }
        }
        return agendas;
    }
    public static @NotNull ArrayList<String> csvReadEspecialidades() throws FileNotFoundException {
        ArrayList<String> especialidades=new ArrayList<>();
        if (isAccessGranted()){
            CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
            var builder = new CSVReaderBuilder(new FileReader(RUTA_ESPECIALIDADES));
            try (CSVReader reader = builder.withCSVParser(parser).withSkipLines(1).build()) {
                String[] nextLine;
                while ((nextLine = reader.readNext()) != null) {
                    String id = nextLine[0];
                    especialidades.add(id);
                }
            } catch (Exception e) {
                System.out.println("Error" + e);
            }
        }
        return especialidades;
    }

//    @Override
//    public ArrayList<T> read(String ruta) {
//        return null;
//    }
    static void crearArchivo(String ruta, String contenido) {
    Path archivo = Paths.get(ruta);
    try {
        Files.write(archivo, contenido.getBytes());
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    static String leerArchivo(String ruta) {
        Path archivo = Paths.get(ruta);
        String contenido = "";
        try {
            contenido = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.out.println("El archivo no pudo ser leído");
        }
        return contenido;
    }
    static void nuevaLinea(String ruta, String contenido) {
        String oldContenido = leerArchivo(ruta);
        crearArchivo(ruta, oldContenido + "\n" + contenido);
    }
    @Override
    public boolean update() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }

    public static void setAccessGranted(boolean accessGrante) {
        accessGranted = accessGrante;
    }

    public static boolean isAccessGranted() {
        return accessGranted;
    }


        public static void registerUser(String text, String text1) {
            nuevaLinea(RUTA_LOGIN, text +","+ text1);
        }
}
