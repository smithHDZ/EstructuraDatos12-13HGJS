package dominio;


public class Escuela {
    private String nombre;
    private int numAlumnos;

    public Escuela (String nom, int n){
        nombre=nom;
        numAlumnos=n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevonombre) {
        this.nombre = nuevonombre;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int nuevonumAlumnos) {
        this.numAlumnos = nuevonumAlumnos;
    }

    @Override
    public String toString() {
        return "Escuela \n" +
                "Nombre= " + nombre + '\n' +
                "Numero de Alumnos= " + numAlumnos + '\n' ;
    }
}
