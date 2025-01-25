
package proyectofinal;

public class CReporte {
    String codigo, cursos, carrera;
    double horas, creditos;
    
    public CReporte(String codigo, String cursos, String carrera, double horas, double creditos) {
        this.codigo=codigo;
        this.cursos=cursos;
        this.carrera=carrera;
        this.horas=horas;
        this.creditos=creditos;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo=codigo;
    }
    public String getCursos() {
        return cursos;
    }
    public void setCursos(String cursos) {
        this.cursos=cursos;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera=carrera;
    }
    public int getHoras() {
        return (int) horas;
    }
    public void setHoras(int horas) {
        this.horas=horas;
    }
    public int getCreditos() {
        return (int) creditos;
    }
    public void setCreditos(int creditos) {
        this.creditos=creditos;
    }
}
