package dominio;
/**
 * Clase instanciable para manejar objetos (canciones)
 */
public class Cancion
{
    private String titulo;
    private String interprete;
    private int duracion;
    
    public Cancion(String tit, String interp, int dur) {
        titulo = tit;
        interprete = interp;
        duracion = dur;
    }

    
    public String getTitulo() {
        return titulo;
    }
    
   
    public String getInterprete() {
        return interprete;
    }
    
    
    public int getDuracion() {
        return duracion;
    }
    
    
    public void setTitulo( String nuevoTitulo)
    {
        titulo = nuevoTitulo;
    }
    
    
    public void setInterprete(String nuevoInterprete)
    {
        interprete = nuevoInterprete;
    }
    
    
    public void setDuracion(int nuevaDuracion)
    {
        duracion = nuevaDuracion;
    }
    
    
    public String toString()
    {
        String cadena = "";
        cadena += "Titulo : " + titulo;
        cadena += "\nInterprete : " + interprete;
        cadena += "\nDuracion : " + duracion;
        return cadena;
    }
}
