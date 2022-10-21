package dominio;

import javax.swing.*;
import java.lang.constant.Constable;

public class Listalibros {
    private NodoLibro inicio;
    private int numNodos;

    // Constructor para crear una lista vacía
    public Listalibros () {
        inicio = null;
        numNodos=0;
    }

    public NodoLibro getInicio (){ return inicio;}

    public int getNumNodos (){return numNodos;}

    // Método que devuelve true si la lista está vacía
    public boolean listaVacia() {
        if (inicio == null)
            return true;
        else
            return false;
    }

    // Método que inserta un nodo al inicio de la lista
    public void insertaInicio (NodoLibro nuevo) {
        nuevo.setEnlace(inicio);
        inicio = nuevo;
        numNodos++;
    }

    // Este metodo sirve para insertar un nodo al final de la lista
    public void instertarFinal (NodoLibro x){
        NodoLibro r = inicio;
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

    //recorre toda la lista
    public void recorreLista() {
        NodoLibro r = inicio;
        System.out.println("Empieza la lista:\n");
        while (r != null) {
            System.out.println ( r.toString() + "\n");
            r = r.getEnlace();
        }
        System.out.println("Fin de la lista"); }

    //meotodo para eliminar el primer nodo de la lista
    public NodoLibro eliminaInicio(){
        NodoLibro borrador=inicio;
        if (!listaVacia()){
            inicio=inicio.getEnlace();
            borrador.setEnlace(null);
            numNodos--;
        }else {
            JOptionPane.showMessageDialog(null, "no hay valores en la lista");
        }
        return borrador;
    }

    public NodoLibro eliminarFinal() {
        NodoLibro recorrer = inicio.getEnlace(), penultimo = inicio;
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

    //revision de precio
    public void mayorPrecio(){
        NodoLibro r = inicio;
        float mayor =0;
        while (r!=null){
            if (r.getPrecio()>400){
                r.toString();
            }
            r=r.getEnlace();
        }
    }

    public int buscarLibro (String n){
        NodoLibro r = inicio;
        int posicion =0;
        boolean encontro=false;
        if (listaVacia()){
            posicion=0;
        }else {
         while (r!=null) {
             posicion++;
            if (n.equalsIgnoreCase(r.getTitulo())) {
                encontro = true;
                break;
            }else{
                r = r.getEnlace();
                System.out.println(posicion);
            }
         }
        }
          if(encontro==false){
              posicion=0;
          }
         return posicion;
    }

    public String libroMenorPrecio(){
        NodoLibro recorrer = inicio;
        //cunado estas buscando el menor la variable con la que vas a comparar a las demas
        // es recomendable poner un numero muy grande
        float menor = 99999;
        //si quieres hacerlo con el mayor tienes qeu iniciabilizaarll con una cantidad muy pequeña
        String titulo="";
        if (listaVacia()){
            titulo=null;
        }else{
         if (numNodos==1){
             titulo=inicio.getTitulo();
         }  else{
         while (recorrer!=null) {
             //al momento de comparar este es cuando es menor
             //si quieres sacar el mayor solo cambia el signo <
             if (menor > recorrer.getPrecio()) {
                 menor = recorrer.getPrecio();
                 titulo= recorrer.getTitulo();
             }
             recorrer = recorrer.getEnlace();
            }
         }
        }
        return titulo;
    }



    public String toString() {
        NodoLibro r = inicio;
        String cadena = "";
        while(r != null){
            cadena += r.toString();
            r = r.getEnlace();
        }
        return cadena;
    }




}
