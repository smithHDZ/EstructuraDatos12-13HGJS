package dominio;

public class ColaCircularEscuelas {
    private Escuela cc[];
    private int frente ;
    private int contador;

    public ColaCircularEscuelas(){
        cc=new Escuela[5];
        frente=0;
        contador=0;
    }

    public ColaCircularEscuelas(int num){
        cc=new Escuela[num];
        frente =0;
        contador=0;
    }

    public Escuela[] getCc() {
        return cc;
    }

    public void setCc(Escuela[] nuevocc) {
        this.cc = nuevocc;
    }

    public int getFrente() {
        return frente;
    }

    public void setFrente(int nuevofrente) {
        this.frente = nuevofrente;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int nuevocontador) {
        this.contador = nuevocontador;
    }

    //Ahora cuando está VACÍA lo sabemos simplemente
    // porque el CONTADOR de ingresados vale CERO
    public boolean estaVacia ()  {
        if  (contador == 0)
            return true;
        else
            return false;
    }

    // Y para checar si está LLENA también
    // lo podemos saber gracias al CONTADOR de ingresados
    // que se compara contra la cantidad de casillas que tiene el vector
    public boolean estaLlena()  {
        if  ( contador == cc.length)
            return true;
        else
            return false;
    }

    // Devuelve el elemento del frente de la
    // cola CIRCULAR. NO LO ELIMINA
    public Escuela elementoEnFrente () {
        if ( estaVacia() )
            return null;
        else
            return cc [frente];
    }

    // Devuelve el elemento del final de la cola CIRCULAR. NO LO ELIMINA
    public Escuela elementoEnFin () {
        if ( estaVacia() )
            return null;
        else
            return cc [(frente -1 + contador) % cc.length];
    }

    public int numElementos(){
        return contador;
    }

    // Método para insertar un dato x
    public void insertar (Escuela x) {
        if ( ! estaLlena () ) {                   // solo podemos insertar si NO está llena
            cc [(frente + contador) % cc.length] = x;    // se calcula la posición donde se insertará x
            contador++;                       // obviamente se incrementa el contador, ya que se insertó un elemento
        }
    }

    // Método para eliminar un dato, devuelve el elemento eliminado ó bien null si no hay datos para borrar
    public String eliminar ( ) {
        Escuela eliminado=null;
        if ( ! estaVacia () ) {                  // solo podemos eliminar si NO está vacía
            eliminado = cc[frente];          // Dato que se elimina y es el que se devuelve
            cc[frente] = null;                   // se anula el dato de la casilla
            frente = (frente + 1 ) % cc.length;   // se calcula la nueva posición del frente
            contador--;                           // obviamente se decrementa el contador, ya que se eliminó un elemento
        }
        return eliminado.toString();
    }

    //Metodo para vaciar la cola
    public String vaciarCola()
    {
        String s = "";
        int i= 1, indice = frente;

        while (i <= contador) {     // ciclo para desplegar la cantidad de elemtos que hay en la cola circular
            s+= cc[indice] + "\n";   // se concatena cada elemento de acuerdo al índice en una variable string
            cc[indice] = null;
            if (indice == cc.length - 1)     // si ya está el índie en la última casilla, tiene que regresar a la posición 0
                indice = 0;
            else                              // si no está en la última casilla, simplemente se incrementa el índice a la sig. casilla
                indice++;
            i++;	   // se incrementa i que controla la cantidad de elementos que hay actualmente en la cola circular
        }

        contador = 0;
        frente = 0;
        return s;
    }

    public int totalAlumnos(){
        int s=0;
        int i = 1, indice =frente;
        while (i <= contador) {     // ciclo para desplegar la cantidad de elemtos que hay en la cola circular
            s+= cc[indice].getNumAlumnos();   // se concatena cada elemento de acuerdo al índice en una variable string
            if (indice == cc.length - 1)     // si ya está el índie en la última casilla, tiene que regresar a la posición 0
                indice = 0;
            else                              // si no está en la última casilla, simplemente se incrementa el índice a la sig. casilla
                indice++;
            i++;	   // se incrementa i que controla la cantidad de elementos que hay actualmente en la cola circular
        }
        return s;
    }

    public String buscarEscuela(String palabra){
        String x="";
        int i = 1, indice =frente;
        if(estaVacia()){
            x="";
        }
        else
            while (i <= contador) {     // ciclo para desplegar la cantidad de elemtos que hay en la cola circular
                if (palabra.equals(cc[indice])){
                    x+= cc[indice];
                }
                if (indice == cc.length - 1)// si ya está el índie en la última casilla, tiene que regresar a la posición 0
                    indice = 0;
                else// si no está en la última casilla, simplemente se incrementa el índice a la sig. casilla
                    indice++;
                i++;// se incrementa i que controla la cantidad de elementos que hay actualmente en la cola circular
            }
            return x;

    }

    public String toString() {
        String s="";
        int i= 1, indice = frente;

        while (i <= contador) {     // ciclo para desplegar la cantidad de elemtos que hay en la cola circular
            s+= cc[indice] + "\n";   // se concatena cada elemento de acuerdo al índice en una variable string
            if (indice == cc.length - 1)     // si ya está el índie en la última casilla, tiene que regresar a la posición 0
                indice = 0;
            else                              // si no está en la última casilla, simplemente se incrementa el índice a la sig. casilla
                indice++;
            i++;	   // se incrementa i que controla la cantidad de elementos que hay actualmente en la cola circular
        }
        return s;
    }



}

