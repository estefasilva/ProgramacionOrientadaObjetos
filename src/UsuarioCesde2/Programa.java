package UsuarioCesde2;

import java.util.Scanner;

public class Programa {

    Scanner sc = new Scanner(System.in);
    private int idPrograma;
    private String nombrePrograma;
    private int duracionPrograma;
    private String registroGov;
    private String escuela;

    public Programa(int idPrograma, String nombrePrograma, int duracionPrograma, String registroGov, String escuela) {
        this.idPrograma = idPrograma;
        this.nombrePrograma = nombrePrograma;
        this.duracionPrograma = duracionPrograma;
        this.registroGov = registroGov;
        this.escuela = escuela;
    }

    public Programa(){


    }

    public int getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public int getDuracionPrograma() {
        return duracionPrograma;
    }

    public void setDuracionPrograma(int duracionPrograma) {
        this.duracionPrograma = duracionPrograma;
    }

    public String getRegistroGov() {
        return registroGov;
    }

    public void setRegistroGov(String registroGov) {
        this.registroGov = registroGov;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    //metodos
    public void crearPrograma(){
        System.out.println("ingrese el id del programa " + idPrograma);
        idPrograma = sc.nextInt();
        sc.skip("\n");
        System.out.println("ingrese el nombre del programa");
        nombrePrograma = sc.nextLine();
        System.out.println("ingrese la duracion  del programa");
        duracionPrograma = sc.nextInt();
        System.out.println("ingrese el registro de la secretaria de educacion del programa");
        registroGov = sc.nextLine();
        System.out.println("ingrese la escuela del programa");
        escuela = sc.nextLine();

    }
    public void imprimirPrograma(){
        System.out.println("id" + idPrograma + "\n" + "nombre: " + nombrePrograma + "\n" + "duracion: " + duracionPrograma + "\n" +
                "registro educacion:" + registroGov + "\n" + "escuela: " + escuela + "\n");
    }
}
