package dominio;

public class Materia {
    private String clave;
    private int creditos;

    public Materia(String c, int cd){
        clave = c;
        creditos = cd;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String nclave) {
        this.clave = nclave;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int ncreditos) {
        this.creditos = ncreditos;
    }

    @Override
    public String toString() {
        return "Materia" +
                "clave = '" + clave + '\n' +
                "creditos = " + creditos ;
    }

}
