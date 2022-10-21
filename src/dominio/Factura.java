package dominio;

public class Factura {


    private int numero;
    private String cliente;
    private float saldo;

    public Factura (int n, String c, float s ) {
        numero = n;
        cliente = c;
        saldo = s;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero (int nuevoNumero) {
        numero= nuevoNumero;
    }

    public String getCliente () {
        return cliente;
    }

    public void setCliente (String nuevoCliente) {
        cliente= nuevoCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo (float nuevoSaldo) {
        saldo= nuevoSaldo;
    }

    public String toString() {
        return "Número de Factura: " + numero +
                "\nNombre del cliente: " + cliente +
                "\nSaldo: $ " + saldo+"\n";
    }


}
