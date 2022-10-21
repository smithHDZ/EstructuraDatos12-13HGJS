package dominio;

public class ArbolBinario {
    // Atributo (solo la raíz del árbol)
    private NodoArbolBin raiz;

    // Constructor (crea un árbol binario vacío)
    public ArbolBinario ( ) {
        raiz = null;
    }

    // 1 get
    public NodoArbolBin getRaiz ( ) {
        return raiz;
    }

    // 1 set
    public void setRaiz ( NodoArbolBin nuevaRaiz ) {
        raiz = nuevaRaiz;
    }

    // Método para determinar si el árbol vacío
    public boolean estaVacio() {
        if ( raiz == null )
            return true;
        else
            return false;
    }

    // Método PRINCIPAL para insertar un nodo en el árbol
    public void insertarNodo ( NodoArbolBin n) {
        if( estaVacio() ) //si el arbol esta vacio, crea la raiz con este nodo nuevo
            raiz = n;
        else
            insertar(raiz, n); //si ya tiene nodos, busca dónde insertarlo usando un método auxiliar
    }

    // Método AUXILIAR para insertar RECURSIVO agrega < a la izquierda y >= a la derecha
    public void insertar (NodoArbolBin raiz, NodoArbolBin n) {
        if ( raiz.getDato().compareToIgnoreCase(n.getDato() ) >= 0) {
            if ( raiz.getIzquierdo() == null)
                raiz.setIzquierdo (n); // en esta posición inserta un nuevo nodo
            else    // cuando ya tiene hijo izquierdo ese nodo, y no lo puede colgar
                insertar (raiz.getIzquierdo(), n); //se manda llamar a sí mismo para buscar lugar libre
        }
        else {
            if (raiz.getDerecho() == null)
                raiz.setDerecho (n); // en esta posición inserta un nuevo nodo
            else
                insertar (raiz.getDerecho(), n); //se manda llamar a sí mismo para buscar espacio libre
        }

    }

    // devuelve un String con el recorrido PREORDEN del árbol
    public String preorden (NodoArbolBin nodo) {
        if (nodo == null) // caso base o primitiva PARA LA EJECUCIÓN DEL MÉTODO
            return "";
        return nodo.getDato() +"\n"+ preorden(nodo.getIzquierdo()) +  preorden(nodo.getDerecho());
    }

    // devuelve un String con el recorrido INORDEN del árbol
    public String inorden (NodoArbolBin nodo) {
        if (nodo == null) // caso base o primitiva PARA LA EJECUCIÓN DEL MÉTODO
            return "";
        return inorden(nodo.getIzquierdo()) + nodo.getDato() +"\n"+ inorden(nodo.getDerecho());
    }

    // devuelve un String con el recorrido POSTORDEN del árbol
    public String postorden (NodoArbolBin nodo) {
        if (nodo == null)
            return "";
        return postorden(nodo.getIzquierdo()) + postorden(nodo.getDerecho()) + nodo.getDato() +"\n";
    }

    // MÉTODO PRINCIPAL PARA ELIMINAR (RECURSIVO)
    public NodoArbolBin eliminar (NodoArbolBin nodo, String datoBorrar) {
        if (nodo == null)
            return null;
        if (datoBorrar.compareToIgnoreCase(nodo.getDato()) > 0)
            nodo.setDerecho(eliminar(nodo.getDerecho(), datoBorrar));
        else
        if (datoBorrar.compareToIgnoreCase(nodo.getDato()) < 0)
            nodo.setIzquierdo(eliminar(nodo.getIzquierdo(), datoBorrar));
        else
        if (nodo.getIzquierdo() == null && nodo.getDerecho() == null)
            nodo = null;
        else
        if (nodo.getDerecho() != null) {
            nodo.setDato (sucesor(nodo.getDerecho()));
            nodo.setDerecho(eliminar(nodo.getDerecho(),nodo.getDato()));
        }
        else {
            nodo.setDato (predecesor (nodo.getIzquierdo()));
            nodo.setIzquierdo(eliminar(nodo.getIzquierdo(), nodo.getDato()));
        }
        return nodo;
    }
    // 1ER.MÉTODO AUXILIAR PARA ELIMINAR (recursivo)
    private String sucesor (NodoArbolBin nodo) {
        if (nodo.getIzquierdo() == null)
            return nodo.getDato();
        return sucesor (nodo.getIzquierdo()) + "";
    }
    // 2DO.MÉTODO AUXILIAR PARA ELIMINAR (recursivo)
    private String predecesor (NodoArbolBin nodo) {
        if (nodo.getDerecho() == null)
            return nodo.getDato();
        return predecesor (nodo.getDerecho()) + "";
    }

    // faltan más métodos
}
