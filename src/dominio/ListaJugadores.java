package dominio;

import javax.swing.*;

public class ListaJugadores {
    private NodoJugador inicio;
    private int numNodos;

    public ListaJugadores(){
        inicio=null;
        numNodos=0;
    }

    public NodoJugador getInicio(){return inicio;}
    public int getNumNodos (){return numNodos;}

    // Método que devuelve true si la lista está vacía
    public boolean listaVacia() {
        if (inicio == null)
            return true;
        else
            return false;
    }

    // Método que inserta un nodo al inicio de la lista
    public void insertaInicio (NodoJugador nuevo) {
        nuevo.setEnlace(inicio);
        inicio = nuevo;
        numNodos++;
    }

    // Este metodo sirve para insertar un nodo al final de la lista
    public void instertarFinal (NodoJugador x){
        NodoJugador r = inicio;
        if (listaVacia()){
            inicio=x;
        }else{
            //este ciclo encunetra el ultimo nodo
            while (r.getEnlace() != null){
                r=r.getEnlace();
            }
            r.setEnlace(x);
        }
        numNodos++;
    }

    public void recorreLista() {
        NodoJugador r = inicio;
        System.out.println("Empieza la lista:\n");
        while (r != null) {
            System.out.println ( r.toString() + "\n");
            r = r.getEnlace();
        }
        System.out.println("Fin de la lista");
    }

    //meotodo para eliminar el primer nodo de la lista
    public NodoJugador eliminaInicio(){
        NodoJugador borrador=inicio;
        if (!listaVacia()){
            inicio=inicio.getEnlace();
            borrador.setEnlace(null);
            numNodos--;
        }else {
            JOptionPane.showMessageDialog(null, "no hay valores en la lista");
        }
        return borrador;
    }

    public NodoJugador eliminarFinal() {
        NodoJugador recorrer = inicio.getEnlace(), penultimo = inicio;
        if(!listaVacia()) {
            if(numNodos == 1) {
                recorrer = inicio;
                inicio = null;
                numNodos--;
            } else {
                while(recorrer.getEnlace() != null) {
                    recorrer = recorrer.getEnlace();
                    penultimo = penultimo.getEnlace();
                }
                penultimo.setEnlace(null);
            }
        }
        return recorrer;
    }

    public float totalGoles(){
        NodoJugador r= inicio;
        float suma = 0;
        if (listaVacia()){
            suma=0;
        }else{
            while (r!=null){
                suma+= r.getGoles();
                r=r.getEnlace();
            }
        }
        return suma;
    }

    public String mejorjugador(){
        NodoJugador recorrer =inicio;
        float mayor=-1;
        String jugador="";
        if (listaVacia()){
            jugador=null;
        }else {
            if (numNodos==1){
                jugador=inicio.getNombre();
            }else{
                while (recorrer!=null){
                    if (mayor< recorrer.getGoles()){
                        mayor= recorrer.getGoles();
                        jugador= recorrer.getNombre();
                    }
                    recorrer=recorrer.getEnlace();
                }
            }
        }
        return jugador;
    }

    //METODO INCOMPLETO E INCONCLUSO
    public String eliminarJugador (String n){
        NodoJugador recorrer = inicio.getEnlace(),
                penultimo = inicio;
        String jugador ="";
        if (listaVacia()) {
            jugador = null;
        }else{
            while (recorrer!=null){
                if (n.equalsIgnoreCase(recorrer.getNombre())){
                    recorrer = recorrer.getEnlace();
                    penultimo = penultimo.getEnlace();
                    jugador=recorrer.getNombre();
                }
                penultimo.setEnlace(recorrer);
            }
        }
        return jugador;
    }


    public String toString() {
        NodoJugador r = inicio;
        String cadena = "";
        while(r != null){
            cadena += r.toString();
            r = r.getEnlace();
        }
        return cadena;
    }



}
