package dominio;

public class PilaAlumno {
    // instance variables - replace the example below with your own
    private Alumnos[] p;
    private int tope;
    /**
     * Constructor for objects of class PilasFacturas
     */
    public PilaAlumno()
    {
        // initialise instance variables
        p = new Alumnos[5];
        tope = -1;
    }

    public PilaAlumno(int n){
        p = new Alumnos[n];
        tope = -1;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public Alumnos[] getP()
    {
        return p;
    }

    public int getTope(){
        return tope;
    }

    public void setP(Alumnos[] nuevoP){
        p = nuevoP;
    }

    public void setTope(int nuevoTope){
        tope = nuevoTope;
    }

    public void insertar(Alumnos nuevo){
        if(!estaLlena()){ //checa que la pila NO este llena
            tope++; //mueve el tope a la sig. casilla libre
            p[tope] = nuevo; //guardar el dato en el tope de la pila
        }
    }

    public Alumnos eliminar(){
         Alumnos borrado = null; //variable que devuelve el dato borrado
        if(!estaVacia()){
            borrado = p[tope]; //se saca el dato del tope
            p[tope] = null; //de borra físicamente la casilla
            tope--; //se decrementa el tope
        }
        return borrado; //se regresa el valor eliminado
    }

    public boolean estaVacia(){
        if(tope == -1){ //checa si el tope no señala a ninguna casilla
            return true;
        }else{
            return false;
        }
    }

    public boolean estaLlena(){
        if(tope == p.length -1){ //revisa si el tope está en la última casilla
            return true;
        }else{
            return false;
        }
    }

    public Alumnos datoEnTope(){
        if(!estaVacia()){
            return p[tope];
        }else{
            return null;
        }
    }

    public int numElementos(){
        return tope + 1;
    }

    public float sumaCalificaciones(){
         float suma =0;
        for(int i =  tope; i >= 0; i--){
            suma += p[i].getCal1();
        }
        return suma;
    }
/*
    public String facturaMayor(){
        float mayor=0;
        int ind=0;

        for (int i = 0 ;tope >= i; i++ )
            if (p[i].getSaldo()> mayor){
                mayor=p[i].getSaldo();
                ind=i;
            }
        return p[ind].toString();
    }

    public String buscarCliente (String nombre) {

        String x = "";
        for (int i = 0; tope >= i; i++)
            if (nombre.equalsIgnoreCase(p[i].getCliente())) {
                x += p[i].toString();
            }
        return x;
    }
    public String vaciarTope(){
        return vaciarTope();
    }

 */

    public String toString(){
        int i;
        String s = "Elementos en pila: \n";
        for(i =  tope; i >= 0; i--){
            s += p[i] + "\n";
        }
        s += "Fin de la pila";
        return s;
    }


}
