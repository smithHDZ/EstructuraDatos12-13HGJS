package aplicacion;

import dominio.ArbolBinario;
import dominio.NodoArbolBin;

import javax.swing.*;

public class EjemploArbolBinario {
    public static void main(String[] args) {
        // DECLARACION DE VARIABLES
        int opcion, num, totalOpciones;

        ArbolBinario tree= new ArbolBinario();//crear un arbol basio
        String s;

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Instertar Nodo \n";
        menu += "2.  Recorrido PreOrden \n";
        menu += "3.  Recorrido InOrden \n";
        menu += "4.  Recorrido PostOrden \n";
        menu += "5.  Eliminar Nodo \n";
        menu += "6.  Salir \n";

        totalOpciones = 6;  // ACTUALIZAR SIEMPRE ESTA VARIABLE PARA AJUSTARSE AL TOTAL DE OPCIONES

        // CICLO ITERATIVO QUE PRESENTA EL MENU DE OPCIONES HASTA QUE EL USUARIO SELECCIONE LA OPCION Salir

        do {
            // SE CAPTURA DEL TECLADO UN ENTERO (NUMERO DE LA OPCION) SEGUN EL MENU PRESENTADO
            opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));

            switch (opcion){
                case 1:
                    s=JOptionPane.showInputDialog(null,
                            "Instroduce un instring");
                    tree.insertarNodo( new NodoArbolBin(s));
                    break;
                case 2:
                    JOptionPane.showMessageDialog (null, tree.preorden(tree.getRaiz()));
                    break;
                case 3:
                    JOptionPane.showMessageDialog (null, tree.inorden(tree.getRaiz()));
                    break;
                case 4:
                    JOptionPane.showMessageDialog (null, tree.postorden(tree.getRaiz()));
                    break;
                case 5 :
                    String borrar;
                    borrar=JOptionPane.showInputDialog(null, "Dime como se llama el nodo");
                    tree.setRaiz(tree.eliminar(tree.getRaiz(),borrar));
                    break;
                case 6:
                    JOptionPane.showMessageDialog
                            (null, "Fin del Programa");
                    break;
                default:
                    JOptionPane.showMessageDialog
                            (null, "Opción NO válida",
                                    " ¡¡¡Error!!!", JOptionPane.ERROR_MESSAGE);
                    break;
            }  //  FIN DEL SWITCH

        } while (opcion != totalOpciones);   // FIN DEL DO..WHILE


    }  // FIN DEL METODO main

}

