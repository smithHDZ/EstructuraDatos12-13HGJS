package dominio;

import javax.swing.*;

public class ListaLinealAlumnos {
    private NodoAlumno inicio;
    private int numNodos;

    // Constructor para crear una lista vacía
    public ListaLinealAlumnos () {
        inicio = null;
        numNodos=0;
    }

    // get...
    public NodoAlumno getInicio ( ) {
        return inicio;
    }

    public int getNumNodos ( ) {
        return numNodos;
    }

    // Método que devuelve true si la lista está vacía
    public boolean listaVacia() {
        if (inicio == null)
            return true;
        else
            return false;
    }
    // Método que inserta un nodo al inicio de la lista
    public void insertaInicio (NodoAlumno nuevo) {
        nuevo.setEnlace(inicio);
        inicio = nuevo;
        numNodos++;
    }
    // Este metodo sirve para insertar un nodo al final de la lista
    public void instertarFinal (NodoAlumno x){
        NodoAlumno r = inicio;
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
        NodoAlumno r = inicio;
        System.out.println("Empieza la lista:\n");
        while (r != null) {
            System.out.println ( r.toString() + "\n");
            r = r.getEnlace();
        }
        System.out.println("Fin de la lista"); }

    public float promedio(){
        NodoAlumno r = inicio;
        float suma =0.0f;
        float promedio ;
        while (r!= null){
            suma += r.getCalificacion();
            r=r.getEnlace();
        }
        return  suma/numNodos;
    }
    public void sumaPuntos(){
        NodoAlumno r = inicio;
        float extra =5;
        while (r!= null){
            if (r.getCalificacion()<=95) {
                r.setCalificacion(r.getCalificacion() + extra);
            }else {
                r.setCalificacion(100);
            }
            r = r.getEnlace();
        }
    }
    /*
    public void eliminarInicio (){
        if(listaVacia()){
            System.out.println("No hay elementos para eliminar");
        }else{
            if(numNodos == 1){
                inicio = null;
            }else{
                NodoAlumno r1 = inicio;
                NodoAlumno r2 = inicio;
                inicio = r1.getEnlace();
                r2.setEnlace(null);
                numNodos--;
            }
        }
    }
     */

    public NodoAlumno eliminaInicio(){
        NodoAlumno borrador=inicio;
        if (!listaVacia()){
            inicio=inicio.getEnlace();
            borrador.setEnlace(null);
            numNodos--;
        }else {
            JOptionPane.showMessageDialog(null, "no hay valores en la lista");
        }
        return borrador;
    }
    public NodoAlumno eliminaUltimo(){
        NodoAlumno ultimo = inicio;
        NodoAlumno recorrer =inicio;
        if (!listaVacia()) {
            if (inicio == null) {
                ultimo.setEnlace(null);
                numNodos--;
            } else {
                while (recorrer != null) {
                    if (recorrer.getEnlace() == null) {
                        ultimo = recorrer;
                        recorrer = recorrer.getEnlace();
                        numNodos--;
                    }
                    ultimo.setEnlace(null);
                }
            }
        }
        return ultimo;
    }



}
