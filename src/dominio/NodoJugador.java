package dominio;

public class NodoJugador {
    private String nombre;
    private float goles;
    private NodoJugador enlace;

    public NodoJugador(){
        nombre="";
        goles= 0;
        enlace =null;
    }

    public NodoJugador(String n, float g){
        nombre=n;
        goles=g;
        enlace=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevonombre) {
        this.nombre = nuevonombre;
    }

    public float getGoles() {
        return goles;
    }

    public void setGoles(float nuevogoles) {
        this.goles = nuevogoles;
    }

    public NodoJugador getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoJugador nuevoenlace) {
        this.enlace = nuevoenlace;
    }

    @Override
    public String toString() {
        return "Jugador" +
                "Nombre= " + nombre + '\n'+
                "Goles= " + goles ;
    }
}
