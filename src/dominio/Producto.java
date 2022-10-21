package dominio;

public class Producto {

    private String nombre;
    private int clave;
    private float precio;


    public Producto (String nombre, int clave, float precio) {
        this.nombre = nombre;
        this.clave = clave;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public int getClave() {
        return clave;
    }

    public float getPrecio() {
        return precio;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    public String toString() {
        return "Nombre: "+ getNombre() +"\nclave: "+ getClave()+"\nPrecio: $ " + getPrecio();
    }

}
