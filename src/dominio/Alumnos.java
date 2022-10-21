package dominio;

public class Alumnos {
    private String nombre;
    private int grupo;
    private float cal;


    public Alumnos(String nombre, int grupo, float cal)
    {
        this.nombre=nombre;
        this.grupo=grupo;
        this.cal=cal;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public float getCal1() {
        return cal;
    }

    public void setCal1(float cal) {
        this.cal = cal;
    }

    @Override
    public String toString() {
        return "\t \t Alumno" +
                "nombre= '" + nombre + "\n" +
                "grupo= " + grupo + "\n" +
                "cal= " + cal + "\n" ;
    }
}
