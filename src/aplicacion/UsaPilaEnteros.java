package aplicacion;
/**
 *
 *   CLASE APLICACION PARA EJEMPLIFICAR
 *   EL USO DE UN MENÚ DE OPCIONES
 *   PRESENTADO ITERATIVAMENTE
 *
 **/

import dominio.PilaInt;

import javax.swing.*;

public class UsaPilaEnteros {
    public static void main(String args [ ]) {
        // DECLARACION DE VARIABLES
        int opcion, num, totalOpciones;
        PilaInt pilaX = new PilaInt(20); //declarar y crear una pila de 5 casillas

        // VARIABLE String  DONDE SE VAN AGREGANDO LAS OPCIONES DEL MENU
        String menu = "             MENU DE OPCIONES \n";
        menu += "1.  Insertar un elemento \n";
        menu += "2.  Eliminar un elemento \n";
        menu += "3.  Mostrar datos \n";
        menu += "4.  Datos en tope \n";
        menu += "5.  Numero de elementos \n";
        menu += "6.  Salir \n";

        totalOpciones = 6;  // ACTUALIZAR SIEMPRE ESTA VARIABLE PARA AJUSTARSE AL TOTAL DE OPCIONES

        // CICLO ITERATIVO QUE PRESENTA EL MENU DE OPCIONES HASTA QUE EL USUARIO SELECCIONE LA OPCION Salir
        do {
            // SE CAPTURA DEL TECLADO UN ENTERO (NUMERO DE LA OPCION) SEGUN EL MENU PRESENTADO
            opcion = Integer.parseInt (JOptionPane.showInputDialog (menu));

            switch (opcion){
                case 1:
                    if (pilaX.estaLlena()) {
                        JOptionPane.showMessageDialog(null,
                                "PILA LLENA NO SE PUEDE INSERTAR");
                    }else {
                        num = Integer.parseInt
                                (JOptionPane.showInputDialog
                                        (null, " Dame un entero "));
                        pilaX.insertar(num); //se inserta en la pila
                        }
                        break;
                case 2:

                    if (pilaX.estaVacia())
                        JOptionPane.showMessageDialog
                                (null,"PILA VACIA no se puede eliminar");
                    else
                    JOptionPane.showMessageDialog
                            (null, "Dato eliminado: " + pilaX.eliminar());

                    break;
                case 3:
                    JOptionPane.showMessageDialog
                            (null, pilaX.toString());
                    break;
                case 4:
                    JOptionPane.showMessageDialog
                            (null, "Elemento en el tope : " + pilaX.datoEnTope());
                    break;
                case 5:
                    JOptionPane.showInputDialog
                            (null,
                                    "Num. de elementos: " + pilaX.numElementos());
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

}  // FIN DE LA CLASE
