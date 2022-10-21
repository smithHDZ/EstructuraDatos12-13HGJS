package dominio;

public class Alumno {
    private String nombre;
    private int grupo;
    private float cal1;
    private float cal2;

    public Alumno(String nombre, int grupo, float cal1,float cal2)
    {
        this.nombre=nombre;
        this.grupo=grupo;
        this.cal1=cal1;
        this.cal2= cal2;
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
        return cal1;
    }

    public void setCal1(float cal1) {
        this.cal1 = cal1;
    }

    public float getCal2() {
        return cal2;
    }

    public void setCal2(float cal2) {
        this.cal2 = cal2;
    }

    public float promedio(){
        float prom;
        prom=(cal2+cal1)/2;
        return prom;
    }

    @Override
    public String toString() {
        return "\t \t Alumno" +
                "nombre= '" + nombre + "\n" +
                "grupo= " + grupo + "\n" +
                "cal1= " + cal1 + "\n" +
                "cal2= " + cal2 + "\n" +
                "promedio= " + promedio();
    }
}
