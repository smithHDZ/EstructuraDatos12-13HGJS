package dominio;

public class NodoAlumno {
    private int ncontrol;
    private String nombre;
    private float calificacion;
    private NodoAlumno enlace;

    public NodoAlumno(){
        ncontrol = 0000;
        nombre = "";
        calificacion = 0.0f;
        enlace = null;
    }

    public NodoAlumno(int nc, String nom, float cal){
        ncontrol = nc;
        nombre = nom;
        calificacion = cal;
        enlace  = null;
    }

    public int getNcontrol() {
        return ncontrol;
    }

    public void setNcontrol(int nuevoncontrol) {
        this.ncontrol = nuevoncontrol;
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

    public void setCalificacion(float nuevacalificacion) {
        this.calificacion = nuevacalificacion;
    }

    public NodoAlumno getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoAlumno nenlace) {
        this.enlace = nenlace;
    }

    @Override
    public String toString() {
        return "NodoAlumno" +
                "Numero de Control = " + ncontrol + "\n" +
                "nombre = " + nombre +  "\n" +
                "calificacion = " + calificacion + "\n";
    }
}

