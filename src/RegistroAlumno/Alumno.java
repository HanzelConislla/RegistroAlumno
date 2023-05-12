/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroAlumno;

/**
 *
 * @author hanze
 */
class Alumno {

        String Nombre;
        String Curso;
        String Turno;

    public Alumno() {
    }

    public Alumno(String Nombre, String Curso, String Turno) {
        this.Nombre = Nombre;
        this.Curso = Curso;
        this.Turno = Turno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + Nombre + ", Curso=" + Curso + ", Turno=" + Turno + '}';
    }
        
}
