package aplicacion;

import dominio.ArbolBinarioAlumno;
import dominio.NodoArbolBinAlumno;

import javax.swing.*;

public class ExamenU5 {
    public static void main(String[] args) {
        // DECLARACION DE VARIABLES
        int opcion, num, totalOpciones;
        ArbolBinarioAlumno arbol= new ArbolBinarioAlumno();
        String nombre, borrar ="";
        float calificacion;

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Insertar un alumno \n";
        menu += "2.  Mostrar alumnos en PREORDEN \n";
        menu += "3.  Mostrar alumnos en POSTORDEN \n";
        menu += "4.  eliminar un alumno \n";
        menu += "5.  Salir \n";

        totalOpciones = 5;  // ACTUALIZAR SIEMPRE ESTA VARIABLE PARA AJUSTARSE AL TOTAL DE OPCIONES

        // CICLO ITERATIVO QUE PRESENTA EL MENU DE OPCIONES HASTA QUE EL USUARIO SELECCIONE LA OPCION Salir

        do {
            // SE CAPTURA DEL TECLADO UN ENTERO (NUMERO DE LA OPCION) SEGUN EL MENU PRESENTADO
            opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));

            switch (opcion){
                case 1:
                    nombre=JOptionPane.showInputDialog(null,
                            "nombre del alumno");
                    calificacion= Float.parseFloat
                            (JOptionPane.showInputDialog(null,
                            "calificacion del alumno"));
                    arbol.insertarNodo(new NodoArbolBinAlumno(nombre,calificacion));
                    break;
                case 2:
                    if (arbol.estaVacio())
                        JOptionPane.showMessageDialog(null,"No hay alumnos");
                    else
                    JOptionPane.showMessageDialog (null,
                            arbol.preorden(arbol.getRaiz()));
                    break;
                case 3:
                    if (arbol.estaVacio())
                        JOptionPane.showMessageDialog(null,"No hay Alumnos");
                    else
                    JOptionPane.showMessageDialog (null,
                            arbol.postorden(arbol.getRaiz()));
                    break;
                case 4:
                    if (arbol.estaVacio())
                        JOptionPane.showMessageDialog(null,"No hay Alumnos");
                    else
                    borrar=JOptionPane.showInputDialog(null,
                            "Alumno que se desea elimnar");
                    arbol.setRaiz(arbol.eliminar(arbol.getRaiz(),borrar));
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


    }  // FIN DEL METODO main

}

