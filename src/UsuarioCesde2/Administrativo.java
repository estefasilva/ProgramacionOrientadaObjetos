package UsuarioCesde2;

public class Administrativo extends Usuario{

    private double salario;
    private String area;
    public Administrativo(){

    }

    public Administrativo(int id, String nombre, String apellido, String correo, String contrasena, String direccion, String telefono, double salario, String area) {
        super(id, nombre, apellido, correo, contrasena, direccion, telefono);
        this.salario = salario;
        this.area = area;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    //metodos

    @Override
    public void registrarUsuario() {
        super.registrarUsuario();
        System.out.println("ingrese el salario base");
        salario = sc.nextDouble();
        System.out.println("ingrese el area");
        area = sc.nextLine();
    }

    @Override
    public void imprimirUsuario() {
        super.imprimirUsuario();
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
    }
















}
