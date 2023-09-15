package UsuariosCesde;

import java.util.Scanner;

public class Usuario {

    Scanner sc = new Scanner(System.in);
    //primero creamos los atributos encapsulados con private

    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private String direccion;
    private String telefono;

    //vamos a crear nuestro metodo constructor

    public Usuario(){


    }

    //vamos a crear un constructor con parametros

    public Usuario(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    //construimos los getter and setter para permitir que el acceso desde los metodos
    //a las variables privadas

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //metodos

    public void registrarUsuario(){
        System.out.println("Ingrese su id: ");
        this.id = sc.nextInt(); //this es un operador que hace referencia a un
        sc.skip("\n");
        System.out.println("Ingrese su nombre: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        this.apellido = sc.nextLine();
        System.out.println("Ingrese su correo: ");
        this.correo = sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        this.contrasena = sc.nextLine();
        System.out.println("Ingrese su direccion: ");
        this.direccion = sc.nextLine();
        System.out.println("Ingrese su telefono: ");
        this.telefono = sc.nextLine();
    }
    public String toString() {
        return "Usuario{" +
                "sc=" + sc +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
    public void iniciarSesion() {
        System.out.println("Ingrese el correo registrado");
        String correoRegistrado = sc.next();
        System.out.println("Ingrese la contraseña registrada: ");
        String contrasenaReg = sc.next();

        if (contrasena.equals(contrasenaReg) && correo.equals(correoRegistrado)){
            System.out.println("Bienvenido" + nombre);
        } else {
            System.out.println("credenciales no validas");
        }
    }
}
