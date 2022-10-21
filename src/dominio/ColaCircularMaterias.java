package dominio;

public class ColaCircularMaterias {
    // ATRIBUTOS
    private Materia cc[ ];		   // Este es el vector donde se guardan los datos
    private int frente;             // Apuntador al frente , YA NO SE NECESITA EL APUNTADOR DEL FINAL
    private int contador;        // Ahora el control se maneja a través de un CONTADOR de datos ingresados

    // 1er Constructor crea una cola CIRCULAR de 5 casillas
    public ColaCircularMaterias() {
        cc= new Materia[5];
        frente = 0;
        contador = 0;
    }

    // 2do Constructor crea una cola CIRCULAR con el numero de elementos que se reciben como parámetro
    public ColaCircularMaterias(int num) {
        cc=new Materia [num];
        frente = 0;
        contador = 0;
    }

    // getters
    public Materia[ ] getCc () {
        return cc;
    }

    public int getFrente () {
        return frente;
    }

    public int getContador () {
        return contador;
    }

    // setters
    public void setCc (Materia[] nuevoCc) {
        cc = nuevoCc;
    }

    public void setFrente (int nuevoFrente) {
        frente = nuevoFrente;
    }

    public void setContador (int nuevoCont) {
        contador = nuevoCont;
    }

    //Ahora cuando está VACÍA lo sabemos simplemente porque el CONTADOR de ingresados vale CERO
    public boolean estaVacia ()  {
        if  (contador == 0)
            return true;
        else
            return false;
    }

    // Y para checar si está LLENA también lo podemos saber gracias al CONTADOR de ingresados
    // que se compara contra la cantidad de casillas que tiene el vector
    public boolean estaLlena()  {
        if  ( contador == cc.length)
            return true;
        else
            return false;
    }

    // Devuelve el elemento del frente de la cola CIRCULAR. NO LO ELIMINA
    public Materia elementoEnFrente () {
        if ( estaVacia() )
            return null;
        else
            return cc [frente];
    }

    // Devuelve el elemento del final de la cola CIRCULAR. NO LO ELIMINA
    public Materia elementoEnFin () {
        if ( estaVacia() )
            return null;
        else
            return cc [(frente -1 + contador) % cc.length];
    }

    // Devuelve la cantidad de elementos que hay actualmente en la cola CIRCULAR
    public int numElementos ( ) {
        return contador;
    }

    // Método para insertar un dato x
    public void insertar (Materia x) {
        if ( ! estaLlena () ) {                   // solo podemos insertar si NO está llena
            cc [(frente + contador) % cc.length] = x;    // se calcula la posición donde se insertará x
            contador++;                       // obviamente se incrementa el contador, ya que se insertó un elemento
        }
    }

    // Método para eliminar un dato, devuelve el elemento eliminado ó bien null si no hay datos para borrar
    public String eliminar ( ) {
        Materia eliminado=null;
        int i=1;
        if ( ! estaVacia () ) {
            // solo podemos eliminar si NO está vacía

            while (i <= contador){
            eliminado = cc[frente];          // Dato que se elimina y es el que se devuelve
            cc[frente] = null;                   // se anula el dato de la casilla
            frente = (frente + 1 ) % cc.length;   // se calcula la nueva posición del frente
            contador--;                           // obviamente se decrementa el contador, ya que se eliminó un elemento
        }
        }
        return eliminado.toString();
    }
    public String eliminarTodo () {
        Materia eliminado = null;
        int i = 1;
        if (!estaVacia()) {// solo podemos eliminar si NO está vacía
            while (i <= contador) {
                eliminado = cc[frente];          // Dato que se elimina y es el que se devuelve
                cc[frente] = null;                   // se anula el dato de la casilla
                frente = (frente + 1) % cc.length;   // se calcula la nueva posición del frente
                contador--;                           // obviamente se decrementa el contador, ya que se eliminó un elemento
            }
        }
            return eliminado.toString();
       }

    public float sumacreditos(){
        float suma =0;
        int i=1;
        while (i <= contador){
            suma += cc[i].getCreditos();
        }
        return suma;
    }
    public String MateriaMC (){

        float mayor =0;
        int ind = 0;
        int i=1;
        while (i <= contador){
            if (cc[frente].getCreditos()> mayor){
                mayor = cc[frente].getCreditos();
                ind=i;
            }
        }
        return cc[ind].toString();
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
