package UsuariosCesde;

public class Estudiante extends Usuario {

    //atributos
    private String carrera;

    //constructores
    public Estudiante(){

    }
    public Estudiante(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono, String carrera) {
        super(id, nombre, apellido, correo, contrasena, direccion, telefono);
        this.carrera = carrera;
    }
    //getter and setter


    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    //metodos

    @Override
    public void registrarUsuario() {
        System.out.println("Soy el estudiante");
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
        System.out.println("Indique el programa de su interes");
        this.carrera  = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
    }
}
