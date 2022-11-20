package dominio;

public class Automovil {

    // instance variables - replace the example below with your own
    private String placa;
    private String propietario;

    /**
     * Constructor for objects of class Automovil
     */
    public Automovil() {
        // initialise instance variables
        placa = "";
        propietario ="";
    }

    public Automovil(String p, String pr){
        placa = p;
        propietario = pr;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public String getPlaca()
    {
        // put your code here
        return placa;
    }

    public void setPlaca(String nuevaPlaca){
        placa = nuevaPlaca;
    }

    public String getPropietario(){
        return propietario;
    }

    public void setPropietario(String nuevoPropietario){
        propietario = nuevoPropietario;
    }

    public String toString(){
        String s = "";
        s+= "Placa: " + placa;
        s+= "\nPropietario: " + propietario;
        return s;
    }

}
