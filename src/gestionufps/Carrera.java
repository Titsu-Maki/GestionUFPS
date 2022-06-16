
package gestionufps;

public class Carrera {

    private String codigo;
    private String nombre;
    private int numCreditos;

    public Carrera() {
    }

    public Carrera(String codigo, String nombre, int numCreditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numCreditos = numCreditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

}