package UsuarioCesde2;

import java.util.Date;

public class Curso {

    private int idCurso;
    private  String nombre;
    private String horario;
    private Profesor profesor = new Profesor();
    private Programa programa = new Programa();

    public Curso(){

    }

    public Curso(int idCurso, String nombre, String horario, Profesor profesor, Programa programa) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.horario = horario;
        this.profesor = profesor;
        this.programa = programa;
    }
}
