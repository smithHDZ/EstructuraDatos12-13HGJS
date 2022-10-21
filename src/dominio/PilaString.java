package dominio;

public class PilaString {
    private String p[];
    private int tope;

    // 1er. constructor, genera una pila de 5 casillas
    public PilaString() {
        p = new String[5]; // se crea el vector (pila)
        tope = -1; // pila está vacía, por lo que se inicializa el tope
    }

    // 2do. constructor, genera una pila de tamaño n
    public PilaString(int n) {
        p = new String[n]; // se crea el vector (pila) de n casillas
        tope = -1; // igual, se inicializa el tope
    }

    public String[] getP() {
        return p;
    }

    public void setP(String p[]) {
        this.p = p;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    // método que checa si la pila está vacía
    public boolean estaVacia() {
        if (tope == -1) // checa si el tope no señala a ninguna casilla
        {
            return true;
        } else {
            return false;
        }
    }

    //método que checa si la pila está llena
    public boolean estaLlena() {
        if (tope == p.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    //inserta un elemento en la pila
    public void insertar(String nuevo) {
        // checa que la pila NO esté llena
        if (!estaLlena()) {
            tope++; // mueve el tope a la sig. casilla libre
            p[tope] = nuevo; // guarda el dato en el tope de la pila
        }
    }

    // elimina un elemento de la pila
    public String eliminar() {
        String borrado = " "; // variable que devuelve el dato borrado
        if (!estaVacia()) {
            borrado = p[tope]; // se saca el dato del tope
            p[tope] = ""; // se borra físicamente la casilla
            tope--; // se decrementa el tope
        }

        return borrado; // se devuelve el valor eliminado
    }

    // devuelve el elemento del tope, pero NO LO ELIMINA
    public String datoEnTope() {
        if (!estaVacia()) {
            return p[tope];
        } else {
            return "";
        }
    }

    // devuelve el número de elementos que hay actualmente en la pila
    public int numElementos() {
        return tope + 1;
    }

    public String toString() {
        String s = "Elementos en la pila: \n";
        int i;

        for (i = tope; i >= 0; i--) {
            s += p[i] + "\n";
        }

        s += "Fin de la pila";

        return s;
    }
}
