package dominio;

public class NodoArbolBinAlumno {
    private NodoArbolBinAlumno izquierdo;
    private String nombre;
    private float calificacion;
    private NodoArbolBinAlumno derecho;

    public NodoArbolBinAlumno(String nom, float cal){
        nombre=nom;
        calificacion=cal;
        izquierdo= derecho=null;
    }

    public NodoArbolBinAlumno getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbolBinAlumno nuevoizquierdo) {
        this.izquierdo = nuevoizquierdo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevonombre) {
        this.nombre = nuevonombre;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float nuevocalificacion) {
        this.calificacion = nuevocalificacion;
    }

    public NodoArbolBinAlumno getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbolBinAlumno nuevoderecho) {
        this.derecho = nuevoderecho;
    }

    @Override
    public String toString() {
        return " Alumno \n" +
                "nombre = " + nombre + '\n' +
                " calificacion = " + calificacion + '\n';
    }

}
