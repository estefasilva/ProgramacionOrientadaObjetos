package UsuariosCesde;

public class Test {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();//hemos creado una instancia de la clase Usuario
        Usuario usuarioPepito = new Usuario();
        Usuario nicolas = new Usuario();
/*
        String nombre = "Nicolás";
        nicolas.setNombre(nombre);

        String correo = "pirata@mail.com";
        nicolas.setCorreo(correo);

        System.out.println(nicolas.getNombre());*/

        nicolas.registrarUsuario();
        System.out.println(nicolas.toString());
        nicolas.iniciarSesion();

        Estudiante estudiante= new Estudiante();





    }
}
