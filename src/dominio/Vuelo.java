package dominio;

public class Vuelo {
    private String destino;
    private float precio;

    public Vuelo (String c, float s ) {
        destino = c;
        precio = s;
    }

    public String getDestino () {
        return destino;
    }

    public void setDestino (String nuevoDestino) {
        destino= nuevoDestino;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio (float nuevoSaldo) {
        precio= nuevoSaldo;
    }

    public String toString() {
        return "\nDestino de vuelo: " + destino +
                "\nPrecio del vuelo: $ " + precio +"\n";
    }
}
