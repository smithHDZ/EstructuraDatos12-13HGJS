package dominio;

public class NodoLibro {
    private String isbn;
    private String titulo;
    private String autor;
    private float precio;
    private NodoLibro enlace;

    public  NodoLibro(){
        isbn = "";
        titulo= "";
        autor = "";
        precio = 0.0f;
        enlace =null;
    }
    public  NodoLibro(String is, String t, String a, float p){
        isbn = is;
        titulo= t;
        autor = a;
        precio = p;
        enlace =null;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String nuevoisbn) {
        this.isbn = nuevoisbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String nuevotitulo) {
        this.titulo = nuevotitulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String nuevoautor) {
        this.autor = nuevoautor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float nuevoprecio) {
        this.precio = nuevoprecio;
    }

    public NodoLibro getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoLibro nuevoenlace) {
        this.enlace = nuevoenlace;
    }

    @Override
    public String toString() {
        return "NodoLibro{" +
                " isbn = " + isbn + '\n' +
                " titulo = " + titulo + '\n' +
                " autor = " + autor + '\n' +
                " precio = " + precio ;
    }
}
