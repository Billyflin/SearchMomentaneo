package model;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Paciente {
        public DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        private final String ID;
        private final String rut;
        private final String nombre;
        private final String apellido;
        private final int edad;
        private final LocalDate fechaDeNacimiento;
        private final String correo;
        private final String numero;
        private final LocalDate fechaDeCreacionUsuario;
        private final boolean isapre;
        private final boolean fonasa;

        public Paciente(String ID, String rut, String nombre, String apellido, int edad, String fechaDeNacimiento, String correo, String numero, String fechaDeCreacionUsuario, boolean isapre, boolean fonasa) {
                this.ID = ID;
                this.rut = rut;
                this.nombre = nombre;
                this.apellido = apellido;
                this.edad = edad;
                this.fechaDeNacimiento = LocalDate.parse(fechaDeNacimiento);
                this.correo = correo;
                this.numero = numero;
                this.fechaDeCreacionUsuario = LocalDate.parse(fechaDeCreacionUsuario);
                this.isapre = isapre;
                this.fonasa = fonasa;
        }

        public String getID() {
                return ID;
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

        public int getEdad() {
                return edad;
        }

        public LocalDate getFechaDeNacimiento() {
                return fechaDeNacimiento;
        }

        public String getCorreo() {
                return correo;
        }

        public String getNumero() {
                return numero;
        }

        public LocalDate getFechaDeCreacionUsuario() {
                return fechaDeCreacionUsuario;
        }

        public boolean isIsapre() {
                return isapre;
        }

        public boolean isFonasa() {
                return fonasa;
        }

        @Override
        public String toString() {
                return
                        "ID='" + ID + '\'' +
                        ", rut='" + rut + '\'' +
                        ", nombre='" + nombre + '\'' +
                        ", apellido='" + apellido + '\'' +
                        ", edad=" + edad +
                        ", fechaDeNacimiento=" + fechaDeNacimiento +
                        ", correo='" + correo + '\'' +
                        ", numero='" + numero + '\'' +
                        ", fechaDeCreacionUsuario=" + fechaDeCreacionUsuario +
                        ", isapre=" + isapre +
                        ", fonasa=" + fonasa +"\n";
        }
}
