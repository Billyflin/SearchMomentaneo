package model;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Paciente {
        public DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        private final String ID;
        private String nombre;
        private String apellido;
        private String rut;
        private boolean rutValido;
        private LocalDate fechaDeCreacionUsuario;
        private boolean isapre;
        private boolean fonasa;


        public Paciente(String id, String nombre, String apellido, String rut,String rutValido, String fechaDeCreacionUsuario,String isapre,String fonasa) {
                this.ID = id;
                this.nombre = nombre;
                this.apellido = apellido;
                this.rut = rut;
                this.rutValido = Boolean.parseBoolean(rutValido);
                this.fechaDeCreacionUsuario = LocalDate.parse(fechaDeCreacionUsuario,formato);
                this.isapre= Boolean.parseBoolean(isapre);
                this.fonasa= Boolean.parseBoolean(fonasa);
        }



        /**
         *
         * @return String
         */
        public String getNombre() {
                return nombre;
        }

        public String getApellido() {
                return apellido;
        }

        public String getRut() {
                return rut;
        }

        public boolean isRutValido() {
                return rutValido;
        }

        public LocalDate getFechaDeCreacionUsuario() {
                return LocalDate.from(fechaDeCreacionUsuario);
        }

        public String getID() {
                return ID;
        }

        @Override
        public String toString() {
                return  ID +","+ nombre + ","+ apellido +"," +rut + ","+rutValido  +","+ fechaDeCreacionUsuario +","+ isapre  +","+ fonasa +"\n";
        }
}
