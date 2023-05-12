
 
package RegistroAlumno;

public class AlumnoRe {
   String Nombre;
   String Curso;

    public AlumnoRe() {
    }

    public AlumnoRe(String Nombre, String Curso) {
        this.Nombre = Nombre;
        this.Curso = Curso;
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

    @Override
    public String toString() {
        return "AlumnoRe{" + "Nombre=" + Nombre + ", Curso=" + Curso + '}';
    }
   
}
