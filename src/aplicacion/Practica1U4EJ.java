package aplicacion;
import dominio.ListaLineal;
import dominio.Nodo;

import javax.swing.*;
//practica de la unidad 4 sobre listas
/*
CLASE PARA USAR LISTA ENLAZADA
 */
public class Practica1U4EJ {
    public static void main(String[] args) {

        // DECLARACION DE VARIABLES
        ListaLineal lis= new ListaLineal();
        Nodo n;
        String d1;
        float d2;
        int opcion, num, totalOpciones;

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.   Insertar un nodo a al INICIO\n";
        menu += "2.   Insertar al final" ;
        menu += "3.   Mostar nodos de la lista\n";
        menu += "4.   Numero de nodos\n";

        menu += "5.   Salir \n";

        totalOpciones = 5; 
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    //leer los datos que van a conformar el nodo
                    d1=JOptionPane.showInputDialog(null,"Dame el dato 1");
                    d2= Float.parseFloat(JOptionPane.showInputDialog(null, "dame el dato 2"));
                    //se necesita crear el nodo
                    n= new Nodo(d1,d2);
                    //ahora insertaremos el nodo en la lista AL INICIO
                    lis.insertaInicio(n);
                    break;
                case 2:
                    d1=JOptionPane.showInputDialog(null,"Dame el dato 1");
                    d2= Float.parseFloat(JOptionPane.showInputDialog(null, "dame el dato 2"));
                    //se necesita crear el nodo
                    n= new Nodo(d1,d2);
                    //ahora insertaremos el nodo en la lista AL FINAL
                    lis.instertarFinal(n);
                    break;
                case 3:
                    lis.recorreLista();
                    break;
                case 4:
                    JOptionPane.showMessageDialog
                            (null, "hay " +  lis.getNumNodos() + " nodos ");
                    break;

                case 5:
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

    }
}
